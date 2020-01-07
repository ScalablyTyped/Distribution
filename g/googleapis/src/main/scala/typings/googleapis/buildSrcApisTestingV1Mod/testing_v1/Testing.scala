package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Testing API
  *
  * Allows developers to run automated tests for their mobile applications on
  * Google infrastructure.
  *
  * @example
  * const {google} = require('googleapis');
  * const testing = google.testing('v1');
  *
  * @namespace testing
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Testing
  */
@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Testing")
@js.native
class Testing protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var applicationDetailService: Resource$Applicationdetailservice = js.native
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
  var testEnvironmentCatalog: Resource$Testenvironmentcatalog = js.native
}

