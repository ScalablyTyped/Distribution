package typings.fundamentalDashReact.libFormsFormMessageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormMessageProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[FormMessageType] = js.undefined
}

object FormMessageProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    `type`: FormMessageType = null
  ): FormMessageProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FormMessageProps]
  }
}

