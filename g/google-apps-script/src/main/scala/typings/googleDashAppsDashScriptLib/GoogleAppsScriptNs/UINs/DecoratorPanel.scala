package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorPanel extends js.Object {
  def add(widget: Widget): DecoratorPanel
  def addStyleDependentName(styleName: java.lang.String): DecoratorPanel
  def addStyleName(styleName: java.lang.String): DecoratorPanel
  def clear(): DecoratorPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setHeight(height: java.lang.String): DecoratorPanel
  def setId(id: java.lang.String): DecoratorPanel
  def setLayoutData(layout: js.Object): DecoratorPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DecoratorPanel
  def setSize(width: java.lang.String, height: java.lang.String): DecoratorPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): DecoratorPanel
  def setStyleAttributes(attributes: js.Object): DecoratorPanel
  def setStyleName(styleName: java.lang.String): DecoratorPanel
  def setStylePrimaryName(styleName: java.lang.String): DecoratorPanel
  def setTag(tag: java.lang.String): DecoratorPanel
  def setTitle(title: java.lang.String): DecoratorPanel
  def setVisible(visible: scala.Boolean): DecoratorPanel
  def setWidget(widget: Widget): DecoratorPanel
  def setWidth(width: java.lang.String): DecoratorPanel
}

object DecoratorPanel {
  @scala.inline
  def apply(
    add: js.Function1[Widget, DecoratorPanel],
    addStyleDependentName: js.Function1[java.lang.String, DecoratorPanel],
    addStyleName: js.Function1[java.lang.String, DecoratorPanel],
    clear: js.Function0[DecoratorPanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setHeight: js.Function1[java.lang.String, DecoratorPanel],
    setId: js.Function1[java.lang.String, DecoratorPanel],
    setLayoutData: js.Function1[js.Object, DecoratorPanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      DecoratorPanel
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, DecoratorPanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, DecoratorPanel],
    setStyleAttributes: js.Function1[js.Object, DecoratorPanel],
    setStyleName: js.Function1[java.lang.String, DecoratorPanel],
    setStylePrimaryName: js.Function1[java.lang.String, DecoratorPanel],
    setTag: js.Function1[java.lang.String, DecoratorPanel],
    setTitle: js.Function1[java.lang.String, DecoratorPanel],
    setVisible: js.Function1[scala.Boolean, DecoratorPanel],
    setWidget: js.Function1[Widget, DecoratorPanel],
    setWidth: js.Function1[java.lang.String, DecoratorPanel]
  ): DecoratorPanel = {
    val __obj = js.Dynamic.literal(add = add, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, clear = clear, getId = getId, getTag = getTag, getType = getType, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth)
  
    __obj.asInstanceOf[DecoratorPanel]
  }
}

