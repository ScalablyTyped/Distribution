package typings.atGoogleDashCloudCommon.atGoogleDashCloudCommonMod

import typings.atGoogleDashCloudCommon.buildSrcServiceMod.ServiceConfig
import typings.atGoogleDashCloudCommon.buildSrcServiceMod.ServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common", "Service")
@js.native
class Service protected ()
  extends typings.atGoogleDashCloudCommon.buildSrcServiceMod.Service {
  /**
    * Service is a base class, meant to be inherited from by a "service," like
    * BigQuery or Storage.
    *
    * This handles making authenticated requests by exposing a `makeReq_`
    * function.
    *
    * @constructor
    * @alias module:common/service
    *
    * @param {object} config - Configuration object.
    * @param {string} config.baseUrl - The base URL to make API requests to.
    * @param {string[]} config.scopes - The scopes required for the request.
    * @param {object=} options - [Configuration object](#/docs).
    */
  def this(config: ServiceConfig) = this()
  def this(config: ServiceConfig, options: ServiceOptions) = this()
}

