package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Binary Authorization API
  *
  * The management interface for Binary Authorization, a system providing
  * policy control for images deployed to Kubernetes Engine clusters.
  *
  * @example
  * const {google} = require('googleapis');
  * const binaryauthorization = google.binaryauthorization('v1beta1');
  *
  * @namespace binaryauthorization
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Binaryauthorization
  */
@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Binaryauthorization")
@js.native
class Binaryauthorization protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

