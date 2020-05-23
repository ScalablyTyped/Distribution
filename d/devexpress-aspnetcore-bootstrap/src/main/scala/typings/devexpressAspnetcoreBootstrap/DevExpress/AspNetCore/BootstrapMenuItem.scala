package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMenuItem extends js.Object {
  val index: Double
  val indexPath: String
  val instance: js.Any
  val menu: BootstrapMenu | Null
  val name: String
  val parent: BootstrapMenuItem | Null
  def getBadgeIconCssClass(): String
  def getBadgeText(): String
  def getChecked(): Boolean
  def getEnabled(): Boolean
  def getIconCssClass(): String
  def getImageUrl(): String
  def getItem(index: Double): BootstrapMenuItem | Null
  def getItemByName(name: String): BootstrapMenuItem | Null
  def getItemCount(): Double
  def getNavigateUrl(): String
  def getText(): String
  def getVisible(): Boolean
  def setBadgeIconCssClass(cssClass: String): Unit
  def setBadgeText(text: String): Unit
  def setChecked(value: Boolean): Unit
  def setEnabled(value: Boolean): Unit
  def setIconCssClass(cssClass: String): Unit
  def setImageUrl(value: String): Unit
  def setNavigateUrl(value: String): Unit
  def setText(value: String): Unit
  def setVisible(value: Boolean): Unit
}

object BootstrapMenuItem {
  @scala.inline
  def apply(
    getBadgeIconCssClass: () => String,
    getBadgeText: () => String,
    getChecked: () => Boolean,
    getEnabled: () => Boolean,
    getIconCssClass: () => String,
    getImageUrl: () => String,
    getItem: Double => BootstrapMenuItem | Null,
    getItemByName: String => BootstrapMenuItem | Null,
    getItemCount: () => Double,
    getNavigateUrl: () => String,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    indexPath: String,
    instance: js.Any,
    name: String,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setChecked: Boolean => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit,
    menu: BootstrapMenu = null,
    parent: BootstrapMenuItem = null
  ): BootstrapMenuItem = {
    val __obj = js.Dynamic.literal(getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getChecked = js.Any.fromFunction0(getChecked), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setChecked = js.Any.fromFunction1(setChecked), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible), menu = menu.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapMenuItem]
  }
}

