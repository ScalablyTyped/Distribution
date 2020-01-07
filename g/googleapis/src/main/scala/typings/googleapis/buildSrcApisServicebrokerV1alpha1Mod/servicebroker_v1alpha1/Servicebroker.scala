package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Broker API
  *
  * The Google Cloud Platform Service Broker API provides Google hosted
  * implementation of the Open Service Broker API
  * (https://www.openservicebrokerapi.org/).
  *
  * @example
  * const {google} = require('googleapis');
  * const servicebroker = google.servicebroker('v1alpha1');
  *
  * @namespace servicebroker
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Servicebroker
  */
@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Servicebroker")
@js.native
class Servicebroker protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
  var v1alpha1: Resource$V1alpha1 = js.native
}

