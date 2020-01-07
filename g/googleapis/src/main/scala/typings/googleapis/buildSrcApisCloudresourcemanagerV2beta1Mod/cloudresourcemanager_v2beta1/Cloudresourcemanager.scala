package typings.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Resource Manager API
  *
  * Creates, reads, and updates metadata for Google Cloud Platform resource
  * containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudresourcemanager = google.cloudresourcemanager('v2beta1');
  *
  * @namespace cloudresourcemanager
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Cloudresourcemanager
  */
@JSImport("googleapis/build/src/apis/cloudresourcemanager/v2beta1", "cloudresourcemanager_v2beta1.Cloudresourcemanager")
@js.native
class Cloudresourcemanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var folders: Resource$Folders = js.native
  var operations: Resource$Operations = js.native
}

