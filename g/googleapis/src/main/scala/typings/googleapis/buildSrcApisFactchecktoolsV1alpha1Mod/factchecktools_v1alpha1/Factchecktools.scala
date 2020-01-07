package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fact Check Tools API
  *
  *
  *
  * @example
  * const {google} = require('googleapis');
  * const factchecktools = google.factchecktools('v1alpha1');
  *
  * @namespace factchecktools
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Factchecktools
  */
@JSImport("googleapis/build/src/apis/factchecktools/v1alpha1", "factchecktools_v1alpha1.Factchecktools")
@js.native
class Factchecktools protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var claims: Resource$Claims = js.native
  var context: APIRequestContext = js.native
  var pages: Resource$Pages = js.native
}

