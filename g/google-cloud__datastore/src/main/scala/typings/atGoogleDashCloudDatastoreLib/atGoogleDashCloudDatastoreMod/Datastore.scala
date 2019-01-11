package typings
package atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datastore
  extends atGoogleDashCloudDatastoreLib.requestMod.DatastoreRequest {
  val KEY: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Datastore.KEY */ js.Any = js.native
  val MORE_RESULTS_AFTER_CURSOR: atGoogleDashCloudDatastoreLib.queryMod.MoreResultsAfterCursor = js.native
  val MORE_RESULTS_AFTER_LIMIT: atGoogleDashCloudDatastoreLib.queryMod.MoreResultsAfterLimit = js.native
  val NO_MORE_RESULTS: atGoogleDashCloudDatastoreLib.queryMod.NoMoreResults = js.native
  def createQuery(kind: java.lang.String): atGoogleDashCloudDatastoreLib.queryMod.Query = js.native
  // tslint:disable-next-line unified-signatures (Arg is semantically different)
  def createQuery(namespace: java.lang.String, kind: java.lang.String): atGoogleDashCloudDatastoreLib.queryMod.Query = js.native
  def `determineBaseUrl_`(): scala.Unit = js.native
  def `determineBaseUrl_`(customApiEndpoint: java.lang.String): scala.Unit = js.native
  def double(value: java.lang.String): atGoogleDashCloudDatastoreLib.entityMod.DatastoreDouble = js.native
  def double(value: scala.Double): atGoogleDashCloudDatastoreLib.entityMod.DatastoreDouble = js.native
  def geoPoint(coordinates: atGoogleDashCloudDatastoreLib.entityMod.DatastoreCoords): atGoogleDashCloudDatastoreLib.entityMod.DatastoreGeopoint = js.native
  def int(value: java.lang.String): atGoogleDashCloudDatastoreLib.entityMod.DatastoreInt = js.native
  def int(value: scala.Double): atGoogleDashCloudDatastoreLib.entityMod.DatastoreInt = js.native
  def isDouble(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreDouble */ scala.Boolean = js.native
  def isGeoPoint(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreGeopoint */ scala.Boolean = js.native
  def isInt(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreInt */ scala.Boolean = js.native
  def isKey(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreKey */ scala.Boolean = js.native
  def key(pathOrOptions: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKeyOptions): atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey = js.native
  def key(pathOrOptions: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKeyPath): atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey = js.native
  def transaction(): atGoogleDashCloudDatastoreLib.transactionMod.DatastoreTransaction = js.native
}

