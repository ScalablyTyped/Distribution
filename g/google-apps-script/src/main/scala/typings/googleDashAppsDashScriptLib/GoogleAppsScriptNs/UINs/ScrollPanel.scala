package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollPanel extends js.Object {
  def add(widget: Widget): ScrollPanel
  def addScrollHandler(handler: Handler): ScrollPanel
  def addStyleDependentName(styleName: java.lang.String): ScrollPanel
  def addStyleName(styleName: java.lang.String): ScrollPanel
  def clear(): ScrollPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAlwaysShowScrollBars(alwaysShow: scala.Boolean): ScrollPanel
  def setHeight(height: java.lang.String): ScrollPanel
  def setHorizontalScrollPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScrollPanel
  def setId(id: java.lang.String): ScrollPanel
  def setLayoutData(layout: js.Any): ScrollPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ScrollPanel
  def setScrollPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScrollPanel
  def setSize(width: java.lang.String, height: java.lang.String): ScrollPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ScrollPanel
  def setStyleAttributes(attributes: js.Any): ScrollPanel
  def setStyleName(styleName: java.lang.String): ScrollPanel
  def setStylePrimaryName(styleName: java.lang.String): ScrollPanel
  def setTag(tag: java.lang.String): ScrollPanel
  def setTitle(title: java.lang.String): ScrollPanel
  def setVisible(visible: scala.Boolean): ScrollPanel
  def setWidget(widget: Widget): ScrollPanel
  def setWidth(width: java.lang.String): ScrollPanel
}

object ScrollPanel {
  @scala.inline
  def apply(
    add: Widget => ScrollPanel,
    addScrollHandler: Handler => ScrollPanel,
    addStyleDependentName: java.lang.String => ScrollPanel,
    addStyleName: java.lang.String => ScrollPanel,
    clear: () => ScrollPanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAlwaysShowScrollBars: scala.Boolean => ScrollPanel,
    setHeight: java.lang.String => ScrollPanel,
    setHorizontalScrollPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ScrollPanel,
    setId: java.lang.String => ScrollPanel,
    setLayoutData: js.Any => ScrollPanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => ScrollPanel,
    setScrollPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ScrollPanel,
    setSize: (java.lang.String, java.lang.String) => ScrollPanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => ScrollPanel,
    setStyleAttributes: js.Any => ScrollPanel,
    setStyleName: java.lang.String => ScrollPanel,
    setStylePrimaryName: java.lang.String => ScrollPanel,
    setTag: java.lang.String => ScrollPanel,
    setTitle: java.lang.String => ScrollPanel,
    setVisible: scala.Boolean => ScrollPanel,
    setWidget: Widget => ScrollPanel,
    setWidth: java.lang.String => ScrollPanel
  ): ScrollPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addScrollHandler = js.Any.fromFunction1(addScrollHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAlwaysShowScrollBars = js.Any.fromFunction1(setAlwaysShowScrollBars), setHeight = js.Any.fromFunction1(setHeight), setHorizontalScrollPosition = js.Any.fromFunction1(setHorizontalScrollPosition), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setScrollPosition = js.Any.fromFunction1(setScrollPosition), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[ScrollPanel]
  }
}

