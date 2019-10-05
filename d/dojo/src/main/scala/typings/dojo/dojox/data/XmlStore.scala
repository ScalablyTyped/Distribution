package typings.dojo.dojox.data

import typings.dojo.dojo.data.api.Item
import typings.dojo.dojo.data.api.Request
import typings.std.Attr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/XmlStore.html
  *
  * A data store for XML based services or documents
  * A data store for XML based services or documents
  *
  * @param args An anonymous object to initialize properties.  It expects the following values:url:      The url to a service or an XML document that represents the storerootItem: A tag name for root itemskeyAttribute: An attribute name for a key or an identity (unique identifier)          Required for serverside fetchByIdentity, etc.  Not required for          client side fetchItemBIdentity, as it will use an XPath-like          structure if keyAttribute was not specified.  Recommended to always          set this, though, for consistent identity behavior.attributeMap: An anonymous object contains properties for attribute mapping,          {"tag_name.item_attribute_name": "@xml_attribute_name", ...}sendQuery:    A boolean indicate to add a query string to the service URL.          Default is false.urlPreventCache: Parameter to indicate whether or not URL calls should apply           the preventCache option to the xhr request.
  */
@JSGlobal("dojox.data.XmlStore")
@js.native
class XmlStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    *
    */
  var attributeMap: js.Object = js.native
  /**
    *
    */
  var keyAttribute: String = js.native
  /**
    *
    */
  var label: String = js.native
  /**
    *
    */
  var rootItem: String = js.native
  /**
    *
    */
  var sendQuery: Boolean = js.native
  /**
    *
    */
  var url: String = js.native
  /**
    *
    */
  var urlPreventCache: Boolean = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request               Optional
    */
  def close(request: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request               Optional
    */
  def close(request: Request): Unit = js.native
  /**
    * Check whether the attribute values contain the value
    *
    * @param item An object to check
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    * @param value
    */
  def containsValue(item: Item, attribute: String, value: js.Any): js.Any = js.native
  /**
    * Check whether the attribute values contain the value
    *
    * @param item An object to check
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    * @param value
    */
  def containsValue(item: Item, attribute: Attr, value: js.Any): js.Any = js.native
  /**
    * Delete an dojox.data.XmlItem (wrapper to a XML element).
    *
    * @param item An XML element to delete
    */
  def deleteItem(item: Item): js.Any = js.native
  /**
    * The error handler when there is an error fetching items.  This function should not be called
    * directly and is used by simpleFetch.fetch().
    *
    * @param errorData
    * @param requestObject
    */
  def errorHandler(errorData: js.Object, requestObject: js.Object): Unit = js.native
  /**
    * The simpleFetch mixin is designed to serve as a set of function(s) that can
    * be mixed into other datastore implementations to accelerate their development.
    * The simpleFetch mixin should work well for any datastore that can respond to a _fetchItems()
    * call by returning an array of all the found items that matched the query.  The simpleFetch mixin
    * is not designed to work for datastores that respond to a fetch() call by incrementally
    * loading items, or sequentially loading partial batches of the result
    * set.  For datastores that mixin simpleFetch, simpleFetch
    * implements a fetch method that automatically handles eight of the fetch()
    * arguments -- onBegin, onItem, onComplete, onError, start, count, sort and scope
    * The class mixing in simpleFetch should not implement fetch(),
    * but should instead implement a _fetchItems() method.  The _fetchItems()
    * method takes three arguments, the keywordArgs object that was passed
    * to fetch(), a callback function to be called when the result array is
    * available, and an error callback to be called if something goes wrong.
    * The _fetchItems() method should ignore any keywordArgs parameters for
    * start, count, onBegin, onItem, onComplete, onError, sort, and scope.
    * The _fetchItems() method needs to correctly handle any other keywordArgs
    * parameters, including the query parameter and any optional parameters
    * (such as includeChildren).  The _fetchItems() method should create an array of
    * result items and pass it to the fetchHandler along with the original request object --
    * or, the _fetchItems() method may, if it wants to, create an new request object
    * with other specifics about the request that are specific to the datastore and pass
    * that as the request object to the handler.
    *
    * For more information on this specific function, see dojo/data/api/Read.fetch()
    *
    * @param request               OptionalThe keywordArgs parameter may either be an instance ofconforming to dojo/data/api/Request or may be a simple anonymous objectthat may contain any of the following:{    query: query-object or query-string,    queryOptions: object,    onBegin: Function,    onItem: Function,    onComplete: Function,    onError: Function,    scope: object,    start: int    count: int    sort: array}All implementations should accept keywordArgs objects with any ofthe 9 standard properties: query, onBegin, onItem, onComplete, onErrorscope, sort, start, and count.  Some implementations may accept additionalproperties in the keywordArgs object as valid parameters, such as{includeOutliers:true}.The query parameterThe query may be optional in some data store implementations.The dojo/data/api/Read API does not specify the syntax or semanticsof the query itself -- each different data store implementationmay have its own notion of what a query should look like.However, as of dojo 0.9, 1.0, and 1.1, all the provided datastores in dojo.dataand dojox.data support an object structure query, where the object is a set ofname/value parameters such as { attrFoo: valueBar, attrFoo1: valueBar1}.  Most of thedijit widgets, such as ComboBox assume this to be the case when working with a datastorewhen they dynamically update the query.  Therefore, for maximum compatibility with dijitwidgets the recommended query parameter is a key/value object.  That does not mean that thethe datastore may not take alternative query forms, such as a simple string, a Date, a number,or a mix of such.  Ultimately, The dojo/data/api/Read API is agnostic about what the queryformat.Further note:  In general for query objects that accept strings as attributevalue matches, the store should also support basic filtering capability, such as (match any character) and ? (match single character).  An example query that is a query objectwould be like: { attrFoo: "value"}.  Which generally means match all items where they havean attribute named attrFoo, with a value that starts with 'value'.The queryOptions parameterThe queryOptions parameter is an optional parameter used to specify options that may modifythe query in some fashion, such as doing a case insensitive search, or doing a deep searchwhere all items in a hierarchical representation of data are scanned instead of just the rootitems.  It currently defines two options that all datastores should attempt to honor if possible:{    ignoreCase: boolean, // Whether or not the query should match case sensitively or not.  Default behaviour is false.    deep: boolean   // Whether or not a fetch should do a deep search of items and all child                    // items instead of just root-level items in a datastore.  Default is false.}The onBegin parameter.function(size, request);If an onBegin callback function is provided, the callback functionwill be called just once, before the first onItem callback is called.The onBegin callback function will be passed two arguments, thethe total number of items identified and the Request object.  If the total number isunknown, then size will be -1.  Note that size is not necessarily the size of thecollection of items returned from the query, as the request may have specified to return only asubset of the total set of items through the use of the start and count parameters.The onItem parameter.function(item, request);If an onItem callback function is provided, the callback functionwill be called as each item in the result is received. The callbackfunction will be passed two arguments: the item itself, and theRequest object.The onComplete parameter.function(items, request);If an onComplete callback function is provided, the callback functionwill be called just once, after the last onItem callback is called.Note that if the onItem callback is not present, then onComplete will be passedan array containing all items which matched the query and the request object.If the onItem callback is present, then onComplete is called as:onComplete(null, request).The onError parameter.function(errorData, request);If an onError callback function is provided, the callback functionwill be called if there is any sort of error while attempting toexecute the query.The onError callback function will be passed two arguments:an Error object and the Request object.The scope parameter.If a scope object is provided, all of the callback functions (onItem,onComplete, onError, etc) will be invoked in the context of the scopeobject.  In the body of the callback function, the value of the "this"keyword will be the scope object.   If no scope object is provided,the callback functions will be called in the context of dojo.global().For example, onItem.call(scope, item, request) vs.onItem.call(dojo.global(), item, request)The start parameter.If a start parameter is specified, this is a indication to the datastore toonly start returning items once the start number of items have been located andskipped.  When this parameter is paired with 'count', the store should be ableto page across queries with millions of hits by only returning subsets of thehits for each queryThe count parameter.If a count parameter is specified, this is a indication to the datastore toonly return up to that many items.  This allows a fetch call that may havemillions of item matches to be paired down to something reasonable.The sort parameter.If a sort parameter is specified, this is a indication to the datastore tosort the items in some manner before returning the items.  The array is an array ofjavascript objects that must conform to the following format to be applied to thefetching of items:{    attribute: attribute || attribute-name-string,    descending: true|false;   // Optional.  Default is false.}Note that when comparing attributes, if an item contains no value for the attribute(undefined), then it the default ascending sort logic should push it to the bottomof the list.  In the descending order case, it such items should appear at the top of the list.
    */
  def fetch(request: js.Object): Unit = js.native
  /**
    * The handler when items are sucessfully fetched.  This function should not be called directly
    * and is used by simpleFetch.fetch().
    *
    * @param items
    * @param requestObject
    */
  def fetchHandler(items: js.Array[_], requestObject: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Identity.fetchItemByIdentity(keywordArgs)
    *
    * @param keywordArgs
    */
  def fetchItemByIdentity(keywordArgs: js.Object): Unit = js.native
  /**
    * Return an array of attribute names
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * tag names of child elements and XML attribute names of attributes
    * specified to the element are returned along with special attribute
    * names applicable to the element including "tagName", "childNodes"
    * if the element has child elements, "text()" if the element has
    * child text nodes, and attribute names in '_attributeMap' that match
    * the tag name of the element.
    *
    * @param item An XML element
    */
  def getAttributes(item: Item): js.Any = js.native
  /**
    * Return supported data APIs
    *
    */
  def getFeatures(): js.Any = js.native
  /**
    * Returns a unique identifier for an item.
    *
    * @param item The XML Item from the store from which to obtain its identifier.
    */
  def getIdentity(item: Item): js.Any = js.native
  /**
    * Returns an array of attribute names that are used to generate the identity.
    * For XmlStore, if sendQuery is false and no keyAttribute was set, then this function
    * returns null, as xpath is used for the identity, which is not a public attribute of
    * the item.  If sendQuery is true and keyAttribute is set, then this function
    * returns an array of one attribute name: keyAttribute.   This means the server side
    * implementation must apply a keyAttribute to a returned node that always allows
    * it to be looked up again.
    *
    * @param item The item from the store from which to obtain the array of public attributes thatcompose the identifier, if any.
    */
  def getIdentityAttributes(item: Item): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: Item): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: Item): js.Any = js.native
  /**
    * Return an attribute value
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", the tag name of the element is
    * returned.
    * If 'attribute' specifies "childNodes", the first element child is
    * returned.
    * If 'attribute' specifies "text()", the value of the first text
    * child is returned.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the value of the XML
    * attribute is returned.
    * Otherwise, the first child element of the tag name specified with
    * 'attribute' is returned.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    * @param defaultValue               OptionalA default value
    */
  def getValue(item: Item, attribute: String, defaultValue: js.Any): js.Any = js.native
  /**
    * Return an attribute value
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", the tag name of the element is
    * returned.
    * If 'attribute' specifies "childNodes", the first element child is
    * returned.
    * If 'attribute' specifies "text()", the value of the first text
    * child is returned.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the value of the XML
    * attribute is returned.
    * Otherwise, the first child element of the tag name specified with
    * 'attribute' is returned.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    * @param defaultValue               OptionalA default value
    */
  def getValue(item: Item, attribute: Attr, defaultValue: js.Any): js.Any = js.native
  /**
    * Return an array of attribute values
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", the tag name of the element is
    * returned.
    * If 'attribute' specifies "childNodes", child elements are returned.
    * If 'attribute' specifies "text()", the values of child text nodes
    * are returned.
    * For generic attributes, if 'attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the value of the XML
    * attribute is returned.
    * Otherwise, child elements of the tag name specified with
    * 'attribute' are returned.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of child elements, An XML attribute name or one ofspecial names
    */
  def getValues(item: Item, attribute: String): js.Any = js.native
  /**
    * Return an array of attribute values
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", the tag name of the element is
    * returned.
    * If 'attribute' specifies "childNodes", child elements are returned.
    * If 'attribute' specifies "text()", the values of child text nodes
    * are returned.
    * For generic attributes, if 'attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the value of the XML
    * attribute is returned.
    * Otherwise, child elements of the tag name specified with
    * 'attribute' are returned.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of child elements, An XML attribute name or one ofspecial names
    */
  def getValues(item: Item, attribute: Attr): js.Any = js.native
  /**
    * Check whether an element has the attribute
    *
    * @param item 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    */
  def hasAttribute(item: Item, attribute: String): js.Any = js.native
  /**
    * Check whether an element has the attribute
    *
    * @param item 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    */
  def hasAttribute(item: Item, attribute: Attr): js.Any = js.native
  /**
    * Check whether an item is new, modified or deleted
    * If 'item' is specified, true is returned if the item is new,
    * modified or deleted.
    * Otherwise, true is returned if there are any new, modified
    * or deleted items.
    *
    * @param item               OptionalAn item (XML element) to check
    */
  def isDirty(item: js.Any): js.Any = js.native
  /**
    * Check whether the object is an item (XML element)
    *
    * @param something
    */
  def isItem(something: js.Any): js.Any = js.native
  /**
    * Check whether the object is an item (XML element) and loaded
    *
    * @param something
    */
  def isItemLoaded(something: js.Any): js.Any = js.native
  /**
    * Load an item (XML element)
    *
    * @param keywordArgs object containing the args for loadItem.  See dojo/data/api/Read.loadItem()
    */
  def loadItem(keywordArgs: js.Object): Unit = js.native
  /**
    * Return a new dojox.data.XmlItem
    * At least, 'keywordArgs' must contain "tagName" to be used for
    * the new element.
    * Other attributes in 'keywordArgs' are set to the new element,
    * including "text()", but excluding "childNodes".
    *
    * @param keywordArgs               OptionalAn object containing initial attributes
    * @param parentInfo
    */
  def newItem(keywordArgs: js.Object, parentInfo: js.Any): js.Any = js.native
  /**
    * Invalidate changes (new and/or modified elements)
    *
    */
  def revert(): js.Any = js.native
  /**
    * Save new and/or modified items (XML elements)
    * 'url' is used to save XML documents for new, modified and/or
    * deleted XML elements.
    *
    * @param keywordArgs An object for callbacks
    */
  def save(keywordArgs: js.Object): Unit = js.native
  /**
    * Set an attribute value
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", nothing is set and false is
    * returned.
    * If 'attribute' specifies "childNodes", the value (XML element) is
    * added to the element.
    * If 'attribute' specifies "text()", a text node is created with
    * the value and set it to the element as a child.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the value is set to the XML
    * attribute.
    * Otherwise, a text node is created with the value and set it to
    * the first child element of the tag name specified with 'attribute'.
    * If the child element does not exist, it is created.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    * @param value A attribute value to set
    */
  def setValue(item: Item, attribute: String, value: js.Any): js.Any = js.native
  /**
    * Set an attribute value
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", nothing is set and false is
    * returned.
    * If 'attribute' specifies "childNodes", the value (XML element) is
    * added to the element.
    * If 'attribute' specifies "text()", a text node is created with
    * the value and set it to the element as a child.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the value is set to the XML
    * attribute.
    * Otherwise, a text node is created with the value and set it to
    * the first child element of the tag name specified with 'attribute'.
    * If the child element does not exist, it is created.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of a child element, An XML attribute name or one ofspecial names
    * @param value A attribute value to set
    */
  def setValue(item: Item, attribute: Attr, value: js.Any): js.Any = js.native
  /**
    * Set attribute values
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", nothing is set and false is
    * returned.
    * If 'attribute' specifies "childNodes", the value (array of XML
    * elements) is set to the element's childNodes.
    * If 'attribute' specifies "text()", a text node is created with
    * the values and set it to the element as a child.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the first value is set to
    * the XML attribute.
    * Otherwise, child elements of the tag name specified with
    * 'attribute' are replaced with new child elements and their
    * child text nodes of values.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of child elements, an XML attribute name or one ofspecial names
    * @param values
    */
  def setValues(item: Item, attribute: String, values: js.Array[_]): js.Any = js.native
  /**
    * Set attribute values
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * If 'attribute' specifies "tagName", nothing is set and false is
    * returned.
    * If 'attribute' specifies "childNodes", the value (array of XML
    * elements) is set to the element's childNodes.
    * If 'attribute' specifies "text()", a text node is created with
    * the values and set it to the element as a child.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the first value is set to
    * the XML attribute.
    * Otherwise, child elements of the tag name specified with
    * 'attribute' are replaced with new child elements and their
    * child text nodes of values.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of child elements, an XML attribute name or one ofspecial names
    * @param values
    */
  def setValues(item: Item, attribute: Attr, values: js.Array[_]): js.Any = js.native
  /**
    * Remove an attribute
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * 'attribute' can be an XML attribute name of the element or one of
    * special names described below.
    * If 'attribute' specifies "tagName", nothing is removed and false is
    * returned.
    * If 'attribute' specifies "childNodes" or "text()", all child nodes
    * are removed.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the XML attribute is removed.
    * Otherwise, child elements of the tag name specified with
    * 'attribute' are removed.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of child elements, an XML attribute name or one ofspecial names
    */
  def unsetAttribute(item: Item, attribute: String): js.Any = js.native
  /**
    * Remove an attribute
    * 'item' must be an instance of a dojox.data.XmlItem from the store instance.
    * 'attribute' can be an XML attribute name of the element or one of
    * special names described below.
    * If 'attribute' specifies "tagName", nothing is removed and false is
    * returned.
    * If 'attribute' specifies "childNodes" or "text()", all child nodes
    * are removed.
    * For generic attributes, if '_attributeMap' is specified,
    * an actual attribute name is looked up with the tag name of
    * the element and 'attribute' (concatenated with '.').
    * Then, if 'attribute' starts with "@", the XML attribute is removed.
    * Otherwise, child elements of the tag name specified with
    * 'attribute' are removed.
    *
    * @param item An XML element that holds the attribute
    * @param attribute A tag name of child elements, an XML attribute name or one ofspecial names
    */
  def unsetAttribute(item: Item, attribute: Attr): js.Any = js.native
}

