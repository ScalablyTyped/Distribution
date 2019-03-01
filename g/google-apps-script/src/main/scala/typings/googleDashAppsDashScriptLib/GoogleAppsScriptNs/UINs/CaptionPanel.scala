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
  def setLayoutData(layout: js.Object): CaptionPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): CaptionPanel
  def setSize(width: java.lang.String, height: java.lang.String): CaptionPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): CaptionPanel
  def setStyleAttributes(attributes: js.Object): CaptionPanel
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
    add: js.Function1[Widget, CaptionPanel],
    addStyleDependentName: js.Function1[java.lang.String, CaptionPanel],
    addStyleName: js.Function1[java.lang.String, CaptionPanel],
    clear: js.Function0[CaptionPanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setCaptionText: js.Function1[java.lang.String, CaptionPanel],
    setContentWidget: js.Function1[Widget, CaptionPanel],
    setHeight: js.Function1[java.lang.String, CaptionPanel],
    setId: js.Function1[java.lang.String, CaptionPanel],
    setLayoutData: js.Function1[js.Object, CaptionPanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      CaptionPanel
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, CaptionPanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, CaptionPanel],
    setStyleAttributes: js.Function1[js.Object, CaptionPanel],
    setStyleName: js.Function1[java.lang.String, CaptionPanel],
    setStylePrimaryName: js.Function1[java.lang.String, CaptionPanel],
    setTag: js.Function1[java.lang.String, CaptionPanel],
    setText: js.Function1[java.lang.String, CaptionPanel],
    setTitle: js.Function1[java.lang.String, CaptionPanel],
    setVisible: js.Function1[scala.Boolean, CaptionPanel],
    setWidget: js.Function1[Widget, CaptionPanel],
    setWidth: js.Function1[java.lang.String, CaptionPanel]
  ): CaptionPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setCaptionText")(setCaptionText)
    __obj.updateDynamic("setContentWidget")(setContentWidget)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setLayoutData")(setLayoutData)
    __obj.updateDynamic("setPixelSize")(setPixelSize)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("setStyleAttribute")(setStyleAttribute)
    __obj.updateDynamic("setStyleAttributes")(setStyleAttributes)
    __obj.updateDynamic("setStyleName")(setStyleName)
    __obj.updateDynamic("setStylePrimaryName")(setStylePrimaryName)
    __obj.updateDynamic("setTag")(setTag)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidget")(setWidget)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[CaptionPanel]
  }
}

