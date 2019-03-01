package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleCheckBox extends js.Object {
  def addBlurHandler(handler: Handler): SimpleCheckBox
  def addClickHandler(handler: Handler): SimpleCheckBox
  def addFocusHandler(handler: Handler): SimpleCheckBox
  def addKeyDownHandler(handler: Handler): SimpleCheckBox
  def addKeyPressHandler(handler: Handler): SimpleCheckBox
  def addKeyUpHandler(handler: Handler): SimpleCheckBox
  def addMouseDownHandler(handler: Handler): SimpleCheckBox
  def addMouseMoveHandler(handler: Handler): SimpleCheckBox
  def addMouseOutHandler(handler: Handler): SimpleCheckBox
  def addMouseOverHandler(handler: Handler): SimpleCheckBox
  def addMouseUpHandler(handler: Handler): SimpleCheckBox
  def addMouseWheelHandler(handler: Handler): SimpleCheckBox
  def addStyleDependentName(styleName: java.lang.String): SimpleCheckBox
  def addStyleName(styleName: java.lang.String): SimpleCheckBox
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): SimpleCheckBox
  def setChecked(checked: scala.Boolean): SimpleCheckBox
  def setEnabled(enabled: scala.Boolean): SimpleCheckBox
  def setFocus(focus: scala.Boolean): SimpleCheckBox
  def setHeight(height: java.lang.String): SimpleCheckBox
  def setId(id: java.lang.String): SimpleCheckBox
  def setLayoutData(layout: js.Object): SimpleCheckBox
  def setName(name: java.lang.String): SimpleCheckBox
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): SimpleCheckBox
  def setSize(width: java.lang.String, height: java.lang.String): SimpleCheckBox
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): SimpleCheckBox
  def setStyleAttributes(attributes: js.Object): SimpleCheckBox
  def setStyleName(styleName: java.lang.String): SimpleCheckBox
  def setStylePrimaryName(styleName: java.lang.String): SimpleCheckBox
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): SimpleCheckBox
  def setTag(tag: java.lang.String): SimpleCheckBox
  def setTitle(title: java.lang.String): SimpleCheckBox
  def setVisible(visible: scala.Boolean): SimpleCheckBox
  def setWidth(width: java.lang.String): SimpleCheckBox
}

object SimpleCheckBox {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, SimpleCheckBox],
    addClickHandler: js.Function1[Handler, SimpleCheckBox],
    addFocusHandler: js.Function1[Handler, SimpleCheckBox],
    addKeyDownHandler: js.Function1[Handler, SimpleCheckBox],
    addKeyPressHandler: js.Function1[Handler, SimpleCheckBox],
    addKeyUpHandler: js.Function1[Handler, SimpleCheckBox],
    addMouseDownHandler: js.Function1[Handler, SimpleCheckBox],
    addMouseMoveHandler: js.Function1[Handler, SimpleCheckBox],
    addMouseOutHandler: js.Function1[Handler, SimpleCheckBox],
    addMouseOverHandler: js.Function1[Handler, SimpleCheckBox],
    addMouseUpHandler: js.Function1[Handler, SimpleCheckBox],
    addMouseWheelHandler: js.Function1[Handler, SimpleCheckBox],
    addStyleDependentName: js.Function1[java.lang.String, SimpleCheckBox],
    addStyleName: js.Function1[java.lang.String, SimpleCheckBox],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, SimpleCheckBox],
    setChecked: js.Function1[scala.Boolean, SimpleCheckBox],
    setEnabled: js.Function1[scala.Boolean, SimpleCheckBox],
    setFocus: js.Function1[scala.Boolean, SimpleCheckBox],
    setHeight: js.Function1[java.lang.String, SimpleCheckBox],
    setId: js.Function1[java.lang.String, SimpleCheckBox],
    setLayoutData: js.Function1[js.Object, SimpleCheckBox],
    setName: js.Function1[java.lang.String, SimpleCheckBox],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      SimpleCheckBox
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, SimpleCheckBox],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, SimpleCheckBox],
    setStyleAttributes: js.Function1[js.Object, SimpleCheckBox],
    setStyleName: js.Function1[java.lang.String, SimpleCheckBox],
    setStylePrimaryName: js.Function1[java.lang.String, SimpleCheckBox],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, SimpleCheckBox],
    setTag: js.Function1[java.lang.String, SimpleCheckBox],
    setTitle: js.Function1[java.lang.String, SimpleCheckBox],
    setVisible: js.Function1[scala.Boolean, SimpleCheckBox],
    setWidth: js.Function1[java.lang.String, SimpleCheckBox]
  ): SimpleCheckBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBlurHandler")(addBlurHandler)
    __obj.updateDynamic("addClickHandler")(addClickHandler)
    __obj.updateDynamic("addFocusHandler")(addFocusHandler)
    __obj.updateDynamic("addKeyDownHandler")(addKeyDownHandler)
    __obj.updateDynamic("addKeyPressHandler")(addKeyPressHandler)
    __obj.updateDynamic("addKeyUpHandler")(addKeyUpHandler)
    __obj.updateDynamic("addMouseDownHandler")(addMouseDownHandler)
    __obj.updateDynamic("addMouseMoveHandler")(addMouseMoveHandler)
    __obj.updateDynamic("addMouseOutHandler")(addMouseOutHandler)
    __obj.updateDynamic("addMouseOverHandler")(addMouseOverHandler)
    __obj.updateDynamic("addMouseUpHandler")(addMouseUpHandler)
    __obj.updateDynamic("addMouseWheelHandler")(addMouseWheelHandler)
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setAccessKey")(setAccessKey)
    __obj.updateDynamic("setChecked")(setChecked)
    __obj.updateDynamic("setEnabled")(setEnabled)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setLayoutData")(setLayoutData)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPixelSize")(setPixelSize)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("setStyleAttribute")(setStyleAttribute)
    __obj.updateDynamic("setStyleAttributes")(setStyleAttributes)
    __obj.updateDynamic("setStyleName")(setStyleName)
    __obj.updateDynamic("setStylePrimaryName")(setStylePrimaryName)
    __obj.updateDynamic("setTabIndex")(setTabIndex)
    __obj.updateDynamic("setTag")(setTag)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[SimpleCheckBox]
  }
}

