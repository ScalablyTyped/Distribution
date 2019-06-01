package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionPanel extends js.Object {
  def add(widget: Widget): CaptionPanel
  def addStyleDependentName(styleName: java.lang.String): CaptionPanel
  def addStyleName(styleName: java.lang.String): CaptionPanel
  def clear(): CaptionPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setCaptionText(text: java.lang.String): CaptionPanel
  def setContentWidget(widget: Widget): CaptionPanel
  def setHeight(height: java.lang.String): CaptionPanel
  def setId(id: java.lang.String): CaptionPanel
  def setLayoutData(layout: js.Any): CaptionPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): CaptionPanel
  def setSize(width: java.lang.String, height: java.lang.String): CaptionPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): CaptionPanel
  def setStyleAttributes(attributes: js.Any): CaptionPanel
  def setStyleName(styleName: java.lang.String): CaptionPanel
  def setStylePrimaryName(styleName: java.lang.String): CaptionPanel
  def setTag(tag: java.lang.String): CaptionPanel
  def setText(text: java.lang.String): CaptionPanel
  def setTitle(title: java.lang.String): CaptionPanel
  def setVisible(visible: scala.Boolean): CaptionPanel
  def setWidget(widget: Widget): CaptionPanel
  def setWidth(width: java.lang.String): CaptionPanel
}

object CaptionPanel {
  @scala.inline
  def apply(
    add: Widget => CaptionPanel,
    addStyleDependentName: java.lang.String => CaptionPanel,
    addStyleName: java.lang.String => CaptionPanel,
    clear: () => CaptionPanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setCaptionText: java.lang.String => CaptionPanel,
    setContentWidget: Widget => CaptionPanel,
    setHeight: java.lang.String => CaptionPanel,
    setId: java.lang.String => CaptionPanel,
    setLayoutData: js.Any => CaptionPanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => CaptionPanel,
    setSize: (java.lang.String, java.lang.String) => CaptionPanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => CaptionPanel,
    setStyleAttributes: js.Any => CaptionPanel,
    setStyleName: java.lang.String => CaptionPanel,
    setStylePrimaryName: java.lang.String => CaptionPanel,
    setTag: java.lang.String => CaptionPanel,
    setText: java.lang.String => CaptionPanel,
    setTitle: java.lang.String => CaptionPanel,
    setVisible: scala.Boolean => CaptionPanel,
    setWidget: Widget => CaptionPanel,
    setWidth: java.lang.String => CaptionPanel
  ): CaptionPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setCaptionText = js.Any.fromFunction1(setCaptionText), setContentWidget = js.Any.fromFunction1(setContentWidget), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[CaptionPanel]
  }
}

