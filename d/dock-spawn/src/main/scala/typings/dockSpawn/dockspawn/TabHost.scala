package typings.dockSpawn.dockspawn

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tab Host control contains tabs known as TabPages.
  * The tab strip can be aligned in different orientations
  */
@js.native
trait TabHost extends js.Object {
  var contentElement: HTMLDivElement = js.native
  var displayCloseButton: Boolean = js.native
  var hostElement: HTMLDivElement = js.native
  var pages: js.Array[TabPage] = js.native
  var separatorElement: HTMLDivElement = js.native
  var tabListElement: HTMLDivElement = js.native
  var tabStripDirection: TabStripDirection = js.native
  /** Set the selected TabPage. */
  def onTabPageSelected(page: TabPage): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setActiveTab(container: PanelContainer): Unit = js.native
}

object TabHost {
  @scala.inline
  def apply(
    contentElement: HTMLDivElement,
    displayCloseButton: Boolean,
    hostElement: HTMLDivElement,
    onTabPageSelected: TabPage => Unit,
    pages: js.Array[TabPage],
    resize: (Double, Double) => Unit,
    separatorElement: HTMLDivElement,
    setActiveTab: PanelContainer => Unit,
    tabListElement: HTMLDivElement,
    tabStripDirection: TabStripDirection
  ): TabHost = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], displayCloseButton = displayCloseButton.asInstanceOf[js.Any], hostElement = hostElement.asInstanceOf[js.Any], onTabPageSelected = js.Any.fromFunction1(onTabPageSelected), pages = pages.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), separatorElement = separatorElement.asInstanceOf[js.Any], setActiveTab = js.Any.fromFunction1(setActiveTab), tabListElement = tabListElement.asInstanceOf[js.Any], tabStripDirection = tabStripDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabHost]
  }
  @scala.inline
  implicit class TabHostOps[Self <: TabHost] (val x: Self) extends AnyVal {
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
    def setContentElement(value: HTMLDivElement): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayCloseButton(value: Boolean): Self = this.set("displayCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostElement(value: HTMLDivElement): Self = this.set("hostElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTabPageSelected(value: TabPage => Unit): Self = this.set("onTabPageSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setPagesVarargs(value: TabPage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[TabPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: (Double, Double) => Unit): Self = this.set("resize", js.Any.fromFunction2(value))
    @scala.inline
    def setSeparatorElement(value: HTMLDivElement): Self = this.set("separatorElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetActiveTab(value: PanelContainer => Unit): Self = this.set("setActiveTab", js.Any.fromFunction1(value))
    @scala.inline
    def setTabListElement(value: HTMLDivElement): Self = this.set("tabListElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabStripDirection(value: TabStripDirection): Self = this.set("tabStripDirection", value.asInstanceOf[js.Any])
  }
  
}

