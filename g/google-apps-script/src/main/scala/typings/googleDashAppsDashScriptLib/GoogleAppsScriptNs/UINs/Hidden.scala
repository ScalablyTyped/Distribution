package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hidden extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): Hidden
  def addStyleName(styleName: java.lang.String): Hidden
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setDefaultValue(value: java.lang.String): Hidden
  def setHeight(height: java.lang.String): Hidden
  def setID(id: java.lang.String): Hidden
  def setId(id: java.lang.String): Hidden
  def setLayoutData(layout: js.Object): Hidden
  def setName(name: java.lang.String): Hidden
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Hidden
  def setSize(width: java.lang.String, height: java.lang.String): Hidden
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Hidden
  def setStyleAttributes(attributes: js.Object): Hidden
  def setStyleName(styleName: java.lang.String): Hidden
  def setStylePrimaryName(styleName: java.lang.String): Hidden
  def setTag(tag: java.lang.String): Hidden
  def setTitle(title: java.lang.String): Hidden
  def setValue(value: java.lang.String): Hidden
  def setVisible(visible: scala.Boolean): Hidden
  def setWidth(width: java.lang.String): Hidden
}

object Hidden {
  @scala.inline
  def apply(
    addStyleDependentName: js.Function1[java.lang.String, Hidden],
    addStyleName: js.Function1[java.lang.String, Hidden],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setDefaultValue: js.Function1[java.lang.String, Hidden],
    setHeight: js.Function1[java.lang.String, Hidden],
    setID: js.Function1[java.lang.String, Hidden],
    setId: js.Function1[java.lang.String, Hidden],
    setLayoutData: js.Function1[js.Object, Hidden],
    setName: js.Function1[java.lang.String, Hidden],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Hidden
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, Hidden],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, Hidden],
    setStyleAttributes: js.Function1[js.Object, Hidden],
    setStyleName: js.Function1[java.lang.String, Hidden],
    setStylePrimaryName: js.Function1[java.lang.String, Hidden],
    setTag: js.Function1[java.lang.String, Hidden],
    setTitle: js.Function1[java.lang.String, Hidden],
    setValue: js.Function1[java.lang.String, Hidden],
    setVisible: js.Function1[scala.Boolean, Hidden],
    setWidth: js.Function1[java.lang.String, Hidden]
  ): Hidden = {
    val __obj = js.Dynamic.literal(addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setDefaultValue = setDefaultValue, setHeight = setHeight, setID = setID, setId = setId, setLayoutData = setLayoutData, setName = setName, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setValue = setValue, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[Hidden]
  }
}

