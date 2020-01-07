package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Asset API
  *
  * The cloud asset API manages the history and inventory of cloud resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudasset = google.cloudasset('v1beta1');
  *
  * @namespace cloudasset
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudasset
  */
@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Cloudasset")
@js.native
class Cloudasset protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var folders: Resource$Folders = js.native
  var organizations: Resource$Organizations = js.native
  var projects: Resource$Projects = js.native
}

