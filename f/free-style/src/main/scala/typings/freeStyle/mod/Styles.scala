package typings.freeStyle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles
  extends /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]] {
  @JSName("$displayName")
  var $displayName: js.UndefOr[String] = js.undefined
  @JSName("$unique")
  var $unique: js.UndefOr[Boolean] = js.undefined
}

object Styles {
  @scala.inline
  def apply(
    $displayName: String = null,
    $unique: js.UndefOr[Boolean] = js.undefined,
    StringDictionary: /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]] = null
  ): Styles = {
    val __obj = js.Dynamic.literal()
    if ($displayName != null) __obj.updateDynamic("$displayName")($displayName.asInstanceOf[js.Any])
    if (!js.isUndefined($unique)) __obj.updateDynamic("$unique")($unique.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Styles]
  }
}

