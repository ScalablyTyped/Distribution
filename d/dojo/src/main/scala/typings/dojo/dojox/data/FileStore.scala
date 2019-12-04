package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/FileStore.html
  *
  *
  * @param args
  */
@JSGlobal("dojox.data.FileStore")
@js.native
class FileStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    * Flag to pass on to xhr functions to check if we are OK to fail the call silently
    *
    */
  var failOk: Boolean = js.native
  /**
    * Default attribute to use to represent the item as a user-readable
    * string.  Public, so users can change it.
    *
    */
  var label: String = js.native
  /**
    * Array of options to always send when doing requests.
    * Back end service controls this, like 'dirsOnly', 'showHiddenFiles', 'expandChildren', etc.
    *
    */
  var options: js.Array[_] = js.native
  /**
    *
    */
  var pathAsQueryParam: Boolean = js.native
  /**
    * The path separator to use when chaining requests for children
    * Can be overriden by the server on initial load
    *
    */
  var pathSeparator: String = js.native
  /**
    * The URL to the file path service.
    *
    */
  var url: String = js.native
  /**
    * Flag to dennote if preventCache should be passed to xhrGet.
    *
    */
  var urlPreventCache: String = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request
    */
  def close(request: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.containsValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
  /**
    * Fetch  items that match to a query
    *
    * @param request A request object
    */
  def fetch(request: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def fetchItemByIdentity(keywordArgs: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.getAttributes()
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getFeatures()
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * See dojo/data/api/Identity.getIdentity()
    *
    * @param item
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
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
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    * @param defaultValue
    */
  def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.hasAttribute()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItem()
    *
    * @param item
    */
  def isItem(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItemLoaded()
    *
    * @param item
    */
  def isItemLoaded(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Any): Unit = js.native
}

