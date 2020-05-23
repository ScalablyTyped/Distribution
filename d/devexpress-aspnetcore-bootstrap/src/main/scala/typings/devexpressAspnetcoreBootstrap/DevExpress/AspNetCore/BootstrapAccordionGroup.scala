package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapAccordionGroup extends js.Object {
  val index: Double
  val instance: js.Any
  val name: String
  val navBar: BootstrapAccordion | Null
  def getEnabled(): Boolean
  def getExpanded(): Boolean
  def getHeaderBadgeIconCssClass(): String
  def getHeaderBadgeText(): String
  def getItem(index: Double): BootstrapAccordionItem | Null
  def getItemByName(name: String): BootstrapAccordionItem | Null
  def getItemCount(): Double
  def getText(): String
  def getVisible(): Boolean
  def setExpanded(value: Boolean): Unit
  def setHeaderBadgeIconCssClass(cssClass: String): Unit
  def setHeaderBadgeText(text: String): Unit
  def setText(text: String): Unit
  def setVisible(value: Boolean): Unit
}

object BootstrapAccordionGroup {
  @scala.inline
  def apply(
    getEnabled: () => Boolean,
    getExpanded: () => Boolean,
    getHeaderBadgeIconCssClass: () => String,
    getHeaderBadgeText: () => String,
    getItem: Double => BootstrapAccordionItem | Null,
    getItemByName: String => BootstrapAccordionItem | Null,
    getItemCount: () => Double,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    instance: js.Any,
    name: String,
    setExpanded: Boolean => Unit,
    setHeaderBadgeIconCssClass: String => Unit,
    setHeaderBadgeText: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit,
    navBar: BootstrapAccordion = null
  ): BootstrapAccordionGroup = {
    val __obj = js.Dynamic.literal(getEnabled = js.Any.fromFunction0(getEnabled), getExpanded = js.Any.fromFunction0(getExpanded), getHeaderBadgeIconCssClass = js.Any.fromFunction0(getHeaderBadgeIconCssClass), getHeaderBadgeText = js.Any.fromFunction0(getHeaderBadgeText), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded), setHeaderBadgeIconCssClass = js.Any.fromFunction1(setHeaderBadgeIconCssClass), setHeaderBadgeText = js.Any.fromFunction1(setHeaderBadgeText), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible), navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapAccordionGroup]
  }
}

