package typings.dojo

import org.scalablytyped.runtime.Instantiable0
import typings.dojo.dojo.store.api.Store.PutDirectives
import typings.dojo.dojo.store.api.Store.QueryOptions
import typings.dojo.dojo.store.api.Store.QueryResults
import typings.dojo.dojo.store.api.Store.SortInformation
import typings.dojo.dojo.store.api.Store.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofStore extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.PutDirectives.html
    *
    * Directives passed to put() and add() handlers for guiding the update and
    * creation of stored objects.
    *
    */
  var PutDirectives: Instantiable0[typings.dojo.dojo.store.api.Store.PutDirectives]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.QueryOptions.html
    *
    * Optional object with additional parameters for query results.
    *
    */
  var QueryOptions: Instantiable0[typings.dojo.dojo.store.api.Store.QueryOptions]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.QueryResults.html
    *
    * This is an object returned from query() calls that provides access to the results
    * of a query. Queries may be executed asynchronously.
    *
    */
  var QueryResults: Instantiable0[typings.dojo.dojo.store.api.Store.QueryResults]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.SortInformation.html
    *
    * An object describing what attribute to sort on, and the direction of the sort.
    *
    */
  var SortInformation: Instantiable0[typings.dojo.dojo.store.api.Store.SortInformation]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.Transaction.html
    *
    * This is an object returned from transaction() calls that represents the current
    * transaction.
    *
    */
  var Transaction: Instantiable0[typings.dojo.dojo.store.api.Store.Transaction]
}

object TypeofStore {
  @scala.inline
  def apply(
    PutDirectives: Instantiable0[PutDirectives],
    QueryOptions: Instantiable0[QueryOptions],
    QueryResults: Instantiable0[QueryResults],
    SortInformation: Instantiable0[SortInformation],
    Transaction: Instantiable0[Transaction]
  ): TypeofStore = {
    val __obj = js.Dynamic.literal(PutDirectives = PutDirectives.asInstanceOf[js.Any], QueryOptions = QueryOptions.asInstanceOf[js.Any], QueryResults = QueryResults.asInstanceOf[js.Any], SortInformation = SortInformation.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStore]
  }
}

