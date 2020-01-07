package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Safe Browsing API
  *
  * Enables client applications to check web resources (most commonly URLs)
  * against Google-generated lists of unsafe web resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const safebrowsing = google.safebrowsing('v4');
  *
  * @namespace safebrowsing
  * @type {Function}
  * @version v4
  * @variation v4
  * @param {object=} options Options for Safebrowsing
  */
@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Safebrowsing")
@js.native
class Safebrowsing protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var encodedFullHashes: Resource$Encodedfullhashes = js.native
  var encodedUpdates: Resource$Encodedupdates = js.native
  var fullHashes: Resource$Fullhashes = js.native
  var threatHits: Resource$Threathits = js.native
  var threatListUpdates: Resource$Threatlistupdates = js.native
  var threatLists: Resource$Threatlists = js.native
  var threatMatches: Resource$Threatmatches = js.native
}

