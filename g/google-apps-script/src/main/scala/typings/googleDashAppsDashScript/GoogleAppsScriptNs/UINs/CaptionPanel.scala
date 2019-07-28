package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionPanel extends js.Object {
  def add(widget: Widget): CaptionPanel
  def addStyleDependentName(styleName: String): CaptionPanel
  def addStyleName(styleName: String): CaptionPanel
  def clear(): CaptionPanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setCaptionText(text: String): CaptionPanel
  def setContentWidget(widget: Widget): CaptionPanel
  def setHeight(height: String): CaptionPanel
  def setId(id: String): CaptionPanel
  def setLayoutData(layout: js.Any): CaptionPanel
  def setPixelSize(width: Integer, height: Integer): CaptionPanel
  def setSize(width: String, height: String): CaptionPanel
  def setStyleAttribute(attribute: String, value: String): CaptionPanel
  def setStyleAttributes(attributes: js.Any): CaptionPanel
  def setStyleName(styleName: String): CaptionPanel
  def setStylePrimaryName(styleName: String): CaptionPanel
  def setTag(tag: String): CaptionPanel
  def setText(text: String): CaptionPanel
  def setTitle(title: String): CaptionPanel
  def setVisible(visible: Boolean): CaptionPanel
  def setWidget(widget: Widget): CaptionPanel
  def setWidth(width: String): CaptionPanel
}

object CaptionPanel {
  @scala.inline
  def apply(
    add: Widget => CaptionPanel,
    addStyleDependentName: String => CaptionPanel,
    addStyleName: String => CaptionPanel,
    clear: () => CaptionPanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setCaptionText: String => CaptionPanel,
    setContentWidget: Widget => CaptionPanel,
    setHeight: String => CaptionPanel,
    setId: String => CaptionPanel,
    setLayoutData: js.Any => CaptionPanel,
    setPixelSize: (Integer, Integer) => CaptionPanel,
    setSize: (String, String) => CaptionPanel,
    setStyleAttribute: (String, String) => CaptionPanel,
    setStyleAttributes: js.Any => CaptionPanel,
    setStyleName: String => CaptionPanel,
    setStylePrimaryName: String => CaptionPanel,
    setTag: String => CaptionPanel,
    setText: String => CaptionPanel,
    setTitle: String => CaptionPanel,
    setVisible: Boolean => CaptionPanel,
    setWidget: Widget => CaptionPanel,
    setWidth: String => CaptionPanel
  ): CaptionPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setCaptionText = js.Any.fromFunction1(setCaptionText), setContentWidget = js.Any.fromFunction1(setContentWidget), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[CaptionPanel]
  }
}

