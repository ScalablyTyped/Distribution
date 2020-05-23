package typings.gapiClientTesting.gapi.client.testing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTesting.anon.Bearertoken
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
  def get(request: Bearertoken): Request[TestEnvironmentCatalog]
}

object TestEnvironmentCatalogResource {
  @scala.inline
  def apply(get: Bearertoken => Request[TestEnvironmentCatalog]): TestEnvironmentCatalogResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TestEnvironmentCatalogResource]
  }
}

