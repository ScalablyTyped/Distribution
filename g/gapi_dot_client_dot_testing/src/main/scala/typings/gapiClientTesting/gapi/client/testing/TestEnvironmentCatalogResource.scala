package typings.gapiClientTesting.gapi.client.testing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTesting.AnonBearertoken
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
  def get(request: AnonBearertoken): Request_[TestEnvironmentCatalog]
}

object TestEnvironmentCatalogResource {
  @scala.inline
  def apply(get: AnonBearertoken => Request_[TestEnvironmentCatalog]): TestEnvironmentCatalogResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TestEnvironmentCatalogResource]
  }
}

