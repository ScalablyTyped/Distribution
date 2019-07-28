package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormPanel extends js.Object {
  def add(widget: Widget): FormPanel
  def addStyleDependentName(styleName: String): FormPanel
  def addStyleName(styleName: String): FormPanel
  def addSubmitCompleteHandler(handler: Handler): FormPanel
  def addSubmitHandler(handler: Handler): FormPanel
  def clear(): FormPanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAction(action: String): FormPanel
  def setEncoding(encoding: String): FormPanel
  def setHeight(height: String): FormPanel
  def setId(id: String): FormPanel
  def setLayoutData(layout: js.Any): FormPanel
  def setMethod(method: String): FormPanel
  def setPixelSize(width: Integer, height: Integer): FormPanel
  def setSize(width: String, height: String): FormPanel
  def setStyleAttribute(attribute: String, value: String): FormPanel
  def setStyleAttributes(attributes: js.Any): FormPanel
  def setStyleName(styleName: String): FormPanel
  def setStylePrimaryName(styleName: String): FormPanel
  def setTag(tag: String): FormPanel
  def setTitle(title: String): FormPanel
  def setVisible(visible: Boolean): FormPanel
  def setWidget(widget: Widget): FormPanel
  def setWidth(width: String): FormPanel
}

object FormPanel {
  @scala.inline
  def apply(
    add: Widget => FormPanel,
    addStyleDependentName: String => FormPanel,
    addStyleName: String => FormPanel,
    addSubmitCompleteHandler: Handler => FormPanel,
    addSubmitHandler: Handler => FormPanel,
    clear: () => FormPanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAction: String => FormPanel,
    setEncoding: String => FormPanel,
    setHeight: String => FormPanel,
    setId: String => FormPanel,
    setLayoutData: js.Any => FormPanel,
    setMethod: String => FormPanel,
    setPixelSize: (Integer, Integer) => FormPanel,
    setSize: (String, String) => FormPanel,
    setStyleAttribute: (String, String) => FormPanel,
    setStyleAttributes: js.Any => FormPanel,
    setStyleName: String => FormPanel,
    setStylePrimaryName: String => FormPanel,
    setTag: String => FormPanel,
    setTitle: String => FormPanel,
    setVisible: Boolean => FormPanel,
    setWidget: Widget => FormPanel,
    setWidth: String => FormPanel
  ): FormPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), addSubmitCompleteHandler = js.Any.fromFunction1(addSubmitCompleteHandler), addSubmitHandler = js.Any.fromFunction1(addSubmitHandler), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAction = js.Any.fromFunction1(setAction), setEncoding = js.Any.fromFunction1(setEncoding), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setMethod = js.Any.fromFunction1(setMethod), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[FormPanel]
  }
}

