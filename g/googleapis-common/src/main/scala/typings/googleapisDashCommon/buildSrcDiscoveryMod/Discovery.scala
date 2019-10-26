package typings.googleapisDashCommon.buildSrcDiscoveryMod

import typings.googleapisDashCommon.Anon_Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/discovery", "Discovery")
@js.native
class Discovery protected () extends js.Object {
  /**
    * Discovery for discovering API endpoints
    *
    * @param options Options for discovery
    */
  def this(options: DiscoveryOptions) = this()
  /**
    * Log output of generator. Works just like console.log
    */
  var log: js.Any = js.native
  /**
    * Generate and Endpoint from an endpoint schema object.
    *
    * @param schema The schema from which to generate the Endpoint.
    * @return A function that creates an endpoint.
    */
  var makeEndpoint: js.Any = js.native
  var options: js.Any = js.native
  var transporter: js.Any = js.native
  /**
    * Generate API file given discovery URL
    *
    * @param apiDiscoveryUrl URL or filename of discovery doc for API
    * @returns A promise that resolves with a function that creates the endpoint
    */
  def discoverAPI(apiDiscoveryUrl: String): js.Promise[EndpointCreator] = js.native
  def discoverAPI(apiDiscoveryUrl: Anon_Url): js.Promise[EndpointCreator] = js.native
  /**
    * Generate all APIs and return as in-memory object.
    * @param discoveryUrl
    */
  def discoverAllAPIs(discoveryUrl: String): js.Promise[js.Object] = js.native
}

