package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manufacturer Center API
  *
  * Public API for managing Manufacturer Center related data.
  *
  * @example
  * const {google} = require('googleapis');
  * const manufacturers = google.manufacturers('v1');
  *
  * @namespace manufacturers
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Manufacturers
  */
@JSImport("googleapis/build/src/apis/manufacturers/v1", "manufacturers_v1.Manufacturers")
@js.native
class Manufacturers protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var context: APIRequestContext = js.native
}

