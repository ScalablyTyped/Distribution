package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Dataproc API
  *
  * Manages Hadoop-based clusters and jobs on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const dataproc = google.dataproc('v1');
  *
  * @namespace dataproc
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Dataproc
  */
@JSImport("googleapis/build/src/apis/dataproc/v1", "dataproc_v1.Dataproc")
@js.native
class Dataproc protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

