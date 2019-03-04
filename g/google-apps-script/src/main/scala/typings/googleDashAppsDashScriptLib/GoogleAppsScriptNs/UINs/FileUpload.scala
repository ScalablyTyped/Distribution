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
    addChangeHandler: js.Function1[Handler, FileUpload],
    addStyleDependentName: js.Function1[java.lang.String, FileUpload],
    addStyleName: js.Function1[java.lang.String, FileUpload],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setEnabled: js.Function1[scala.Boolean, FileUpload],
    setHeight: js.Function1[java.lang.String, FileUpload],
    setId: js.Function1[java.lang.String, FileUpload],
    setLayoutData: js.Function1[js.Object, FileUpload],
    setName: js.Function1[java.lang.String, FileUpload],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      FileUpload
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, FileUpload],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, FileUpload],
    setStyleAttributes: js.Function1[js.Object, FileUpload],
    setStyleName: js.Function1[java.lang.String, FileUpload],
    setStylePrimaryName: js.Function1[java.lang.String, FileUpload],
    setTag: js.Function1[java.lang.String, FileUpload],
    setTitle: js.Function1[java.lang.String, FileUpload],
    setVisible: js.Function1[scala.Boolean, FileUpload],
    setWidth: js.Function1[java.lang.String, FileUpload]
  ): FileUpload = {
    val __obj = js.Dynamic.literal(addChangeHandler = addChangeHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setEnabled = setEnabled, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setName = setName, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[FileUpload]
  }
}

