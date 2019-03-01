package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  def addBlurHandler(handler: Handler): Anchor
  def addClickHandler(handler: Handler): Anchor
  def addFocusHandler(handler: Handler): Anchor
  def addKeyDownHandler(handler: Handler): Anchor
  def addKeyPressHandler(handler: Handler): Anchor
  def addKeyUpHandler(handler: Handler): Anchor
  def addMouseDownHandler(handler: Handler): Anchor
  def addMouseMoveHandler(handler: Handler): Anchor
  def addMouseOutHandler(handler: Handler): Anchor
  def addMouseOverHandler(handler: Handler): Anchor
  def addMouseUpHandler(handler: Handler): Anchor
  def addMouseWheelHandler(handler: Handler): Anchor
  def addStyleDependentName(styleName: java.lang.String): Anchor
  def addStyleName(styleName: java.lang.String): Anchor
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): Anchor
  def setDirection(direction: Component): Anchor
  def setEnabled(enabled: scala.Boolean): Anchor
  def setFocus(focus: scala.Boolean): Anchor
  def setHTML(html: java.lang.String): Anchor
  def setHeight(height: java.lang.String): Anchor
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): Anchor
  def setHref(href: java.lang.String): Anchor
  def setId(id: java.lang.String): Anchor
  def setLayoutData(layout: js.Object): Anchor
  def setName(name: java.lang.String): Anchor
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Anchor
  def setSize(width: java.lang.String, height: java.lang.String): Anchor
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Anchor
  def setStyleAttributes(attributes: js.Object): Anchor
  def setStyleName(styleName: java.lang.String): Anchor
  def setStylePrimaryName(styleName: java.lang.String): Anchor
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Anchor
  def setTag(tag: java.lang.String): Anchor
  def setTarget(target: java.lang.String): Anchor
  def setText(text: java.lang.String): Anchor
  def setTitle(title: java.lang.String): Anchor
  def setVisible(visible: scala.Boolean): Anchor
  def setWidth(width: java.lang.String): Anchor
  def setWordWrap(wordWrap: scala.Boolean): Anchor
}

object Anchor {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, Anchor],
    addClickHandler: js.Function1[Handler, Anchor],
    addFocusHandler: js.Function1[Handler, Anchor],
    addKeyDownHandler: js.Function1[Handler, Anchor],
    addKeyPressHandler: js.Function1[Handler, Anchor],
    addKeyUpHandler: js.Function1[Handler, Anchor],
    addMouseDownHandler: js.Function1[Handler, Anchor],
    addMouseMoveHandler: js.Function1[Handler, Anchor],
    addMouseOutHandler: js.Function1[Handler, Anchor],
    addMouseOverHandler: js.Function1[Handler, Anchor],
    addMouseUpHandler: js.Function1[Handler, Anchor],
    addMouseWheelHandler: js.Function1[Handler, Anchor],
    addStyleDependentName: js.Function1[java.lang.String, Anchor],
    addStyleName: js.Function1[java.lang.String, Anchor],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, Anchor],
    setDirection: js.Function1[Component, Anchor],
    setEnabled: js.Function1[scala.Boolean, Anchor],
    setFocus: js.Function1[scala.Boolean, Anchor],
    setHTML: js.Function1[java.lang.String, Anchor],
    setHeight: js.Function1[java.lang.String, Anchor],
    setHorizontalAlignment: js.Function1[HorizontalAlignment, Anchor],
    setHref: js.Function1[java.lang.String, Anchor],
    setId: js.Function1[java.lang.String, Anchor],
    setLayoutData: js.Function1[js.Object, Anchor],
    setName: js.Function1[java.lang.String, Anchor],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Anchor
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, Anchor],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, Anchor],
    setStyleAttributes: js.Function1[js.Object, Anchor],
    setStyleName: js.Function1[java.lang.String, Anchor],
    setStylePrimaryName: js.Function1[java.lang.String, Anchor],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, Anchor],
    setTag: js.Function1[java.lang.String, Anchor],
    setTarget: js.Function1[java.lang.String, Anchor],
    setText: js.Function1[java.lang.String, Anchor],
    setTitle: js.Function1[java.lang.String, Anchor],
    setVisible: js.Function1[scala.Boolean, Anchor],
    setWidth: js.Function1[java.lang.String, Anchor],
    setWordWrap: js.Function1[scala.Boolean, Anchor]
  ): Anchor = {
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
    __obj.updateDynamic("setDirection")(setDirection)
    __obj.updateDynamic("setEnabled")(setEnabled)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setHTML")(setHTML)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setHorizontalAlignment")(setHorizontalAlignment)
    __obj.updateDynamic("setHref")(setHref)
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
    __obj.updateDynamic("setTarget")(setTarget)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.updateDynamic("setWordWrap")(setWordWrap)
    __obj.asInstanceOf[Anchor]
  }
}

