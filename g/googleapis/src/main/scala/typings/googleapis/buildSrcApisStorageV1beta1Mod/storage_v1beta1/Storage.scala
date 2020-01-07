package typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Storage JSON API
  *
  * Lets you store and retrieve potentially-large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1beta1');
  *
  * @namespace storage
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis/build/src/apis/storage/v1beta1", "storage_v1beta1.Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var bucketAccessControls: Resource$Bucketaccesscontrols = js.native
  var buckets: Resource$Buckets = js.native
  var context: APIRequestContext = js.native
  var objectAccessControls: Resource$Objectaccesscontrols = js.native
  var objects: Resource$Objects = js.native
}

