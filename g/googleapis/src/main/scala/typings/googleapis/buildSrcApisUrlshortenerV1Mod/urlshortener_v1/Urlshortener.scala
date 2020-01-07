package typings.googleapis.buildSrcApisUrlshortenerV1Mod.urlshortener_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URL Shortener API
  *
  * Lets you create, inspect, and manage goo.gl short URLs
  *
  * @example
  * const {google} = require('googleapis');
  * const urlshortener = google.urlshortener('v1');
  *
  * @namespace urlshortener
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Urlshortener
  */
@JSImport("googleapis/build/src/apis/urlshortener/v1", "urlshortener_v1.Urlshortener")
@js.native
class Urlshortener protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var url: Resource$Url = js.native
}

