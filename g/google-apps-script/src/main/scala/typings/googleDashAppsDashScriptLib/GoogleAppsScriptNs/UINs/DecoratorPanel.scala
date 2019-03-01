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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
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
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidget")(setWidget)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[DecoratorPanel]
  }
}

