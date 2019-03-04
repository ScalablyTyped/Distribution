package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  def asArray(): js.Array[Field]
  def build(): js.Array[js.Object]
  def forIds(ids: js.Array[java.lang.String]): Fields
  def getDefaultDimension(): Field
  def getDefaultMetric(): Field
  def getFieldById(fieldId: java.lang.String): Field
  def newDimension(): Field
  def newMetric(): Field
  def setDefaultDimension(fieldId: java.lang.String): scala.Unit
  def setDefaultMetric(fieldId: java.lang.String): scala.Unit
}

object Fields {
  @scala.inline
  def apply(
    asArray: js.Function0[js.Array[Field]],
    build: js.Function0[js.Array[js.Object]],
    forIds: js.Function1[js.Array[java.lang.String], Fields],
    getDefaultDimension: js.Function0[Field],
    getDefaultMetric: js.Function0[Field],
    getFieldById: js.Function1[java.lang.String, Field],
    newDimension: js.Function0[Field],
    newMetric: js.Function0[Field],
    setDefaultDimension: js.Function1[java.lang.String, scala.Unit],
    setDefaultMetric: js.Function1[java.lang.String, scala.Unit]
  ): Fields = {
    val __obj = js.Dynamic.literal(asArray = asArray, build = build, forIds = forIds, getDefaultDimension = getDefaultDimension, getDefaultMetric = getDefaultMetric, getFieldById = getFieldById, newDimension = newDimension, newMetric = newMetric, setDefaultDimension = setDefaultDimension, setDefaultMetric = setDefaultMetric)
  
    __obj.asInstanceOf[Fields]
  }
}

