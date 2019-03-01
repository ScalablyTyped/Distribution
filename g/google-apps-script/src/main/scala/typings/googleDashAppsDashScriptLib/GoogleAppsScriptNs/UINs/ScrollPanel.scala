package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollPanel extends js.Object {
  def add(widget: Widget): ScrollPanel
  def addScrollHandler(handler: Handler): ScrollPanel
  def addStyleDependentName(styleName: java.lang.String): ScrollPanel
  def addStyleName(styleName: java.lang.String): ScrollPanel
  def clear(): ScrollPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAlwaysShowScrollBars(alwaysShow: scala.Boolean): ScrollPanel
  def setHeight(height: java.lang.String): ScrollPanel
  def setHorizontalScrollPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScrollPanel
  def setId(id: java.lang.String): ScrollPanel
  def setLayoutData(layout: js.Object): ScrollPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ScrollPanel
  def setScrollPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScrollPanel
  def setSize(width: java.lang.String, height: java.lang.String): ScrollPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ScrollPanel
  def setStyleAttributes(attributes: js.Object): ScrollPanel
  def setStyleName(styleName: java.lang.String): ScrollPanel
  def setStylePrimaryName(styleName: java.lang.String): ScrollPanel
  def setTag(tag: java.lang.String): ScrollPanel
  def setTitle(title: java.lang.String): ScrollPanel
  def setVisible(visible: scala.Boolean): ScrollPanel
  def setWidget(widget: Widget): ScrollPanel
  def setWidth(width: java.lang.String): ScrollPanel
}

object ScrollPanel {
  @scala.inline
  def apply(
    add: js.Function1[Widget, ScrollPanel],
    addScrollHandler: js.Function1[Handler, ScrollPanel],
    addStyleDependentName: js.Function1[java.lang.String, ScrollPanel],
    addStyleName: js.Function1[java.lang.String, ScrollPanel],
    clear: js.Function0[ScrollPanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAlwaysShowScrollBars: js.Function1[scala.Boolean, ScrollPanel],
    setHeight: js.Function1[java.lang.String, ScrollPanel],
    setHorizontalScrollPosition: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ScrollPanel],
    setId: js.Function1[java.lang.String, ScrollPanel],
    setLayoutData: js.Function1[js.Object, ScrollPanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ScrollPanel
    ],
    setScrollPosition: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ScrollPanel],
    setSize: js.Function2[java.lang.String, java.lang.String, ScrollPanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, ScrollPanel],
    setStyleAttributes: js.Function1[js.Object, ScrollPanel],
    setStyleName: js.Function1[java.lang.String, ScrollPanel],
    setStylePrimaryName: js.Function1[java.lang.String, ScrollPanel],
    setTag: js.Function1[java.lang.String, ScrollPanel],
    setTitle: js.Function1[java.lang.String, ScrollPanel],
    setVisible: js.Function1[scala.Boolean, ScrollPanel],
    setWidget: js.Function1[Widget, ScrollPanel],
    setWidth: js.Function1[java.lang.String, ScrollPanel]
  ): ScrollPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addScrollHandler")(addScrollHandler)
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setAlwaysShowScrollBars")(setAlwaysShowScrollBars)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setHorizontalScrollPosition")(setHorizontalScrollPosition)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setLayoutData")(setLayoutData)
    __obj.updateDynamic("setPixelSize")(setPixelSize)
    __obj.updateDynamic("setScrollPosition")(setScrollPosition)
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
    __obj.asInstanceOf[ScrollPanel]
  }
}

