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
    add: Widget => SimplePanel,
    addStyleDependentName: java.lang.String => SimplePanel,
    addStyleName: java.lang.String => SimplePanel,
    clear: () => SimplePanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setHeight: java.lang.String => SimplePanel,
    setId: java.lang.String => SimplePanel,
    setLayoutData: js.Object => SimplePanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => SimplePanel,
    setSize: (java.lang.String, java.lang.String) => SimplePanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => SimplePanel,
    setStyleAttributes: js.Object => SimplePanel,
    setStyleName: java.lang.String => SimplePanel,
    setStylePrimaryName: java.lang.String => SimplePanel,
    setTag: java.lang.String => SimplePanel,
    setTitle: java.lang.String => SimplePanel,
    setVisible: scala.Boolean => SimplePanel,
    setWidget: Widget => SimplePanel,
    setWidth: java.lang.String => SimplePanel
  ): SimplePanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[SimplePanel]
  }
}

