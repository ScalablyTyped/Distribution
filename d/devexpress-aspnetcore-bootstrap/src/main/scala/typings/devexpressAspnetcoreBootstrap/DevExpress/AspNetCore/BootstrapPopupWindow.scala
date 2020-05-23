package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapPopupWindow extends js.Object {
  val index: Double
  val instance: js.Any
  val name: String
  val popupControl: BootstrapPopupControl | Null
  def getFooterImageUrl(): String
  def getFooterNavigateUrl(): String
  def getFooterText(): String
  def getHeaderImageUrl(): String
  def getHeaderNavigateUrl(): String
  def getHeaderText(): String
  def setFooterImageUrl(value: String): Unit
  def setFooterNavigateUrl(value: String): Unit
  def setFooterText(value: String): Unit
  def setHeaderImageUrl(value: String): Unit
  def setHeaderNavigateUrl(value: String): Unit
  def setHeaderText(value: String): Unit
}

object BootstrapPopupWindow {
  @scala.inline
  def apply(
    getFooterImageUrl: () => String,
    getFooterNavigateUrl: () => String,
    getFooterText: () => String,
    getHeaderImageUrl: () => String,
    getHeaderNavigateUrl: () => String,
    getHeaderText: () => String,
    index: Double,
    instance: js.Any,
    name: String,
    setFooterImageUrl: String => Unit,
    setFooterNavigateUrl: String => Unit,
    setFooterText: String => Unit,
    setHeaderImageUrl: String => Unit,
    setHeaderNavigateUrl: String => Unit,
    setHeaderText: String => Unit,
    popupControl: BootstrapPopupControl = null
  ): BootstrapPopupWindow = {
    val __obj = js.Dynamic.literal(getFooterImageUrl = js.Any.fromFunction0(getFooterImageUrl), getFooterNavigateUrl = js.Any.fromFunction0(getFooterNavigateUrl), getFooterText = js.Any.fromFunction0(getFooterText), getHeaderImageUrl = js.Any.fromFunction0(getHeaderImageUrl), getHeaderNavigateUrl = js.Any.fromFunction0(getHeaderNavigateUrl), getHeaderText = js.Any.fromFunction0(getHeaderText), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFooterImageUrl = js.Any.fromFunction1(setFooterImageUrl), setFooterNavigateUrl = js.Any.fromFunction1(setFooterNavigateUrl), setFooterText = js.Any.fromFunction1(setFooterText), setHeaderImageUrl = js.Any.fromFunction1(setHeaderImageUrl), setHeaderNavigateUrl = js.Any.fromFunction1(setHeaderNavigateUrl), setHeaderText = js.Any.fromFunction1(setHeaderText), popupControl = popupControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapPopupWindow]
  }
}

