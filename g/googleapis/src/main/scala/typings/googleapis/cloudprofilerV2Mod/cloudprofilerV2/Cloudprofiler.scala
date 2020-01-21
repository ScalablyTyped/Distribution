package typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
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
  var projects: ResourceProjects = js.native
}

