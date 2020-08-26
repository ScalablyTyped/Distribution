package typings.fundamentalReact.panelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelFiltersProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
}

object PanelFiltersProps {
  @scala.inline
  def apply(): PanelFiltersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelFiltersProps]
  }
  @scala.inline
  implicit class PanelFiltersPropsOps[Self <: PanelFiltersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

