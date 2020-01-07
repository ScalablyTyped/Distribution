package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Genomics API
  *
  * Uploads, processes, queries, and searches Genomics data in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const genomics = google.genomics('v2alpha1');
  *
  * @namespace genomics
  * @type {Function}
  * @version v2alpha1
  * @variation v2alpha1
  * @param {object=} options Options for Genomics
  */
@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Genomics")
@js.native
class Genomics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pipelines: Resource$Pipelines = js.native
  var projects: Resource$Projects = js.native
  var workers: Resource$Workers = js.native
}

