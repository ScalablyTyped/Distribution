package typings.googleapis.buildSrcApisCloudassetV1Mod.cloudasset_v1

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
  * const cloudasset = google.cloudasset('v1');
  *
  * @namespace cloudasset
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudasset
  */
@JSImport("googleapis/build/src/apis/cloudasset/v1", "cloudasset_v1.Cloudasset")
@js.native
class Cloudasset protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var v1: Resource$V1 = js.native
}

