package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Specification extends js.Object {
  /** An Android mobile test execution specification. */
  var androidTest: js.UndefOr[AndroidTest] = js.undefined
}

object Specification {
  @scala.inline
  def apply(androidTest: AndroidTest = null): Specification = {
    val __obj = js.Dynamic.literal()
    if (androidTest != null) __obj.updateDynamic("androidTest")(androidTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specification]
  }
}

