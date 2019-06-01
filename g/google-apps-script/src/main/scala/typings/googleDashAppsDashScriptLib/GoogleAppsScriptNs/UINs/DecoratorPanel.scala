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
  def setLayoutData(layout: js.Any): DecoratorPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DecoratorPanel
  def setSize(width: java.lang.String, height: java.lang.String): DecoratorPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): DecoratorPanel
  def setStyleAttributes(attributes: js.Any): DecoratorPanel
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
    add: Widget => DecoratorPanel,
    addStyleDependentName: java.lang.String => DecoratorPanel,
    addStyleName: java.lang.String => DecoratorPanel,
    clear: () => DecoratorPanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setHeight: java.lang.String => DecoratorPanel,
    setId: java.lang.String => DecoratorPanel,
    setLayoutData: js.Any => DecoratorPanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => DecoratorPanel,
    setSize: (java.lang.String, java.lang.String) => DecoratorPanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => DecoratorPanel,
    setStyleAttributes: js.Any => DecoratorPanel,
    setStyleName: java.lang.String => DecoratorPanel,
    setStylePrimaryName: java.lang.String => DecoratorPanel,
    setTag: java.lang.String => DecoratorPanel,
    setTitle: java.lang.String => DecoratorPanel,
    setVisible: scala.Boolean => DecoratorPanel,
    setWidget: Widget => DecoratorPanel,
    setWidth: java.lang.String => DecoratorPanel
  ): DecoratorPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[DecoratorPanel]
  }
}

