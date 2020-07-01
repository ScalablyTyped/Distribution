package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultKmsKeyName extends js.Object {
  var defaultKmsKeyName: js.UndefOr[String] = js.native
}

object DefaultKmsKeyName {
  @scala.inline
  def apply(defaultKmsKeyName: String = null): DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    if (defaultKmsKeyName != null) __obj.updateDynamic("defaultKmsKeyName")(defaultKmsKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultKmsKeyName]
  }
}

