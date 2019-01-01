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

