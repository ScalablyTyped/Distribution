package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replica Pool API
  *
  * The Replica Pool API allows users to declaratively provision and manage
  * groups of Google Compute Engine instances based on a common template.
  *
  * @example
  * const {google} = require('googleapis');
  * const replicapool = google.replicapool('v1beta1');
  *
  * @namespace replicapool
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Replicapool
  */
@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Replicapool")
@js.native
class Replicapool protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pools: Resource$Pools = js.native
  var replicas: Resource$Replicas = js.native
}

