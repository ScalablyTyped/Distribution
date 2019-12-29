package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Ref
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomStyles extends js.Object {
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref[HTMLUListElement]] = js.undefined
}

object Anon_CustomStyles {
  @scala.inline
  def apply(
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    ref: Ref[HTMLUListElement] = null
  ): Anon_CustomStyles = {
    val __obj = js.Dynamic.literal()
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomStyles]
  }
}

