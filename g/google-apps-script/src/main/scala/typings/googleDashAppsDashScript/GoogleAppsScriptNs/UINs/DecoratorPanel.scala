package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorPanel extends js.Object {
  def add(widget: Widget): DecoratorPanel
  def addStyleDependentName(styleName: String): DecoratorPanel
  def addStyleName(styleName: String): DecoratorPanel
  def clear(): DecoratorPanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setHeight(height: String): DecoratorPanel
  def setId(id: String): DecoratorPanel
  def setLayoutData(layout: js.Any): DecoratorPanel
  def setPixelSize(width: Integer, height: Integer): DecoratorPanel
  def setSize(width: String, height: String): DecoratorPanel
  def setStyleAttribute(attribute: String, value: String): DecoratorPanel
  def setStyleAttributes(attributes: js.Any): DecoratorPanel
  def setStyleName(styleName: String): DecoratorPanel
  def setStylePrimaryName(styleName: String): DecoratorPanel
  def setTag(tag: String): DecoratorPanel
  def setTitle(title: String): DecoratorPanel
  def setVisible(visible: Boolean): DecoratorPanel
  def setWidget(widget: Widget): DecoratorPanel
  def setWidth(width: String): DecoratorPanel
}

object DecoratorPanel {
  @scala.inline
  def apply(
    add: Widget => DecoratorPanel,
    addStyleDependentName: String => DecoratorPanel,
    addStyleName: String => DecoratorPanel,
    clear: () => DecoratorPanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setHeight: String => DecoratorPanel,
    setId: String => DecoratorPanel,
    setLayoutData: js.Any => DecoratorPanel,
    setPixelSize: (Integer, Integer) => DecoratorPanel,
    setSize: (String, String) => DecoratorPanel,
    setStyleAttribute: (String, String) => DecoratorPanel,
    setStyleAttributes: js.Any => DecoratorPanel,
    setStyleName: String => DecoratorPanel,
    setStylePrimaryName: String => DecoratorPanel,
    setTag: String => DecoratorPanel,
    setTitle: String => DecoratorPanel,
    setVisible: Boolean => DecoratorPanel,
    setWidget: Widget => DecoratorPanel,
    setWidth: String => DecoratorPanel
  ): DecoratorPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[DecoratorPanel]
  }
}

