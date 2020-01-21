package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTestMatrixResponse extends js.Object {
  /**
    * The current rolled-up state of the test matrix.
    * If this state is already final, then the cancelation request will
    * have no effect.
    */
  var testState: js.UndefOr[String] = js.undefined
}

object CancelTestMatrixResponse {
  @scala.inline
  def apply(testState: String = null): CancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    if (testState != null) __obj.updateDynamic("testState")(testState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTestMatrixResponse]
  }
}

