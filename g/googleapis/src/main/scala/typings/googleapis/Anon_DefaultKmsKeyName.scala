package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultKmsKeyName extends js.Object {
  var defaultKmsKeyName: js.UndefOr[String] = js.native
}

object Anon_DefaultKmsKeyName {
  @scala.inline
  def apply(defaultKmsKeyName: String = null): Anon_DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    if (defaultKmsKeyName != null) __obj.updateDynamic("defaultKmsKeyName")(defaultKmsKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultKmsKeyName]
  }
}

