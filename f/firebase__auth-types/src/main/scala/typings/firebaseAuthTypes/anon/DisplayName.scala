package typings.firebaseAuthTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  var displayName: js.UndefOr[String | Null] = js.undefined
  var photoURL: js.UndefOr[String | Null] = js.undefined
}

object DisplayName {
  @scala.inline
  def apply(
    displayName: js.UndefOr[Null | String] = js.undefined,
    photoURL: js.UndefOr[Null | String] = js.undefined
  ): DisplayName = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(photoURL)) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

