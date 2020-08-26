package typings.gestalt.mod

import typings.gestalt.anon.ActiveTabIndex
import typings.gestalt.anon.Href
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var activeTabIndex: Double = js.native
  var size: js.UndefOr[md | lg] = js.native
  var tabs: js.Array[Href] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
  def onChange(args: ActiveTabIndex): Unit = js.native
}

object TabsProps {
  @scala.inline
  def apply(activeTabIndex: Double, onChange: ActiveTabIndex => Unit, tabs: js.Array[Href]): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setActiveTabIndex(value: Double): Self = this.set("activeTabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: ActiveTabIndex => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTabsVarargs(value: Href*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Href]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: md | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

