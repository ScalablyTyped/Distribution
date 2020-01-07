package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Poly API
  *
  * The Poly API provides read access to assets hosted on &lt;a
  * href=&quot;https://poly.google.com&quot;&gt;poly.google.com&lt;/a&gt; to
  * all, and upload access to &lt;a
  * href=&quot;https://poly.google.com&quot;&gt;poly.google.com&lt;/a&gt; for
  * whitelisted accounts.
  *
  * @example
  * const {google} = require('googleapis');
  * const poly = google.poly('v1');
  *
  * @namespace poly
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Poly
  */
@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Poly")
@js.native
class Poly protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var assets: Resource$Assets = js.native
  var context: APIRequestContext = js.native
  var users: Resource$Users = js.native
}

