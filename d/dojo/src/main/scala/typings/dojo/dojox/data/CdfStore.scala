package typings.dojo.dojox.data

import typings.dojo.dojo.data.api.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/CdfStore.html
  *
  * IMPORTANT: The CDF Store is designed to work with Tibco GI, and references Tibco's
  * JSX3 JavaScript library and will not work without it.
  *
  * The CDF Store implements dojo.data.Read, Write, and Identity api's.  It is a local
  * (in memory) store that handles XML documents formatted according to the
  * Common Data Format (CDF) spec:
  * http://www.tibco.com/devnet/resources/gi/3_1/tips_and_techniques/CommonDataFormatCDF.pdf
  *
  * The purpose of this store is to provide a glue between a jsx3 CDF file and a Dijit.
  *
  * While a CDF document is an XML file, other than the initial input, all data returned
  * from and written to this store should be in object format.
  *
  * @param args
  */
@JSGlobal("dojox.data.CdfStore")
@js.native
class CdfStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    * A object that will be converted into the xmlStr property, and then parsed into a CDF.
    *
    */
  var data: js.Object = js.native
  /**
    * The unique identifier for each item. Defaults to "jsxid" which is standard for a CDF
    * document. Should not be changed.
    *
    */
  var identity: String = js.native
  /**
    * The property within each item used to define the item.
    *
    */
  var label: String = js.native
  /**
    *
    */
  var mode: Double = js.native
  /**
    *
    */
  var url: String = js.native
  /**
    * A string that can be parsed into an XML document and should be formatted according
    * to the CDF spec.
    *
    */
  var xmlStr: String = js.native
  /**
    *
    * @param args
    */
  def byId(args: String): Unit = js.native
  /**
    *
    * @param args
    */
  def byId(args: js.Object): Unit = js.native
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
    * Check whether an item contains a value
    *
    * @param item
    * @param property
    * @param value
    */
  def containsValue(item: js.Any, property: String, value: js.Any): Boolean = js.native
  /**
    * Delete an jsx3.xml.Entity (wrapper to a XML element).
    *
    * @param item
    */
  def deleteItem(item: js.Any): Boolean = js.native
  /**
    * Returns an Array of items based on the request arguments.
    * Returns an Array of items based on the request arguments.
    * If the store is in ASYNC mode, the items should be expected in an onComplete
    * method passed in the request object. If store is in SYNC mode, the items will
    * be return directly as well as within the onComplete method.
    *
    * note:
    * The mode can be set on store initialization or during a fetch as one of the
    * parameters.
    *
    * See:
    *
    * http://www.tibco.com/devnet/resources/gi/3_7/api/html/jsx3/xml/Entity.html#method:selectNodes
    * http://www.w3.org/TR/xpath
    * http://msdn.microsoft.com/en-us/library/ms256086.aspx
    * See dojo.data.Read.fetch():
    *
    * onBegin
    * onComplete
    * onItem
    * onError
    * scope
    * start
    * count
    * sort
    *
    * @param request               OptionalThe items in the store are treated as objects, but this is reading an XMLdocument. Further, the actual querying of the items takes place in Tibco GI'sjsx3.xml.Entity. Therefore, we are using their syntax which is xpath.Note:As conforming to a CDF document, most, if not all nodes are considered "records"and their tagNames are as such. The root node is named "data".
    */
  def fetch(request: String): js.Any = js.native
  /**
    * See dojo/data/api/Identity.fetchItemByIdentity(keywordArgs).
    *
    * Note:
    * This method can be synchronous if mode is set.
    * Also, there is a more finger friendly alias of this method, byId();
    *
    * @param args
    */
  def fetchItemByIdentity(args: String): js.Any = js.native
  /**
    * See dojo/data/api/Identity.fetchItemByIdentity(keywordArgs).
    *
    * Note:
    * This method can be synchronous if mode is set.
    * Also, there is a more finger friendly alias of this method, byId();
    *
    * @param args
    */
  def fetchItemByIdentity(args: js.Object): js.Any = js.native
  /**
    * Return an array of property names
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Any = js.native
  /**
    * Return supported data APIs
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * Returns the identifier for an item.
    *
    * @param item
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * Returns the property used for the identity.
    *
    * @param item
    */
  def getIdentityAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * returns an array of what properties of the item that were used
    * to generate its label
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Any = js.native
  /**
    * Return an property value of an item
    *
    * @param item
    * @param property
    * @param defaultValue               Optional
    */
  def getValue(item: js.Any, property: String, defaultValue: js.Any): js.Any = js.native
  /**
    * Return an array of values
    *
    * @param item
    * @param property
    */
  def getValues(item: js.Any, property: String): js.Array[_] = js.native
  /**
    * Check whether an item has a property
    *
    * @param item
    * @param property
    */
  def hasAttribute(item: js.Any, property: String): Boolean = js.native
  /**
    * Alias for hasAttribute
    *
    * @param item
    * @param property
    */
  def hasProperty(item: js.Any, property: String): js.Any = js.native
  /**
    * Check whether an item is new, modified or deleted.
    * If no item is passed, checks if anything in the store has changed.
    *
    * @param item               Optional
    */
  def isDirty(item: js.Any): Boolean = js.native
  /**
    * Check whether the object is an item (jsx3.xml.Entity)
    *
    * @param something
    */
  def isItem(something: js.Any): Boolean = js.native
  /**
    * Check whether the object is a jsx3.xml.Entity object and loaded
    *
    * @param something
    */
  def isItemLoaded(something: js.Any): js.Any = js.native
  /**
    * Load an item
    * The store always loads all items, so if it's an item, then it's loaded.
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Object): Unit = js.native
  /**
    * Creates a jsx3.xml.Entity item and inserts it either inside the
    * parent or appends it to the root
    *
    * @param keywordArgs               Optional
    * @param parentInfo               Optional
    */
  def newItem(keywordArgs: js.Object, parentInfo: String): js.Any = js.native
  /**
    * Creates a jsx3.xml.Entity item and inserts it either inside the
    * parent or appends it to the root
    *
    * @param keywordArgs               Optional
    * @param parentInfo               Optional
    */
  def newItem(keywordArgs: js.Object, parentInfo: js.Object): js.Any = js.native
  /**
    * Invalidate changes (new and/or modified elements)
    * Resets data by simply deleting the reference to the cdfDoc.
    * Subsequent fetches will load the new data.
    *
    * Note:
    * Any items outside the store will no longer be valid and may cause errors.
    *
    */
  def revert(): Boolean = js.native
  /**
    * Set an property value
    *
    * @param item
    * @param property
    * @param value
    */
  def setValue(item: js.Any, property: String, value: js.Any): Boolean = js.native
  /**
    * Set property values.
    *
    * @param item
    * @param property
    * @param values
    */
  def setValues(item: js.Any, property: String, values: js.Array[_]): js.Any = js.native
  /**
    * Remove an property
    *
    * @param item
    * @param property
    */
  def unsetAttribute(item: js.Any, property: String): Boolean = js.native
}

