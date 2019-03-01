package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePanel extends js.Object {
  def add(widget: Widget): SimplePanel
  def addStyleDependentName(styleName: java.lang.String): SimplePanel
  def addStyleName(styleName: java.lang.String): SimplePanel
  def clear(): SimplePanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setHeight(height: java.lang.String): SimplePanel
  def setId(id: java.lang.String): SimplePanel
  def setLayoutData(layout: js.Object): SimplePanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): SimplePanel
  def setSize(width: java.lang.String, height: java.lang.String): SimplePanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): SimplePanel
  def setStyleAttributes(attributes: js.Object): SimplePanel
  def setStyleName(styleName: java.lang.String): SimplePanel
  def setStylePrimaryName(styleName: java.lang.String): SimplePanel
  def setTag(tag: java.lang.String): SimplePanel
  def setTitle(title: java.lang.String): SimplePanel
  def setVisible(visible: scala.Boolean): SimplePanel
  def setWidget(widget: Widget): SimplePanel
  def setWidth(width: java.lang.String): SimplePanel
}

object SimplePanel {
  @scala.inline
  def apply(
    add: js.Function1[Widget, SimplePanel],
    addStyleDependentName: js.Function1[java.lang.String, SimplePanel],
    addStyleName: js.Function1[java.lang.String, SimplePanel],
    clear: js.Function0[SimplePanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setHeight: js.Function1[java.lang.String, SimplePanel],
    setId: js.Function1[java.lang.String, SimplePanel],
    setLayoutData: js.Function1[js.Object, SimplePanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      SimplePanel
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, SimplePanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, SimplePanel],
    setStyleAttributes: js.Function1[js.Object, SimplePanel],
    setStyleName: js.Function1[java.lang.String, SimplePanel],
    setStylePrimaryName: js.Function1[java.lang.String, SimplePanel],
    setTag: js.Function1[java.lang.String, SimplePanel],
    setTitle: js.Function1[java.lang.String, SimplePanel],
    setVisible: js.Function1[scala.Boolean, SimplePanel],
    setWidget: js.Function1[Widget, SimplePanel],
    setWidth: js.Function1[java.lang.String, SimplePanel]
  ): SimplePanel = {
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
    __obj.asInstanceOf[SimplePanel]
  }
}

