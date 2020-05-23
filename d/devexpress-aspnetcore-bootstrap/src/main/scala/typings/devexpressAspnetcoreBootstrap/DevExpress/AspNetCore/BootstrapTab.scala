package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTab extends js.Object {
  val index: Double
  val instance: js.Any
  val name: String
  val tabControl: BootstrapTabControl | Null
  def getActiveIconCssClass(): String
  def getActiveImageUrl(): String
  def getBadgeIconCssClass(): String
  def getBadgeText(): String
  def getEnabled(): Boolean
  def getIconCssClass(): String
  def getImageUrl(): String
  def getNavigateUrl(): String
  def getText(): String
  def getVisible(): Boolean
  def setActiveIconCssClass(cssClass: String): Unit
  def setActiveImageUrl(value: String): Unit
  def setBadgeIconCssClass(cssClass: String): Unit
  def setBadgeText(text: String): Unit
  def setEnabled(value: Boolean): Unit
  def setIconCssClass(cssClass: String): Unit
  def setImageUrl(value: String): Unit
  def setNavigateUrl(value: String): Unit
  def setText(value: String): Unit
  def setVisible(value: Boolean): Unit
}

object BootstrapTab {
  @scala.inline
  def apply(
    getActiveIconCssClass: () => String,
    getActiveImageUrl: () => String,
    getBadgeIconCssClass: () => String,
    getBadgeText: () => String,
    getEnabled: () => Boolean,
    getIconCssClass: () => String,
    getImageUrl: () => String,
    getNavigateUrl: () => String,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    instance: js.Any,
    name: String,
    setActiveIconCssClass: String => Unit,
    setActiveImageUrl: String => Unit,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit,
    tabControl: BootstrapTabControl = null
  ): BootstrapTab = {
    val __obj = js.Dynamic.literal(getActiveIconCssClass = js.Any.fromFunction0(getActiveIconCssClass), getActiveImageUrl = js.Any.fromFunction0(getActiveImageUrl), getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setActiveIconCssClass = js.Any.fromFunction1(setActiveIconCssClass), setActiveImageUrl = js.Any.fromFunction1(setActiveImageUrl), setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible), tabControl = tabControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTab]
  }
}

