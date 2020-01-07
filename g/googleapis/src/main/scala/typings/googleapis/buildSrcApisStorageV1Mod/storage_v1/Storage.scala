package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Storage JSON API
  *
  * Stores and retrieves potentially large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1');
  *
  * @namespace storage
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var bucketAccessControls: Resource$Bucketaccesscontrols = js.native
  var buckets: Resource$Buckets = js.native
  var channels: Resource$Channels = js.native
  var context: APIRequestContext = js.native
  var defaultObjectAccessControls: Resource$Defaultobjectaccesscontrols = js.native
  var notifications: Resource$Notifications = js.native
  var objectAccessControls: Resource$Objectaccesscontrols = js.native
  var objects: Resource$Objects = js.native
  var projects: Resource$Projects = js.native
}

