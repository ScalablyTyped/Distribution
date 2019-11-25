package typings.atFirebaseAuthDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  var displayName: js.UndefOr[String | Null] = js.undefined
  var photoURL: js.UndefOr[String | Null] = js.undefined
}

object Anon_DisplayName {
  @scala.inline
  def apply(displayName: String = null, photoURL: String = null): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

