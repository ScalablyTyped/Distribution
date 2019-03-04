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
    val __obj = js.Dynamic.literal(add = add, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, clear = clear, getId = getId, getTag = getTag, getType = getType, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth)
  
    __obj.asInstanceOf[SimplePanel]
  }
}

