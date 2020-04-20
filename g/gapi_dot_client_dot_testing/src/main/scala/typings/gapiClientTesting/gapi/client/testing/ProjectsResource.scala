package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var testMatrices: TestMatricesResource
}

object ProjectsResource {
  @scala.inline
  def apply(testMatrices: TestMatricesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(testMatrices = testMatrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
}

