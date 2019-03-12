package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpload extends js.Object {
  def addChangeHandler(handler: Handler): FileUpload
  def addStyleDependentName(styleName: java.lang.String): FileUpload
  def addStyleName(styleName: java.lang.String): FileUpload
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setEnabled(enabled: scala.Boolean): FileUpload
  def setHeight(height: java.lang.String): FileUpload
  def setId(id: java.lang.String): FileUpload
  def setLayoutData(layout: js.Object): FileUpload
  def setName(name: java.lang.String): FileUpload
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FileUpload
  def setSize(width: java.lang.String, height: java.lang.String): FileUpload
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FileUpload
  def setStyleAttributes(attributes: js.Object): FileUpload
  def setStyleName(styleName: java.lang.String): FileUpload
  def setStylePrimaryName(styleName: java.lang.String): FileUpload
  def setTag(tag: java.lang.String): FileUpload
  def setTitle(title: java.lang.String): FileUpload
  def setVisible(visible: scala.Boolean): FileUpload
  def setWidth(width: java.lang.String): FileUpload
}

object FileUpload {
  @scala.inline
  def apply(
    addChangeHandler: Handler => FileUpload,
    addStyleDependentName: java.lang.String => FileUpload,
    addStyleName: java.lang.String => FileUpload,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setEnabled: scala.Boolean => FileUpload,
    setHeight: java.lang.String => FileUpload,
    setId: java.lang.String => FileUpload,
    setLayoutData: js.Object => FileUpload,
    setName: java.lang.String => FileUpload,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => FileUpload,
    setSize: (java.lang.String, java.lang.String) => FileUpload,
    setStyleAttribute: (java.lang.String, java.lang.String) => FileUpload,
    setStyleAttributes: js.Object => FileUpload,
    setStyleName: java.lang.String => FileUpload,
    setStylePrimaryName: java.lang.String => FileUpload,
    setTag: java.lang.String => FileUpload,
    setTitle: java.lang.String => FileUpload,
    setVisible: scala.Boolean => FileUpload,
    setWidth: java.lang.String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(addChangeHandler = js.Any.fromFunction1(addChangeHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setEnabled = js.Any.fromFunction1(setEnabled), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[FileUpload]
  }
}

