package typings
package atGoogleDashCloudCommonLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src", "Service")
@js.native
class Service protected ()
  extends atGoogleDashCloudCommonLib.buildSrcServiceMod.Service {
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
  def this(config: atGoogleDashCloudCommonLib.buildSrcServiceMod.ServiceConfig) = this()
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
  def this(config: atGoogleDashCloudCommonLib.buildSrcServiceMod.ServiceConfig, options: atGoogleDashCloudCommonLib.buildSrcServiceMod.ServiceOptions) = this()
}

