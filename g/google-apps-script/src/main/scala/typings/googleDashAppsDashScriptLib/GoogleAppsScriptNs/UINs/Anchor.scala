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
    val __obj = js.Dynamic.literal(addBlurHandler = addBlurHandler, addClickHandler = addClickHandler, addFocusHandler = addFocusHandler, addKeyDownHandler = addKeyDownHandler, addKeyPressHandler = addKeyPressHandler, addKeyUpHandler = addKeyUpHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setAccessKey = setAccessKey, setDirection = setDirection, setEnabled = setEnabled, setFocus = setFocus, setHTML = setHTML, setHeight = setHeight, setHorizontalAlignment = setHorizontalAlignment, setHref = setHref, setId = setId, setLayoutData = setLayoutData, setName = setName, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTabIndex = setTabIndex, setTag = setTag, setTarget = setTarget, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth, setWordWrap = setWordWrap)
  
    __obj.asInstanceOf[Anchor]
  }
}

