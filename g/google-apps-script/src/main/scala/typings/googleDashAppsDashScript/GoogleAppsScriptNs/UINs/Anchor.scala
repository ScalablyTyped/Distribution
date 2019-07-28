package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addStyleDependentName(styleName: String): Anchor
  def addStyleName(styleName: String): Anchor
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): Anchor
  def setDirection(direction: Component): Anchor
  def setEnabled(enabled: Boolean): Anchor
  def setFocus(focus: Boolean): Anchor
  def setHTML(html: String): Anchor
  def setHeight(height: String): Anchor
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): Anchor
  def setHref(href: String): Anchor
  def setId(id: String): Anchor
  def setLayoutData(layout: js.Any): Anchor
  def setName(name: String): Anchor
  def setPixelSize(width: Integer, height: Integer): Anchor
  def setSize(width: String, height: String): Anchor
  def setStyleAttribute(attribute: String, value: String): Anchor
  def setStyleAttributes(attributes: js.Any): Anchor
  def setStyleName(styleName: String): Anchor
  def setStylePrimaryName(styleName: String): Anchor
  def setTabIndex(index: Integer): Anchor
  def setTag(tag: String): Anchor
  def setTarget(target: String): Anchor
  def setText(text: String): Anchor
  def setTitle(title: String): Anchor
  def setVisible(visible: Boolean): Anchor
  def setWidth(width: String): Anchor
  def setWordWrap(wordWrap: Boolean): Anchor
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
    addStyleDependentName: String => Anchor,
    addStyleName: String => Anchor,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => Anchor,
    setDirection: Component => Anchor,
    setEnabled: Boolean => Anchor,
    setFocus: Boolean => Anchor,
    setHTML: String => Anchor,
    setHeight: String => Anchor,
    setHorizontalAlignment: HorizontalAlignment => Anchor,
    setHref: String => Anchor,
    setId: String => Anchor,
    setLayoutData: js.Any => Anchor,
    setName: String => Anchor,
    setPixelSize: (Integer, Integer) => Anchor,
    setSize: (String, String) => Anchor,
    setStyleAttribute: (String, String) => Anchor,
    setStyleAttributes: js.Any => Anchor,
    setStyleName: String => Anchor,
    setStylePrimaryName: String => Anchor,
    setTabIndex: Integer => Anchor,
    setTag: String => Anchor,
    setTarget: String => Anchor,
    setText: String => Anchor,
    setTitle: String => Anchor,
    setVisible: Boolean => Anchor,
    setWidth: String => Anchor,
    setWordWrap: Boolean => Anchor
  ): Anchor = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setDirection = js.Any.fromFunction1(setDirection), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setHref = js.Any.fromFunction1(setHref), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTarget = js.Any.fromFunction1(setTarget), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[Anchor]
  }
}

