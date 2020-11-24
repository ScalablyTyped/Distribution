package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ad Experience Report API
  *
  * Views Ad Experience Report data, and gets a list of sites that have a
  * significant number of annoying ads.
  *
  * @example
  * const {google} = require('googleapis');
  * const adexperiencereport = google.adexperiencereport('v1');
  *
  * @namespace adexperiencereport
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Adexperiencereport
  */
@JSImport("googleapis/build/src/apis/adexperiencereport/v1", "adexperiencereport_v1.Adexperiencereport")
@js.native
class Adexperiencereport protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var sites: ResourceSites = js.native
  
  var violatingSites: ResourceViolatingsites = js.native
}
