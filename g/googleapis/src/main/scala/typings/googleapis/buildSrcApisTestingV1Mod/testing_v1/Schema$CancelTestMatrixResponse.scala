package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing the current state of the specified test matrix.
  */
@js.native
trait Schema$CancelTestMatrixResponse extends js.Object {
  /**
    * The current rolled-up state of the test matrix. If this state is already
    * final, then the cancelation request will have no effect.
    */
  var testState: js.UndefOr[String] = js.native
}

object Schema$CancelTestMatrixResponse {
  @scala.inline
  def apply(testState: String = null): Schema$CancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    if (testState != null) __obj.updateDynamic("testState")(testState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CancelTestMatrixResponse]
  }
}

