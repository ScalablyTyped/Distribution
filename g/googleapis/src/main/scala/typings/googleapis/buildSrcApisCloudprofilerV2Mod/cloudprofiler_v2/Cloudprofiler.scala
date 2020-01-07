package typings.googleapis.buildSrcApisCloudprofilerV2Mod.cloudprofiler_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Profiler API
  *
  * Manages continuous profiling information.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudprofiler = google.cloudprofiler('v2');
  *
  * @namespace cloudprofiler
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudprofiler
  */
@JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Cloudprofiler")
@js.native
class Cloudprofiler protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

