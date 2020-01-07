package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

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
  * const cloudresourcemanager = google.cloudresourcemanager('v1');
  *
  * @namespace cloudresourcemanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudresourcemanager
  */
@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1", "cloudresourcemanager_v1.Cloudresourcemanager")
@js.native
class Cloudresourcemanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var folders: Resource$Folders = js.native
  var liens: Resource$Liens = js.native
  var operations: Resource$Operations = js.native
  var organizations: Resource$Organizations = js.native
  var projects: Resource$Projects = js.native
}

