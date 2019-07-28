package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestBox extends js.Object {
  def addKeyDownHandler(handler: Handler): SuggestBox = js.native
  def addKeyPressHandler(handler: Handler): SuggestBox = js.native
  def addKeyUpHandler(handler: Handler): SuggestBox = js.native
  def addSelectionHandler(handler: Handler): SuggestBox = js.native
  def addStyleDependentName(styleName: String): SuggestBox = js.native
  def addStyleName(styleName: String): SuggestBox = js.native
  def addValueChangeHandler(handler: Handler): SuggestBox = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setAccessKey(accessKey: Char): SuggestBox = js.native
  def setAnimationEnabled(animationEnabled: Boolean): SuggestBox = js.native
  def setAutoSelectEnabled(autoSelectEnabled: Boolean): SuggestBox = js.native
  def setFocus(focus: Boolean): SuggestBox = js.native
  def setHeight(height: String): SuggestBox = js.native
  def setId(id: String): SuggestBox = js.native
  def setLayoutData(layout: js.Any): SuggestBox = js.native
  def setLimit(limit: Integer): SuggestBox = js.native
  def setPixelSize(width: Integer, height: Integer): SuggestBox = js.native
  def setPopupStyleName(styleName: String): SuggestBox = js.native
  def setSize(width: String, height: String): SuggestBox = js.native
  def setStyleAttribute(attribute: String, value: String): SuggestBox = js.native
  def setStyleAttributes(attributes: js.Any): SuggestBox = js.native
  def setStyleName(styleName: String): SuggestBox = js.native
  def setStylePrimaryName(styleName: String): SuggestBox = js.native
  def setTabIndex(index: Integer): SuggestBox = js.native
  def setTag(tag: String): SuggestBox = js.native
  def setText(text: String): SuggestBox = js.native
  def setTitle(title: String): SuggestBox = js.native
  def setValue(value: String): SuggestBox = js.native
  def setValue(value: String, fireEvents: Boolean): SuggestBox = js.native
  def setVisible(visible: Boolean): SuggestBox = js.native
  def setWidth(width: String): SuggestBox = js.native
}

