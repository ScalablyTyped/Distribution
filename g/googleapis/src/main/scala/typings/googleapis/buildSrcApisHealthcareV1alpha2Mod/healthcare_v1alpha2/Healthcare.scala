package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Healthcare API
  *
  * Manage, store, and access healthcare data in Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const healthcare = google.healthcare('v1alpha2');
  *
  * @namespace healthcare
  * @type {Function}
  * @version v1alpha2
  * @variation v1alpha2
  * @param {object=} options Options for Healthcare
  */
@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Healthcare")
@js.native
class Healthcare protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

