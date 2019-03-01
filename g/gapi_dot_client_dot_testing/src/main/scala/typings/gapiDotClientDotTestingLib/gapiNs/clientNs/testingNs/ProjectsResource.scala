package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var testMatrices: TestMatricesResource
}

object ProjectsResource {
  @scala.inline
  def apply(testMatrices: TestMatricesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("testMatrices")(testMatrices)
    __obj.asInstanceOf[ProjectsResource]
  }
}

