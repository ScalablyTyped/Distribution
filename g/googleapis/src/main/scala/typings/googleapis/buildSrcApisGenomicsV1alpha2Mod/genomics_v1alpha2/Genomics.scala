package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

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
  * const genomics = google.genomics('v1alpha2');
  *
  * @namespace genomics
  * @type {Function}
  * @version v1alpha2
  * @variation v1alpha2
  * @param {object=} options Options for Genomics
  */
@JSImport("googleapis/build/src/apis/genomics/v1alpha2", "genomics_v1alpha2.Genomics")
@js.native
class Genomics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var pipelines: Resource$Pipelines = js.native
}

