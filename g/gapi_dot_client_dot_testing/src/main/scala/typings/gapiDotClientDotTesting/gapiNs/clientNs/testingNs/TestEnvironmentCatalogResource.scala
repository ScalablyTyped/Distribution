package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTesting.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironmentCatalogResource extends js.Object {
  /**
    * Get the catalog of supported test environments.
    *
    * May return any of the following canonical error codes:
    *
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the environment type does not exist
    * - INTERNAL - if an internal error occurred
    */
  def get(request: Anon_AccesstokenAltBearertoken): Request[TestEnvironmentCatalog]
}

object TestEnvironmentCatalogResource {
  @scala.inline
  def apply(get: Anon_AccesstokenAltBearertoken => Request[TestEnvironmentCatalog]): TestEnvironmentCatalogResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TestEnvironmentCatalogResource]
  }
}

