package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultKmsKeyName extends js.Object {
  var defaultKmsKeyName: js.UndefOr[String] = js.native
}

object AnonDefaultKmsKeyName {
  @scala.inline
  def apply(defaultKmsKeyName: String = null): AnonDefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    if (defaultKmsKeyName != null) __obj.updateDynamic("defaultKmsKeyName")(defaultKmsKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultKmsKeyName]
  }
}

