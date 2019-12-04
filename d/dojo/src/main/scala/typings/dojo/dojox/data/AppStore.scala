package typings.dojo.dojox.data

import typings.dojo.dojo.data.api.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/AppStore.html
  *
  *
  * @param args An anonymous object to initialize properties.  It expects the following values:url:              The url of the Collection to load.urlPreventCache:  Whether or not to append on cache prevention params (as defined by dojo.xhr*)
  */
@JSGlobal("dojox.data.AppStore")
@js.native
class AppStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    * So the parser can instantiate the store via markup.
    *
    */
  var url: String = js.native
  /**
    * Whether or not to pass the preventCache parameter to the connection
    *
    */
  var urlPreventCache: Boolean = js.native
  /**
    * Whether to use X-Method-Override for PUT/DELETE.
    *
    */
  var xmethod: Boolean = js.native
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
    * See dojo/data/api/Read.containsValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: String, value: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Write.deleteItem()
    *
    * @param item
    */
  def deleteItem(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Identity.fetchItemByIdentity()
    *
    * @param keywordArgs
    */
  def fetchItemByIdentity(keywordArgs: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.getAttributes()
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Array[_] = js.native
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
    * See dojo/data/api/Identity.getIdentityAttributes()
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
    * @param defaultValue               Optional
    */
  def getValue(item: js.Any, attribute: String, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValues()
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: String): js.Any = js.native
  /**
    * See dojo/data/api/Read.hasAttribute()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: String): Boolean = js.native
  /**
    * See dojo/data/api/Write.isDirty()
    *
    * @param item               Optional
    */
  def isDirty(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItem()
    *
    * @param something
    */
  def isItem(something: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.isItemLoaded()
    *
    * @param something
    */
  def isItemLoaded(something: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Write.newItem()
    *
    * @param keywordArgs               Optional
    */
  def newItem(keywordArgs: js.Object): Boolean = js.native
  /**
    * See dojo/data/api/Write.revert()
    *
    */
  def revert(): Boolean = js.native
  /**
    * See dojo/data/api/Write.save()
    *
    * @param keywordArgs {    onComplete: function    onError: function    scope: object}
    */
  def save(keywordArgs: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Write.setValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def setValue(item: js.Any, attribute: String, value: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Write.setValues()
    *
    * @param item
    * @param attribute
    * @param values
    */
  def setValues(item: js.Any, attribute: String, values: js.Array[_]): js.Any = js.native
  /**
    * See dojo/data/api/Write.unsetAttribute()
    *
    * @param item
    * @param attribute
    */
  def unsetAttribute(item: js.Any, attribute: String): Boolean = js.native
}

