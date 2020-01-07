package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details about how to run the execution.
  */
@js.native
trait Schema$Specification extends js.Object {
  /**
    * An Android mobile test execution specification.
    */
  var androidTest: js.UndefOr[Schema$AndroidTest] = js.native
}

object Schema$Specification {
  @scala.inline
  def apply(androidTest: Schema$AndroidTest = null): Schema$Specification = {
    val __obj = js.Dynamic.literal()
    if (androidTest != null) __obj.updateDynamic("androidTest")(androidTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Specification]
  }
}

