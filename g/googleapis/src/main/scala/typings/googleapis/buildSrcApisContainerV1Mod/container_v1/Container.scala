package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kubernetes Engine API
  *
  * Builds and manages container-based applications, powered by the open source
  * Kubernetes technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const container = google.container('v1');
  *
  * @namespace container
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Container
  */
@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Container")
@js.native
class Container protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

