package typings.formol.mod

import typings.formol.AnonK
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchButtonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var i18n: js.UndefOr[AnonK] = js.undefined
  var leftLabel: js.UndefOr[ReactNode] = js.undefined
  var rightLabel: js.UndefOr[ReactNode] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SwitchButtonProps {
  @scala.inline
  def apply(
    className: String = null,
    i18n: AnonK = null,
    leftLabel: ReactNode = null,
    rightLabel: ReactNode = null,
    `type`: String = null
  ): SwitchButtonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchButtonProps]
  }
}

