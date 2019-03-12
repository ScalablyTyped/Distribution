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
    addBlurHandler: Handler => Anchor,
    addClickHandler: Handler => Anchor,
    addFocusHandler: Handler => Anchor,
    addKeyDownHandler: Handler => Anchor,
    addKeyPressHandler: Handler => Anchor,
    addKeyUpHandler: Handler => Anchor,
    addMouseDownHandler: Handler => Anchor,
    addMouseMoveHandler: Handler => Anchor,
    addMouseOutHandler: Handler => Anchor,
    addMouseOverHandler: Handler => Anchor,
    addMouseUpHandler: Handler => Anchor,
    addMouseWheelHandler: Handler => Anchor,
    addStyleDependentName: java.lang.String => Anchor,
    addStyleName: java.lang.String => Anchor,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAccessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char => Anchor,
    setDirection: Component => Anchor,
    setEnabled: scala.Boolean => Anchor,
    setFocus: scala.Boolean => Anchor,
    setHTML: java.lang.String => Anchor,
    setHeight: java.lang.String => Anchor,
    setHorizontalAlignment: HorizontalAlignment => Anchor,
    setHref: java.lang.String => Anchor,
    setId: java.lang.String => Anchor,
    setLayoutData: js.Object => Anchor,
    setName: java.lang.String => Anchor,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Anchor,
    setSize: (java.lang.String, java.lang.String) => Anchor,
    setStyleAttribute: (java.lang.String, java.lang.String) => Anchor,
    setStyleAttributes: js.Object => Anchor,
    setStyleName: java.lang.String => Anchor,
    setStylePrimaryName: java.lang.String => Anchor,
    setTabIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => Anchor,
    setTag: java.lang.String => Anchor,
    setTarget: java.lang.String => Anchor,
    setText: java.lang.String => Anchor,
    setTitle: java.lang.String => Anchor,
    setVisible: scala.Boolean => Anchor,
    setWidth: java.lang.String => Anchor,
    setWordWrap: scala.Boolean => Anchor
  ): Anchor = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setDirection = js.Any.fromFunction1(setDirection), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setHref = js.Any.fromFunction1(setHref), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTarget = js.Any.fromFunction1(setTarget), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[Anchor]
  }
}

