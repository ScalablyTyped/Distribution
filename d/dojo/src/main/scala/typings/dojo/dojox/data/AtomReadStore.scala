package typings.dojo.dojox.data

import typings.dojo.dojo.data.api.Item
import typings.dojo.dojo.data.api.Request
import typings.std.Attr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/AtomReadStore.html
  *
  * A read only data store for Atom XML based services or documents
  * A data store for Atom XML based services or documents.  This store is still under development
  * and doesn't support wildcard filtering yet. Attribute filtering is limited to category or id.
  *
  * @param args An anonymous object to initialize properties.   It expects the following values:url:          The url to a service or an XML document that represents the storeunescapeHTML: A boolean to specify whether or not to unescape HTML textsendQuery:    A boolean indicate to add a query string to the service URL
  */
@JSGlobal("dojox.data.AtomReadStore")
@js.native
class AtomReadStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    *
    */
  var label: String = js.native
  /**
    *
    */
  var sendQuery: Boolean = js.native
  /**
    *
    */
  var unescapeHTML: Boolean = js.native
  /**
    *
    */
  var url: String = js.native
  /**
    * Configurable preventCache option for the URL.
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
    * Return an array of attribute names
    * 'item' must be have been created by the AtomReadStore instance.
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
    * Non-API method for retrieving values regarding the Atom feed,
    * rather than the Atom entries.
    *
    * @param attribute
    * @param defaultValue
    */
  def getFeedValue(attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * Non-API method for retrieving values regarding the Atom feed,
    * rather than the Atom entries.
    *
    * @param attribute
    * @param defaultValue
    */
  def getFeedValues(attribute: js.Any, defaultValue: js.Any): js.Any = js.native
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
    * 'item' must be an instance of an object created by the AtomReadStore instance.
    * Accepted attributes are id, subtitle, title, summary, content, author, updated,
    * published, category, link and alternate
    *
    * @param item An item returned by a call to the 'fetch' method.
    * @param attribute A attribute of the Atom Entry
    * @param defaultValue               OptionalA default value
    */
  def getValue(item: Item, attribute: String, defaultValue: js.Any): js.Any = js.native
  /**
    * Return an attribute value
    * 'item' must be an instance of an object created by the AtomReadStore instance.
    * Accepted attributes are id, subtitle, title, summary, content, author, updated,
    * published, category, link and alternate
    *
    * @param item An item returned by a call to the 'fetch' method.
    * @param attribute A attribute of the Atom Entry
    * @param defaultValue               OptionalA default value
    */
  def getValue(item: Item, attribute: Attr, defaultValue: js.Any): js.Any = js.native
  /**
    * Return an attribute value
    * 'item' must be an instance of an object created by the AtomReadStore instance.
    * Accepted attributes are id, subtitle, title, summary, content, author, updated,
    * published, category, link and alternate
    *
    * @param item An item returned by a call to the 'fetch' method.
    * @param attribute A attribute of the Atom Entry
    */
  def getValues(item: Item, attribute: String): js.Any = js.native
  /**
    * Return an attribute value
    * 'item' must be an instance of an object created by the AtomReadStore instance.
    * Accepted attributes are id, subtitle, title, summary, content, author, updated,
    * published, category, link and alternate
    *
    * @param item An item returned by a call to the 'fetch' method.
    * @param attribute A attribute of the Atom Entry
    */
  def getValues(item: Item, attribute: Attr): js.Any = js.native
  /**
    * Check whether an element has the attribute
    *
    * @param item 'item' must be created by the AtomReadStore instance.
    * @param attribute An attribute of an Atom Entry item.
    */
  def hasAttribute(item: Item, attribute: String): js.Any = js.native
  /**
    * Check whether an element has the attribute
    *
    * @param item 'item' must be created by the AtomReadStore instance.
    * @param attribute An attribute of an Atom Entry item.
    */
  def hasAttribute(item: Item, attribute: Attr): js.Any = js.native
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
    * @param keywordArgs object containing the args for loadItem.    See dojo/data/api/Read.loadItem()
    */
  def loadItem(keywordArgs: js.Object): Unit = js.native
}

