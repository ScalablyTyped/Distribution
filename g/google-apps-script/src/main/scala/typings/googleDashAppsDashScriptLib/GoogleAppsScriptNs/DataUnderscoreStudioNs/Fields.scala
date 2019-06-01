package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  def asArray(): js.Array[Field]
  def build(): js.Array[_]
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
    asArray: () => js.Array[Field],
    build: () => js.Array[_],
    forIds: js.Array[java.lang.String] => Fields,
    getDefaultDimension: () => Field,
    getDefaultMetric: () => Field,
    getFieldById: java.lang.String => Field,
    newDimension: () => Field,
    newMetric: () => Field,
    setDefaultDimension: java.lang.String => scala.Unit,
    setDefaultMetric: java.lang.String => scala.Unit
  ): Fields = {
    val __obj = js.Dynamic.literal(asArray = js.Any.fromFunction0(asArray), build = js.Any.fromFunction0(build), forIds = js.Any.fromFunction1(forIds), getDefaultDimension = js.Any.fromFunction0(getDefaultDimension), getDefaultMetric = js.Any.fromFunction0(getDefaultMetric), getFieldById = js.Any.fromFunction1(getFieldById), newDimension = js.Any.fromFunction0(newDimension), newMetric = js.Any.fromFunction0(newMetric), setDefaultDimension = js.Any.fromFunction1(setDefaultDimension), setDefaultMetric = js.Any.fromFunction1(setDefaultMetric))
  
    __obj.asInstanceOf[Fields]
  }
}

