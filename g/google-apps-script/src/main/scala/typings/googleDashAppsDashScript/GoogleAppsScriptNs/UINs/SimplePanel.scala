package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePanel extends js.Object {
  def add(widget: Widget): SimplePanel
  def addStyleDependentName(styleName: String): SimplePanel
  def addStyleName(styleName: String): SimplePanel
  def clear(): SimplePanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setHeight(height: String): SimplePanel
  def setId(id: String): SimplePanel
  def setLayoutData(layout: js.Any): SimplePanel
  def setPixelSize(width: Integer, height: Integer): SimplePanel
  def setSize(width: String, height: String): SimplePanel
  def setStyleAttribute(attribute: String, value: String): SimplePanel
  def setStyleAttributes(attributes: js.Any): SimplePanel
  def setStyleName(styleName: String): SimplePanel
  def setStylePrimaryName(styleName: String): SimplePanel
  def setTag(tag: String): SimplePanel
  def setTitle(title: String): SimplePanel
  def setVisible(visible: Boolean): SimplePanel
  def setWidget(widget: Widget): SimplePanel
  def setWidth(width: String): SimplePanel
}

object SimplePanel {
  @scala.inline
  def apply(
    add: Widget => SimplePanel,
    addStyleDependentName: String => SimplePanel,
    addStyleName: String => SimplePanel,
    clear: () => SimplePanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setHeight: String => SimplePanel,
    setId: String => SimplePanel,
    setLayoutData: js.Any => SimplePanel,
    setPixelSize: (Integer, Integer) => SimplePanel,
    setSize: (String, String) => SimplePanel,
    setStyleAttribute: (String, String) => SimplePanel,
    setStyleAttributes: js.Any => SimplePanel,
    setStyleName: String => SimplePanel,
    setStylePrimaryName: String => SimplePanel,
    setTag: String => SimplePanel,
    setTitle: String => SimplePanel,
    setVisible: Boolean => SimplePanel,
    setWidget: Widget => SimplePanel,
    setWidth: String => SimplePanel
  ): SimplePanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[SimplePanel]
  }
}

