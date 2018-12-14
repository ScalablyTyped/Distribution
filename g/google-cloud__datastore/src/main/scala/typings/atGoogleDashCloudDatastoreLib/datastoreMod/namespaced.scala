package typings
package atGoogleDashCloudDatastoreLib.datastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore", JSImport.Namespace)
@js.native
class namespaced () extends Datastore {
  def this(options: InitOptions) = this()
}

@JSImport("@google-cloud/datastore", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  val DatastoreRequest: org.scalablytyped.runtime.Instantiable0[atGoogleDashCloudDatastoreLib.requestMod.DatastoreRequest] = js.native
  val KEY: js.Symbol = js.native
  val MORE_RESULTS_AFTER_CURSOR: atGoogleDashCloudDatastoreLib.queryMod.MoreResultsAfterCursor = js.native
  val MORE_RESULTS_AFTER_LIMIT: atGoogleDashCloudDatastoreLib.queryMod.MoreResultsAfterLimit = js.native
  val NO_MORE_RESULTS: atGoogleDashCloudDatastoreLib.queryMod.NoMoreResults = js.native
  val Query: org.scalablytyped.runtime.Instantiable3[
    /* scope */ java.lang.String, 
    /* kinds */ java.lang.String, 
    /* namespace */ java.lang.String, 
    atGoogleDashCloudDatastoreLib.queryMod.Query
  ] = js.native
  val Transaction: org.scalablytyped.runtime.Instantiable1[
    /* datastore */ atGoogleDashCloudDatastoreLib.datastoreMod.namespaced, 
    atGoogleDashCloudDatastoreLib.transactionMod.DatastoreTransaction
  ] = js.native
}

