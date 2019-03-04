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
  def setLayoutData(layout: js.Object): FormPanel
  def setMethod(method: java.lang.String): FormPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FormPanel
  def setSize(width: java.lang.String, height: java.lang.String): FormPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FormPanel
  def setStyleAttributes(attributes: js.Object): FormPanel
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
    add: js.Function1[Widget, FormPanel],
    addStyleDependentName: js.Function1[java.lang.String, FormPanel],
    addStyleName: js.Function1[java.lang.String, FormPanel],
    addSubmitCompleteHandler: js.Function1[Handler, FormPanel],
    addSubmitHandler: js.Function1[Handler, FormPanel],
    clear: js.Function0[FormPanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAction: js.Function1[java.lang.String, FormPanel],
    setEncoding: js.Function1[java.lang.String, FormPanel],
    setHeight: js.Function1[java.lang.String, FormPanel],
    setId: js.Function1[java.lang.String, FormPanel],
    setLayoutData: js.Function1[js.Object, FormPanel],
    setMethod: js.Function1[java.lang.String, FormPanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      FormPanel
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, FormPanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, FormPanel],
    setStyleAttributes: js.Function1[js.Object, FormPanel],
    setStyleName: js.Function1[java.lang.String, FormPanel],
    setStylePrimaryName: js.Function1[java.lang.String, FormPanel],
    setTag: js.Function1[java.lang.String, FormPanel],
    setTitle: js.Function1[java.lang.String, FormPanel],
    setVisible: js.Function1[scala.Boolean, FormPanel],
    setWidget: js.Function1[Widget, FormPanel],
    setWidth: js.Function1[java.lang.String, FormPanel]
  ): FormPanel = {
    val __obj = js.Dynamic.literal(add = add, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, addSubmitCompleteHandler = addSubmitCompleteHandler, addSubmitHandler = addSubmitHandler, clear = clear, getId = getId, getTag = getTag, getType = getType, setAction = setAction, setEncoding = setEncoding, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setMethod = setMethod, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth)
  
    __obj.asInstanceOf[FormPanel]
  }
}

