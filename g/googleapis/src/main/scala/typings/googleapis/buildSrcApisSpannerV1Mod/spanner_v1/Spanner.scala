package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Spanner API
  *
  * Cloud Spanner is a managed, mission-critical, globally consistent and
  * scalable relational database service.
  *
  * @example
  * const {google} = require('googleapis');
  * const spanner = google.spanner('v1');
  *
  * @namespace spanner
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Spanner
  */
@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Spanner")
@js.native
class Spanner protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

