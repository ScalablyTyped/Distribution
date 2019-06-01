package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormPanel extends js.Object {
  def add(widget: Widget): FormPanel
  def addStyleDependentName(styleName: java.lang.String): FormPanel
  def addStyleName(styleName: java.lang.String): FormPanel
  def addSubmitCompleteHandler(handler: Handler): FormPanel
  def addSubmitHandler(handler: Handler): FormPanel
  def clear(): FormPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAction(action: java.lang.String): FormPanel
  def setEncoding(encoding: java.lang.String): FormPanel
  def setHeight(height: java.lang.String): FormPanel
  def setId(id: java.lang.String): FormPanel
  def setLayoutData(layout: js.Any): FormPanel
  def setMethod(method: java.lang.String): FormPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FormPanel
  def setSize(width: java.lang.String, height: java.lang.String): FormPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FormPanel
  def setStyleAttributes(attributes: js.Any): FormPanel
  def setStyleName(styleName: java.lang.String): FormPanel
  def setStylePrimaryName(styleName: java.lang.String): FormPanel
  def setTag(tag: java.lang.String): FormPanel
  def setTitle(title: java.lang.String): FormPanel
  def setVisible(visible: scala.Boolean): FormPanel
  def setWidget(widget: Widget): FormPanel
  def setWidth(width: java.lang.String): FormPanel
}

object FormPanel {
  @scala.inline
  def apply(
    add: Widget => FormPanel,
    addStyleDependentName: java.lang.String => FormPanel,
    addStyleName: java.lang.String => FormPanel,
    addSubmitCompleteHandler: Handler => FormPanel,
    addSubmitHandler: Handler => FormPanel,
    clear: () => FormPanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAction: java.lang.String => FormPanel,
    setEncoding: java.lang.String => FormPanel,
    setHeight: java.lang.String => FormPanel,
    setId: java.lang.String => FormPanel,
    setLayoutData: js.Any => FormPanel,
    setMethod: java.lang.String => FormPanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => FormPanel,
    setSize: (java.lang.String, java.lang.String) => FormPanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => FormPanel,
    setStyleAttributes: js.Any => FormPanel,
    setStyleName: java.lang.String => FormPanel,
    setStylePrimaryName: java.lang.String => FormPanel,
    setTag: java.lang.String => FormPanel,
    setTitle: java.lang.String => FormPanel,
    setVisible: scala.Boolean => FormPanel,
    setWidget: Widget => FormPanel,
    setWidth: java.lang.String => FormPanel
  ): FormPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), addSubmitCompleteHandler = js.Any.fromFunction1(addSubmitCompleteHandler), addSubmitHandler = js.Any.fromFunction1(addSubmitHandler), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAction = js.Any.fromFunction1(setAction), setEncoding = js.Any.fromFunction1(setEncoding), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setMethod = js.Any.fromFunction1(setMethod), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[FormPanel]
  }
}

