package typings.dojo.dojo.data

import typings.dojo.dojo.data.api.Item
import typings.dojo.dojo.data.api.Read
import typings.dojo.dojo.data.api.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojo.data.api")
@js.native
object api extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/api/Identity.html
    *
    * This is an abstract API that data provider implementations conform to.
    * This file defines methods signatures and intentionally leaves all the
    * methods unimplemented.
    *
    */
  @js.native
  class Identity () extends Read {
    /**
      * Given the identity of an item, this method returns the item that has
      * that identity through the onItem callback.  Conforming implementations
      * should return null if there is no item with the given identity.
      * Implementations of fetchItemByIdentity() may sometimes return an item
      * from a local cache and may sometimes fetch an item from a remote server,
      *
      * @param keywordArgs An anonymous object that defines the item to locate and callbacks to invoke when theitem has been located and load has completed.  The format of the object is as follows:{    identity: string|object,    onItem: Function,    onError: Function,    scope: object}The identity parameterThe identity parameter is the identity of the item you wish to locate and loadThis attribute is required.  It should be a string or an object that toString()can be called on.The onItem parameterFunction(item)The onItem parameter is the callback to invoke when the item has been loaded.  It takes only oneparameter, the item located, or null if none found.The onError parameterFunction(error)The onError parameter is the callback to invoke when the item load encountered an error.  It takes only oneparameter, the error objectThe scope parameterIf a scope object is provided, all of the callback functions (onItem,onError, etc) will be invoked in the context of the scope object.In the body of the callback function, the value of the "this"keyword will be the scope object.   If no scope object is provided,the callback functions will be called in the context of dojo.global.For example, onItem.call(scope, item, request) vs.onItem.call(dojo.global, item, request)
      */
    def fetchItemByIdentity(keywordArgs: js.Object): Unit = js.native
    /**
      * Returns a unique identifier for an item.  The return value will be
      * either a string or something that has a toString() method (such as,
      * for example, a dojox/uuid object).
      *
      * @param item The item from the store from which to obtain its identifier.
      */
    def getIdentity(item: Item): Unit = js.native
    /**
      * Returns an array of attribute names that are used to generate the identity.
      * For most stores, this is a single attribute, but for some complex stores
      * such as RDB backed stores that use compound (multi-attribute) identifiers
      * it can be more than one.  If the identity is not composed of attributes
      * on the item, it will return null.  This function is intended to identify
      * the attributes that comprise the identity so that so that during a render
      * of all attributes, the UI can hide the the identity information if it
      * chooses.
      *
      * @param item The item from the store from which to obtain the array of public attributes thatcompose the identifier, if any.
      */
    def getIdentityAttributes(item: Item): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/api/Item.html
    *
    * An item in a dojo/data store
    * Class for documentation purposes only. An item can take any form, so no
    * properties or methods are defined here.
    *
    */
  @js.native
  class Item () extends js.Object
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/api/Notification.html
    *
    * This is an abstract API that data provider implementations conform to.
    * This file defines functions signatures and intentionally leaves all the
    * functions unimplemented.
    * This API defines a set of APIs that all datastores that conform to the
    * Notifications API must implement.  In general, most stores will implement
    * these APIs as no-op functions for users who wish to monitor them to be able
    * to connect to then via dojo.connect().  For non-users of dojo.connect,
    * they should be able to just replace the function on the store to obtain
    *  notifications.  Both read-only and read-write stores may implement
    * this feature.  In the case of a read-only store, this feature makes sense if
    * the store itself does internal polling to a back-end server and periodically updates
    * its cache of items (deletes, adds, and updates).
    *
    */
  @js.native
  class Notification () extends Read {
    /**
      * This function is called any time an item is deleted from the store.
      * It is called immediately after the store deleteItem processing has completed.
      * This function is called any time an item is deleted from the store.
      * It is called immediately after the store deleteItem processing has completed.
      *
      * @param deletedItem The item deleted.
      */
    def onDelete(deletedItem: Item): js.Any = js.native
    /**
      * This function is called any time a new item is created in the store.
      * It is called immediately after the store newItem processing has completed.
      * This function is called any time a new item is created in the store.
      * It is called immediately after the store newItem processing has completed.
      *
      * @param newItem The item created.
      * @param parentInfo               OptionalAn optional javascript object that is passed when the item created was placed in the storehierarchy as a value f another item's attribute, instead of a root level item.  Note that if thisfunction is invoked with a value for parentInfo, then onSet is not invoked stating the attribute ofthe parent item was modified.  This is to avoid getting two notification  events occurring when a new itemwith a parent is created.  The structure passed in is as follows:{    item: someItem,                         //The parent item    attribute:  "attribute-name-string",    //The attribute the new item was assigned to.    oldValue: something //Whatever was the previous value for the attribute.                //If it is a single-value attribute only, then this value will be a single value.                //If it was a multi-valued attribute, then this will be an array of all the values minus the new one.    newValue: something //The new value of the attribute.  In the case of single value calls, such as setValue, this value will be                //generally be an atomic value of some sort (string, int, etc, object).  In the case of multi-valued attributes,                //it will be an array.}
      */
    def onNew(newItem: Item): js.Any = js.native
    def onNew(newItem: Item, parentInfo: js.Object): js.Any = js.native
    /**
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * Its purpose is to provide a hook point for those who wish to monitor actions on items in the store
      * in a simple manner.  The general expected usage is to dojo.connect() to the store's
      * implementation and be called after the store function is called.
      *
      * @param item The item being modified.
      * @param attribute The attribute being changed represented as a string name.
      * @param oldValue The old value of the attribute.  In the case of single value calls, such as setValue, unsetAttribute, etc,this value will be generally be an atomic value of some sort (string, int, etc, object).  In the case ofmulti-valued attributes, it will be an array.
      * @param newValue The new value of the attribute.  In the case of single value calls, such as setValue, this value will begenerally be an atomic value of some sort (string, int, etc, object).  In the case of multi-valued attributes,it will be an array.  In the case of unsetAttribute, the new value will be 'undefined'.
      */
    def onSet(item: Item, attribute: String, oldValue: js.Array[_], newValue: js.Array[_]): js.Any = js.native
    /**
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * Its purpose is to provide a hook point for those who wish to monitor actions on items in the store
      * in a simple manner.  The general expected usage is to dojo.connect() to the store's
      * implementation and be called after the store function is called.
      *
      * @param item The item being modified.
      * @param attribute The attribute being changed represented as a string name.
      * @param oldValue The old value of the attribute.  In the case of single value calls, such as setValue, unsetAttribute, etc,this value will be generally be an atomic value of some sort (string, int, etc, object).  In the case ofmulti-valued attributes, it will be an array.
      * @param newValue The new value of the attribute.  In the case of single value calls, such as setValue, this value will begenerally be an atomic value of some sort (string, int, etc, object).  In the case of multi-valued attributes,it will be an array.  In the case of unsetAttribute, the new value will be 'undefined'.
      */
    def onSet(item: Item, attribute: String, oldValue: js.Array[_], newValue: js.Object): js.Any = js.native
    /**
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * Its purpose is to provide a hook point for those who wish to monitor actions on items in the store
      * in a simple manner.  The general expected usage is to dojo.connect() to the store's
      * implementation and be called after the store function is called.
      *
      * @param item The item being modified.
      * @param attribute The attribute being changed represented as a string name.
      * @param oldValue The old value of the attribute.  In the case of single value calls, such as setValue, unsetAttribute, etc,this value will be generally be an atomic value of some sort (string, int, etc, object).  In the case ofmulti-valued attributes, it will be an array.
      * @param newValue The new value of the attribute.  In the case of single value calls, such as setValue, this value will begenerally be an atomic value of some sort (string, int, etc, object).  In the case of multi-valued attributes,it will be an array.  In the case of unsetAttribute, the new value will be 'undefined'.
      */
    def onSet(item: Item, attribute: String, oldValue: js.Object, newValue: js.Array[_]): js.Any = js.native
    /**
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * This function is called any time an item is modified via setValue, setValues, unsetAttribute, etc.
      * Its purpose is to provide a hook point for those who wish to monitor actions on items in the store
      * in a simple manner.  The general expected usage is to dojo.connect() to the store's
      * implementation and be called after the store function is called.
      *
      * @param item The item being modified.
      * @param attribute The attribute being changed represented as a string name.
      * @param oldValue The old value of the attribute.  In the case of single value calls, such as setValue, unsetAttribute, etc,this value will be generally be an atomic value of some sort (string, int, etc, object).  In the case ofmulti-valued attributes, it will be an array.
      * @param newValue The new value of the attribute.  In the case of single value calls, such as setValue, this value will begenerally be an atomic value of some sort (string, int, etc, object).  In the case of multi-valued attributes,it will be an array.  In the case of unsetAttribute, the new value will be 'undefined'.
      */
    def onSet(item: Item, attribute: String, oldValue: js.Object, newValue: js.Object): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/api/Read.html
    *
    * This is an abstract API that data provider implementations conform to.
    * This file defines methods signatures and intentionally leaves all the
    * methods unimplemented.  For more information on the dojo.data APIs,
    * please visit: http://www.dojotoolkit.org/node/98
    *
    */
  @js.native
  class Read () extends js.Object {
    /**
      * The close() method is intended for instructing the store to 'close' out
      * any information associated with a particular request.
      * The close() method is intended for instructing the store to 'close' out
      * any information associated with a particular request.  In general, this API
      * expects to receive as a parameter a request object returned from a fetch.
      * It will then close out anything associated with that request, such as
      * clearing any internal datastore caches and closing any 'open' connections.
      * For some store implementations, this call may be a no-op.
      *
      * @param request               OptionalAn instance of a request for the store to use to identify what to close out.If no request is passed, then the store should clear all internal caches (if any)and close out all 'open' connections.  It does not render the store unusable fromthere on, it merely cleans out any current data and resets the store to initialstate.
      */
    def close(): Unit = js.native
    def close(request: js.Object): Unit = js.native
    def close(request: Request): Unit = js.native
    /**
      * Returns true if the given value is one of the values that getValues()
      * would return.
      *
      * @param item The item to access values on.
      * @param attribute The attribute to access represented as a string.
      * @param value The value to match as a value for the attribute.
      */
    def containsValue(item: Item, attribute: String, value: js.Any): Unit = js.native
    /**
      * Given a query and set of defined options, such as a start and count of items to return,
      * this method executes the query and makes the results available as data items.
      * The format and expectations of stores is that they operate in a generally asynchronous
      * manner, therefore callbacks are always used to return items located by the fetch parameters.
      * A Request object will always be returned and is returned immediately.
      * The basic request is nothing more than the keyword args passed to fetch and
      * an additional function attached, abort().  The returned request object may then be used
      * to cancel a fetch.  All data items returns are passed through the callbacks defined in the
      * fetch parameters and are not present on the 'request' object.
      *
      * This does not mean that custom stores can not add methods and properties to the request object
      * returned, only that the API does not require it.  For more info about the Request API,
      * see dojo/data/api/Request
      *
      * @param keywordArgs The keywordArgs parameter may either be an instance ofconforming to dojo/data/api/Request or may be a simple anonymous objectthat may contain any of the following:{    query: query-object or query-string,    queryOptions: object,    onBegin: Function,    onItem: Function,    onComplete: Function,    onError: Function,    scope: object,    start: int    count: int    sort: array}All implementations should accept keywordArgs objects with any ofthe 9 standard properties: query, onBegin, onItem, onComplete, onErrorscope, sort, start, and count.  Some implementations may accept additionalproperties in the keywordArgs object as valid parameters, such as{includeOutliers:true}.The query parameterThe query may be optional in some data store implementations.The dojo/data/api/Read API does not specify the syntax or semanticsof the query itself -- each different data store implementationmay have its own notion of what a query should look like.However, as of dojo 0.9, 1.0, and 1.1, all the provided datastores in dojo.dataand dojox.data support an object structure query, where the object is a set ofname/value parameters such as { attrFoo: valueBar, attrFoo1: valueBar1}.  Most of thedijit widgets, such as ComboBox assume this to be the case when working with a datastorewhen they dynamically update the query.  Therefore, for maximum compatibility with dijitwidgets the recommended query parameter is a key/value object.  That does not mean that thethe datastore may not take alternative query forms, such as a simple string, a Date, a number,or a mix of such.  Ultimately, The dojo/data/api/Read API is agnostic about what the queryformat.Further note:  In general for query objects that accept strings as attributevalue matches, the store should also support basic filtering capability, such as (match any character) and ? (match single character).  An example query that is a query objectwould be like: { attrFoo: "value"}.  Which generally means match all items where they havean attribute named attrFoo, with a value that starts with 'value'.The queryOptions parameterThe queryOptions parameter is an optional parameter used to specify options that may modifythe query in some fashion, such as doing a case insensitive search, or doing a deep searchwhere all items in a hierarchical representation of data are scanned instead of just the rootitems.  It currently defines two options that all datastores should attempt to honor if possible:{    ignoreCase: boolean, // Whether or not the query should match case sensitively or not.  Default behaviour is false.    deep: boolean   // Whether or not a fetch should do a deep search of items and all child                    // items instead of just root-level items in a datastore.  Default is false.}The onBegin parameter.function(size, request);If an onBegin callback function is provided, the callback functionwill be called just once, before the first onItem callback is called.The onBegin callback function will be passed two arguments, thethe total number of items identified and the Request object.  If the total number isunknown, then size will be -1.  Note that size is not necessarily the size of thecollection of items returned from the query, as the request may have specified to return only asubset of the total set of items through the use of the start and count parameters.The onItem parameter.function(item, request);If an onItem callback function is provided, the callback functionwill be called as each item in the result is received. The callbackfunction will be passed two arguments: the item itself, and theRequest object.The onComplete parameter.function(items, request);If an onComplete callback function is provided, the callback functionwill be called just once, after the last onItem callback is called.Note that if the onItem callback is not present, then onComplete will be passedan array containing all items which matched the query and the request object.If the onItem callback is present, then onComplete is called as:onComplete(null, request).The onError parameter.function(errorData, request);If an onError callback function is provided, the callback functionwill be called if there is any sort of error while attempting toexecute the query.The onError callback function will be passed two arguments:an Error object and the Request object.The scope parameter.If a scope object is provided, all of the callback functions (onItem,onComplete, onError, etc) will be invoked in the context of the scopeobject.  In the body of the callback function, the value of the "this"keyword will be the scope object.   If no scope object is provided,the callback functions will be called in the context of dojo.global().For example, onItem.call(scope, item, request) vs.onItem.call(dojo.global(), item, request)The start parameter.If a start parameter is specified, this is a indication to the datastore toonly start returning items once the start number of items have been located andskipped.  When this parameter is paired with 'count', the store should be ableto page across queries with millions of hits by only returning subsets of thehits for each queryThe count parameter.If a count parameter is specified, this is a indication to the datastore toonly return up to that many items.  This allows a fetch call that may havemillions of item matches to be paired down to something reasonable.The sort parameter.If a sort parameter is specified, this is a indication to the datastore tosort the items in some manner before returning the items.  The array is an array ofjavascript objects that must conform to the following format to be applied to thefetching of items:{    attribute: attribute || attribute-name-string,    descending: true|false;   // Optional.  Default is false.}Note that when comparing attributes, if an item contains no value for the attribute(undefined), then it the default ascending sort logic should push it to the bottomof the list.  In the descending order case, it such items should appear at the top of the list.
      */
    def fetch(keywordArgs: js.Object): js.Any = js.native
    /**
      * Returns an array with all the attributes that this item has.  This
      * method will always return an array; if the item has no attributes
      * at all, getAttributes() will return an empty array: [].
      *
      * @param item The item to access attributes on.
      */
    def getAttributes(item: Item): Unit = js.native
    /**
      * The getFeatures() method returns an simple keyword values object
      * that specifies what interface features the datastore implements.
      * A simple CsvStore may be read-only, and the only feature it
      * implements will be the 'dojo/data/api/Read' interface, so the
      * getFeatures() method will return an object like this one:
      * {'dojo.data.api.Read': true}.
      * A more sophisticated datastore might implement a variety of
      * interface features, like 'dojo.data.api.Read', 'dojo/data/api/Write',
      * 'dojo.data.api.Identity', and 'dojo/data/api/Attribution'.
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * Method to inspect the item and return a user-readable 'label' for the item
      * that provides a general/adequate description of what the item is.
      * Method to inspect the item and return a user-readable 'label' for the item
      * that provides a general/adequate description of what the item is.  In general
      * most labels will be a specific attribute value or collection of the attribute
      * values that combine to label the item in some manner.  For example for an item
      * that represents a person it may return the label as:  "firstname lastlame" where
      * the firstname and lastname are attributes on the item.  If the store is unable
      * to determine an adequate human readable label, it should return undefined.  Users that wish
      * to customize how a store instance labels items should replace the getLabel() function on
      * their instance of the store, or extend the store and replace the function in
      * the extension class.
      *
      * @param item The item to return the label for.
      */
    def getLabel(item: Item): js.Any = js.native
    /**
      * Method to inspect the item and return an array of what attributes of the item were used
      * to generate its label, if any.
      * Method to inspect the item and return an array of what attributes of the item were used
      * to generate its label, if any.  This function is to assist UI developers in knowing what
      * attributes can be ignored out of the attributes an item has when displaying it, in cases
      * where the UI is using the label as an overall identifer should they wish to hide
      * redundant information.
      *
      * @param item The item to return the list of label attributes for.
      */
    def getLabelAttributes(item: Item): js.Any = js.native
    /**
      * Returns a single attribute value.
      * Returns defaultValue if and only if item does not have a value for attribute.
      * Returns null if and only if null was explicitly set as the attribute value.
      * Returns undefined if and only if the item does not have a value for the
      * given attribute (which is the same as saying the item does not have the attribute).
      * Saying that an "item x does not have a value for an attribute y"
      * is identical to saying that an "item x does not have attribute y".
      * It is an oxymoron to say "that attribute is present but has no values"
      * or "the item has that attribute but does not have any attribute values".
      * If store.hasAttribute(item, attribute) returns false, then
      * store.getValue(item, attribute) will return undefined.
      *
      * @param item The item to access values on.
      * @param attribute The attribute to access represented as a string.
      * @param defaultValue               OptionalOptional.  A default value to use for the getValue return in the attribute does not exist or has no value.
      */
    def getValue(item: Item, attribute: String): js.Any = js.native
    def getValue(item: Item, attribute: String, defaultValue: js.Any): js.Any = js.native
    /**
      * This getValues() method works just like the getValue() method, but getValues()
      * always returns an array rather than a single attribute value.  The array
      * may be empty, may contain a single attribute value, or may contain
      * many attribute values.
      * If the item does not have a value for the given attribute, then getValues()
      * will return an empty array: [].  (So, if store.hasAttribute(item, attribute)
      * has a return of false, then store.getValues(item, attribute) will return [].)
      *
      * @param item The item to access values on.
      * @param attribute The attribute to access represented as a string.
      */
    def getValues(item: Item, attribute: String): js.Any = js.native
    /**
      * Returns true if the given item has a value for the given attribute.
      *
      * @param item The item to access attributes on.
      * @param attribute The attribute to access represented as a string.
      */
    def hasAttribute(item: Item, attribute: String): Unit = js.native
    /**
      * Returns true if something is an item and came from the store instance.
      * Returns false if something is a literal, an item from another store instance,
      * or is any object other than an item.
      *
      * @param something Can be anything.
      */
    def isItem(something: js.Any): Unit = js.native
    /**
      * Returns false if isItem(something) is false.  Returns false if
      * if isItem(something) is true but the the item is not yet loaded
      * in local memory (for example, if the item has not yet been read
      * from the server).
      *
      * @param something Can be anything.
      */
    def isItemLoaded(something: js.Any): Unit = js.native
    /**
      * Given an item, this method loads the item so that a subsequent call
      * to store.isItemLoaded(item) will return true.  If a call to
      * isItemLoaded() returns true before loadItem() is even called,
      * then loadItem() need not do any work at all and will not even invoke
      * the callback handlers.  So, before invoking this method, check that
      * the item has not already been loaded.
      *
      * @param keywordArgs An anonymous object that defines the item to load and callbacks to invoke when theload has completed.  The format of the object is as follows:{    item: object,    onItem: Function,    onError: Function,    scope: object}The item parameterThe item parameter is an object that represents the item in question that should becontained by the store.  This attribute is required.The onItem parameterFunction(item)The onItem parameter is the callback to invoke when the item has been loaded.  It takes only oneparameter, the fully loaded item.The onError parameterFunction(error)The onError parameter is the callback to invoke when the item load encountered an error.  It takes only oneparameter, the error objectThe scope parameterIf a scope object is provided, all of the callback functions (onItem,onError, etc) will be invoked in the context of the scope object.In the body of the callback function, the value of the "this"keyword will be the scope object.   If no scope object is provided,the callback functions will be called in the context of dojo.global().For example, onItem.call(scope, item, request) vs.onItem.call(dojo.global(), item, request)
      */
    def loadItem(keywordArgs: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/api/Request.html
    *
    * This class defines out the semantics of what a 'Request' object looks like
    * when returned from a fetch() method.  In general, a request object is
    * nothing more than the original keywordArgs from fetch with an abort function
    * attached to it to allow users to abort a particular request if they so choose.
    * No other functions are required on a general Request object return.  That does not
    * inhibit other store implementations from adding extensions to it, of course.
    *
    * This is an abstract API that data provider implementations conform to.
    * This file defines methods signatures and intentionally leaves all the
    * methods unimplemented.
    *
    * For more details on fetch, see dojo/data/api/Read.fetch().
    *
    */
  @js.native
  class Request () extends js.Object {
    /**
      * This function is a hook point for stores to provide as a way for
      * a fetch to be halted mid-processing.
      * This function is a hook point for stores to provide as a way for
      * a fetch to be halted mid-processing.  For more details on the fetch() api,
      * please see dojo/data/api/Read.fetch().
      *
      */
    def abort(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/api/Write.html
    *
    * This is an abstract API that data provider implementations conform to.
    * This file defines function signatures and intentionally leaves all the
    * functions unimplemented.
    *
    */
  @js.native
  class Write () extends Read {
    /**
      * Deletes an item from the store.
      *
      * @param item The item to delete.
      */
    def deleteItem(item: Item): Unit = js.native
    /**
      * Given an item, isDirty() returns true if the item has been modified
      * since the last save().  If isDirty() is called with no item argument,
      * then this function returns true if any item has been modified since
      * the last save().
      *
      * @param item               OptionalThe item to check.
      */
    def isDirty(): Unit = js.native
    def isDirty(item: js.Any): Unit = js.native
    /**
      * Returns a newly created item.  Sets the attributes of the new
      * item based on the keywordArgs provided.  In general, the attribute
      * names in the keywords become the attributes in the new item and as for
      * the attribute values in keywordArgs, they become the values of the attributes
      * in the new item.  In addition, for stores that support hierarchical item
      * creation, an optional second parameter is accepted that defines what item is the parent
      * of the new item and what attribute of that item should the new item be assigned to.
      * In general, this will assume that the attribute targeted is multi-valued and a new item
      * is appended onto the list of values for that attribute.
      *
      * @param keywordArgs               OptionalA javascript object defining the initial content of the item as a set of JavaScript 'property name: value' pairs.
      * @param parentInfo               OptionalAn optional javascript object defining what item is the parent of this item (in a hierarchical store.  Not all stores do hierarchical items),and what attribute of that parent to assign the new item to.  If this is present, and the attribute specifiedis a multi-valued attribute, it will append this item into the array of values for that attribute.  The structureof the object is as follows:{    parent: someItem,    attribute: "attribute-name-string"}
      */
    def newItem(): Unit = js.native
    def newItem(keywordArgs: js.Object): Unit = js.native
    def newItem(keywordArgs: js.Object, parentInfo: js.Object): Unit = js.native
    /**
      * Discards any unsaved changes.
      * Discards any unsaved changes.
      *
      */
    def revert(): Unit = js.native
    /**
      * Saves to the server all the changes that have been made locally.
      * The save operation may take some time and is generally performed
      * in an asynchronous fashion.  The outcome of the save action is
      * is passed into the set of supported callbacks for the save.
      *
      * @param keywordArgs {    onComplete: function    onError: function    scope: object} ####The *onComplete* parameter. function(); If an onComplete callback function is provided, the callback function will be called just once, after the save has completed.  No parameters are generally passed to the onComplete. ####The *onError* parameter. function(errorData); If an onError callback function is provided, the callback function will be called if there is any sort of error while attempting to execute the save.  The onError function will be based one parameter, the error. ####The *scope* parameter. If a scope object is provided, all of the callback function ( onComplete, onError, etc) will be invoked in the context of the scope object.  In the body of the callback function, the value of the "this" keyword will be the scope object.   If no scope object is provided, the callback functions will be called in the context of dojo.global. For example, onComplete.call(scope) vs. onComplete.call(dojo.global)
      */
    def save(keywordArgs: js.Object): js.Any = js.native
    /**
      * Sets the value of an attribute on an item.
      * Replaces any previous value or values.
      *
      * @param item The item to modify.
      * @param attribute The attribute of the item to change represented as a string name.
      * @param value The value to assign to the item.
      */
    def setValue(item: Item, attribute: String, value: js.Any): Unit = js.native
    /**
      * Adds each value in the values array as a value of the given
      * attribute on the given item.
      * Replaces any previous value or values.
      * Calling store.setValues(x, y, []) (with values as an empty array) has
      * the same effect as calling store.unsetAttribute(x, y).
      *
      * @param item The item to modify.
      * @param attribute The attribute of the item to change represented as a string name.
      * @param values An array of values to assign to the attribute..
      */
    def setValues(item: Item, attribute: String, values: js.Array[_]): Unit = js.native
    /**
      * Deletes all the values of an attribute on an item.
      *
      * @param item The item to modify.
      * @param attribute The attribute of the item to unset represented as a string.
      */
    def unsetAttribute(item: Item, attribute: String): Unit = js.native
  }
  
}

