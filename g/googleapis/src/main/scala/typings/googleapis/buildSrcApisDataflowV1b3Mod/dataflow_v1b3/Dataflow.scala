package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dataflow API
  *
  * Manages Google Cloud Dataflow projects on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const dataflow = google.dataflow('v1b3');
  *
  * @namespace dataflow
  * @type {Function}
  * @version v1b3
  * @variation v1b3
  * @param {object=} options Options for Dataflow
  */
@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Dataflow")
@js.native
class Dataflow protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

