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
    val __obj = js.Dynamic.literal(add = add, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, clear = clear, getId = getId, getTag = getTag, getType = getType, setCaptionText = setCaptionText, setContentWidget = setContentWidget, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth)
  
    __obj.asInstanceOf[CaptionPanel]
  }
}

