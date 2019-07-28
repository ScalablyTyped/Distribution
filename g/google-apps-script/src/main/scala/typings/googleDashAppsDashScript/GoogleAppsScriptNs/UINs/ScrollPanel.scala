package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollPanel extends js.Object {
  def add(widget: Widget): ScrollPanel
  def addScrollHandler(handler: Handler): ScrollPanel
  def addStyleDependentName(styleName: String): ScrollPanel
  def addStyleName(styleName: String): ScrollPanel
  def clear(): ScrollPanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAlwaysShowScrollBars(alwaysShow: Boolean): ScrollPanel
  def setHeight(height: String): ScrollPanel
  def setHorizontalScrollPosition(position: Integer): ScrollPanel
  def setId(id: String): ScrollPanel
  def setLayoutData(layout: js.Any): ScrollPanel
  def setPixelSize(width: Integer, height: Integer): ScrollPanel
  def setScrollPosition(position: Integer): ScrollPanel
  def setSize(width: String, height: String): ScrollPanel
  def setStyleAttribute(attribute: String, value: String): ScrollPanel
  def setStyleAttributes(attributes: js.Any): ScrollPanel
  def setStyleName(styleName: String): ScrollPanel
  def setStylePrimaryName(styleName: String): ScrollPanel
  def setTag(tag: String): ScrollPanel
  def setTitle(title: String): ScrollPanel
  def setVisible(visible: Boolean): ScrollPanel
  def setWidget(widget: Widget): ScrollPanel
  def setWidth(width: String): ScrollPanel
}

object ScrollPanel {
  @scala.inline
  def apply(
    add: Widget => ScrollPanel,
    addScrollHandler: Handler => ScrollPanel,
    addStyleDependentName: String => ScrollPanel,
    addStyleName: String => ScrollPanel,
    clear: () => ScrollPanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAlwaysShowScrollBars: Boolean => ScrollPanel,
    setHeight: String => ScrollPanel,
    setHorizontalScrollPosition: Integer => ScrollPanel,
    setId: String => ScrollPanel,
    setLayoutData: js.Any => ScrollPanel,
    setPixelSize: (Integer, Integer) => ScrollPanel,
    setScrollPosition: Integer => ScrollPanel,
    setSize: (String, String) => ScrollPanel,
    setStyleAttribute: (String, String) => ScrollPanel,
    setStyleAttributes: js.Any => ScrollPanel,
    setStyleName: String => ScrollPanel,
    setStylePrimaryName: String => ScrollPanel,
    setTag: String => ScrollPanel,
    setTitle: String => ScrollPanel,
    setVisible: Boolean => ScrollPanel,
    setWidget: Widget => ScrollPanel,
    setWidth: String => ScrollPanel
  ): ScrollPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addScrollHandler = js.Any.fromFunction1(addScrollHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAlwaysShowScrollBars = js.Any.fromFunction1(setAlwaysShowScrollBars), setHeight = js.Any.fromFunction1(setHeight), setHorizontalScrollPosition = js.Any.fromFunction1(setHorizontalScrollPosition), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setScrollPosition = js.Any.fromFunction1(setScrollPosition), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[ScrollPanel]
  }
}

