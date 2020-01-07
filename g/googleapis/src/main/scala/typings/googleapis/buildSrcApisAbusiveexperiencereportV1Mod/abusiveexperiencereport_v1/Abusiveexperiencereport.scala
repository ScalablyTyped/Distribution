package typings.googleapis.buildSrcApisAbusiveexperiencereportV1Mod.abusiveexperiencereport_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Abusive Experience Report API
  *
  * Views Abusive Experience Report data, and gets a list of sites that have a
  * significant number of abusive experiences.
  *
  * @example
  * const {google} = require('googleapis');
  * const abusiveexperiencereport = google.abusiveexperiencereport('v1');
  *
  * @namespace abusiveexperiencereport
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Abusiveexperiencereport
  */
@JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Abusiveexperiencereport")
@js.native
class Abusiveexperiencereport protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var sites: Resource$Sites = js.native
  var violatingSites: Resource$Violatingsites = js.native
}

