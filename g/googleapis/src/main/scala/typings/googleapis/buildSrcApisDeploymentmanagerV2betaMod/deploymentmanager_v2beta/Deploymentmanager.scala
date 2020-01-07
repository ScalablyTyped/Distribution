package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Deployment Manager API V2Beta Methods
  *
  * The Deployment Manager API allows users to declaratively configure, deploy
  * and run complex solutions on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('v2beta');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version v2beta
  * @variation v2beta
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis/build/src/apis/deploymentmanager/v2beta", "deploymentmanager_v2beta.Deploymentmanager")
@js.native
class Deploymentmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var compositeTypes: Resource$Compositetypes = js.native
  var context: APIRequestContext = js.native
  var deployments: Resource$Deployments = js.native
  var manifests: Resource$Manifests = js.native
  var operations: Resource$Operations = js.native
  var resources: Resource$Resources = js.native
  var typeProviders: Resource$Typeproviders = js.native
  var types: Resource$Types = js.native
}

