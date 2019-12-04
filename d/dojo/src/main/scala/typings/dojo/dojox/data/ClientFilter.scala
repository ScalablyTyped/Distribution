package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/ClientFilter.html
  *
  *
  */
@JSGlobal("dojox.data.ClientFilter")
@js.native
class ClientFilter () extends js.Object {
  /**
    *
    */
  var cacheByDefault: Boolean = js.native
  /**
    *
    */
  var serverVersion: Double = js.native
  /**
    *
    * @param args
    */
  def cachingFetch(args: js.Any): js.Any = js.native
  /**
    * Clears the cache of client side queries
    *
    */
  def clearCache(): Unit = js.native
  /**
    * Performs a query on the client side and returns the results as an array
    *
    * @param request See dojo/data/api/Read.fetch request
    * @param baseResults This provides the result set to start with for client side querying
    */
  def clientSideFetch(request: js.Object, baseResults: js.Array[_]): js.Any = js.native
  /**
    *
    * @param request
    * @param baseResults
    */
  def clientSidePaging(request: js.Object, baseResults: js.Array[_]): js.Array[_] = js.native
  /**
    * Returns whether the provide fetch arguments can be used to update an existing list
    *
    * @param request See dojo/data/api/Read.fetch request
    */
  def isUpdateable(request: js.Object): Boolean = js.native
  /**
    * returns a comparator function for the given sort order array
    *
    * @param sort See dojox.data.api.Read.fetch
    */
  def makeComparator(sort: js.Any): js.Function = js.native
  /**
    *
    * @param item
    * @param request
    */
  def matchesQuery(item: js.Any, request: js.Any): Boolean = js.native
  /**
    *
    */
  def onUpdate(): Unit = js.native
  /**
    * Determines whether the provided arguments are super/sub sets of each other
    *
    * @param argsSuper Dojo Data Fetch arguments
    * @param argsSub Dojo Data Fetch arguments
    */
  def querySuperSet(argsSuper: js.Any, argsSub: js.Any): js.Any = js.native
  /**
    * Attempts to update the given result set based on previous notifications
    * This will attempt to update the provide result based on previous notification, adding new items
    * from onNew calls, removing deleted items, and updating modified items, and properly removing
    * and adding items as required by the query and sort parameters.
    *
    * @param resultSet The result set array that should be updated
    * @param request This object follows the same meaning as the keywordArgs passed to a dojo/data/api/Read.fetch.
    */
  def updateResultSet(resultSet: js.Array[_], request: js.Object): js.Any = js.native
}

