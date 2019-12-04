package typings.dojo.dojox.data

import typings.dojo.dojo.data.api.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/QueryReadStore.html
  *
  * This class provides a store that is mainly intended to be used
  * for loading data dynamically from the server, used i.e. for
  * retrieving chunks of data from huge data stores on the server (by server-side filtering!).
  * Upon calling the fetch() method of this store the data are requested from
  * the server if they are not yet loaded for paging (or cached).
  *
  * For example used for a combobox which works on lots of data. It
  * can be used to retrieve the data partially upon entering the
  * letters "ac" it returns only items like "action", "acting", etc.
  *
  * note:
  * The field name "id" in a query is reserved for looking up data
  * by id. This is necessary as before the first fetch, the store
  * has no way of knowing which field the server will declare as
  * identifier.
  *
  * @param params
  */
@JSGlobal("dojox.data.QueryReadStore")
@js.native
class QueryReadStore protected () extends js.Object {
  def this(params: js.Object) = this()
  /**
    * By default every request for paging is sent to the server.
    *
    */
  var doClientPaging: Boolean = js.native
  /**
    * By default all the sorting is done serverside before the data is returned
    * which is the proper place to be doing it for really large datasets.
    *
    */
  var doClientSorting: Boolean = js.native
  /**
    *
    */
  var lastRequestHash: js.Object = js.native
  /**
    *
    */
  var requestMethod: String = js.native
  /**
    *
    */
  var url: String = js.native
  /**
    *
    * @param request               Optional
    */
  def close(request: js.Object): Unit = js.native
  /**
    *
    * @param request               Optional
    */
  def close(request: Request): Unit = js.native
  /**
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: String, value: js.Any): Boolean = js.native
  /**
    * See dojo.data.util.simpleFetch.fetch() this is just a copy and I adjusted
    * only the paging, since it happens on the server if doClientPaging is
    * false, thx to http://trac.dojotoolkit.org/ticket/4761 reporting this.
    * Would be nice to be able to use simpleFetch() to reduce copied code,
    * but i dont know how yet. Ideas please!
    *
    * @param request               Optional
    */
  def fetch(request: js.Object): String = js.native
  /**
    * See dojo/data/api/Identity.fetchItemByIdentity()
    *
    * @param keywordArgs
    */
  def fetchItemByIdentity(keywordArgs: js.Object): Unit = js.native
  /**
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Array[_] = js.native
  /**
    *
    */
  def getFeatures(): js.Any = js.native
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
  def getLabelAttributes(item: js.Any): js.Any = js.native
  /**
    *
    * @param item
    * @param attribute
    * @param defaultValue               Optional
    */
  def getValue(item: js.Any, attribute: String, defaultValue: js.Any): js.Any = js.native
  /**
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: String): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.hasAttribute()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: String): js.Any = js.native
  /**
    *
    * @param something
    */
  def isItem(something: js.Any): Boolean = js.native
  /**
    *
    * @param something
    */
  def isItemLoaded(something: js.Any): js.Any = js.native
  /**
    *
    * @param args
    */
  def loadItem(args: js.Object): Unit = js.native
}

