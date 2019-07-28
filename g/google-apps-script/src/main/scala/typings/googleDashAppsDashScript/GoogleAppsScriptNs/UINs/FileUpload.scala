package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpload extends js.Object {
  def addChangeHandler(handler: Handler): FileUpload
  def addStyleDependentName(styleName: String): FileUpload
  def addStyleName(styleName: String): FileUpload
  def getId(): String
  def getTag(): String
  def getType(): String
  def setEnabled(enabled: Boolean): FileUpload
  def setHeight(height: String): FileUpload
  def setId(id: String): FileUpload
  def setLayoutData(layout: js.Any): FileUpload
  def setName(name: String): FileUpload
  def setPixelSize(width: Integer, height: Integer): FileUpload
  def setSize(width: String, height: String): FileUpload
  def setStyleAttribute(attribute: String, value: String): FileUpload
  def setStyleAttributes(attributes: js.Any): FileUpload
  def setStyleName(styleName: String): FileUpload
  def setStylePrimaryName(styleName: String): FileUpload
  def setTag(tag: String): FileUpload
  def setTitle(title: String): FileUpload
  def setVisible(visible: Boolean): FileUpload
  def setWidth(width: String): FileUpload
}

object FileUpload {
  @scala.inline
  def apply(
    addChangeHandler: Handler => FileUpload,
    addStyleDependentName: String => FileUpload,
    addStyleName: String => FileUpload,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setEnabled: Boolean => FileUpload,
    setHeight: String => FileUpload,
    setId: String => FileUpload,
    setLayoutData: js.Any => FileUpload,
    setName: String => FileUpload,
    setPixelSize: (Integer, Integer) => FileUpload,
    setSize: (String, String) => FileUpload,
    setStyleAttribute: (String, String) => FileUpload,
    setStyleAttributes: js.Any => FileUpload,
    setStyleName: String => FileUpload,
    setStylePrimaryName: String => FileUpload,
    setTag: String => FileUpload,
    setTitle: String => FileUpload,
    setVisible: Boolean => FileUpload,
    setWidth: String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(addChangeHandler = js.Any.fromFunction1(addChangeHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setEnabled = js.Any.fromFunction1(setEnabled), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[FileUpload]
  }
}

