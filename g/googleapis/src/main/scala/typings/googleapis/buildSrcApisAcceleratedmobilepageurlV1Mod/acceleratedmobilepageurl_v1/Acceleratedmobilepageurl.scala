package typings.googleapis.buildSrcApisAcceleratedmobilepageurlV1Mod.acceleratedmobilepageurl_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accelerated Mobile Pages (AMP) URL API
  *
  * Retrieves the list of AMP URLs (and equivalent AMP Cache URLs) for a given
  * list of public URL(s).
  *
  * @example
  * const {google} = require('googleapis');
  * const acceleratedmobilepageurl = google.acceleratedmobilepageurl('v1');
  *
  * @namespace acceleratedmobilepageurl
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Acceleratedmobilepageurl
  */
@JSImport("googleapis/build/src/apis/acceleratedmobilepageurl/v1", "acceleratedmobilepageurl_v1.Acceleratedmobilepageurl")
@js.native
class Acceleratedmobilepageurl protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var ampUrls: Resource$Ampurls = js.native
  var context: APIRequestContext = js.native
}

