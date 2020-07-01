package typings.giustoInkRouter.mod

import typings.giustoInkRouter.anon.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var initialEntries: js.UndefOr[js.Array[String | Hash]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var keyLength: js.UndefOr[Double] = js.undefined
}

object RouterProps {
  @scala.inline
  def apply(
    getUserConfirmation: () => Unit = null,
    initialEntries: js.Array[String | Hash] = null,
    initialIndex: js.UndefOr[Double] = js.undefined,
    keyLength: js.UndefOr[Double] = js.undefined
  ): RouterProps = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction0(getUserConfirmation))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyLength)) __obj.updateDynamic("keyLength")(keyLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterProps]
  }
}

