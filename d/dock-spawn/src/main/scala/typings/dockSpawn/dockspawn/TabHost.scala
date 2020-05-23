package typings.dockSpawn.dockspawn

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tab Host control contains tabs known as TabPages.
  * The tab strip can be aligned in different orientations
  */
trait TabHost extends js.Object {
  var contentElement: HTMLDivElement
  var displayCloseButton: Boolean
  var hostElement: HTMLDivElement
  var pages: js.Array[TabPage]
  var separatorElement: HTMLDivElement
  var tabListElement: HTMLDivElement
  var tabStripDirection: TabStripDirection
  /** Set the selected TabPage. */
  def onTabPageSelected(page: TabPage): Unit
  def resize(width: Double, height: Double): Unit
  def setActiveTab(container: PanelContainer): Unit
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
}

