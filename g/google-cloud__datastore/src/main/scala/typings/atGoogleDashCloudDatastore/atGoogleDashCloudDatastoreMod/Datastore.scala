package typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreMod

import typings.atGoogleDashCloudDatastore.entityMod.DatastoreCoords
import typings.atGoogleDashCloudDatastore.entityMod.DatastoreDouble
import typings.atGoogleDashCloudDatastore.entityMod.DatastoreGeopoint
import typings.atGoogleDashCloudDatastore.entityMod.DatastoreInt
import typings.atGoogleDashCloudDatastore.entityMod.DatastoreKey
import typings.atGoogleDashCloudDatastore.entityMod.DatastoreKeyOptions
import typings.atGoogleDashCloudDatastore.entityMod.DatastoreKeyPath
import typings.atGoogleDashCloudDatastore.queryMod.MoreResultsAfterCursor
import typings.atGoogleDashCloudDatastore.queryMod.MoreResultsAfterLimit
import typings.atGoogleDashCloudDatastore.queryMod.NoMoreResults
import typings.atGoogleDashCloudDatastore.queryMod.Query
import typings.atGoogleDashCloudDatastore.requestMod.DatastoreRequest
import typings.atGoogleDashCloudDatastore.transactionMod.DatastoreTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datastore extends DatastoreRequest {
  val KEY: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Datastore.KEY */ js.Any = js.native
  val MORE_RESULTS_AFTER_CURSOR: MoreResultsAfterCursor = js.native
  val MORE_RESULTS_AFTER_LIMIT: MoreResultsAfterLimit = js.native
  val NO_MORE_RESULTS: NoMoreResults = js.native
  def createQuery(kind: String): Query = js.native
  // tslint:disable-next-line unified-signatures (Arg is semantically different)
  def createQuery(namespace: String, kind: String): Query = js.native
  def determineBaseUrl_(): Unit = js.native
  def determineBaseUrl_(customApiEndpoint: String): Unit = js.native
  def double(value: String): DatastoreDouble = js.native
  def double(value: Double): DatastoreDouble = js.native
  def geoPoint(coordinates: DatastoreCoords): DatastoreGeopoint = js.native
  def int(value: String): DatastoreInt = js.native
  def int(value: Double): DatastoreInt = js.native
  def isDouble(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreDouble */ Boolean = js.native
  def isGeoPoint(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreGeopoint */ Boolean = js.native
  def isInt(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreInt */ Boolean = js.native
  def isKey(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreKey */ Boolean = js.native
  def key(pathOrOptions: DatastoreKeyOptions): DatastoreKey = js.native
  def key(pathOrOptions: DatastoreKeyPath): DatastoreKey = js.native
  def transaction(): DatastoreTransaction = js.native
}

