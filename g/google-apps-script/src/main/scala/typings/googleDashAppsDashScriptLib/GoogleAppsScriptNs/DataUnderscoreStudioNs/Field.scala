package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  def getAggregation(): AggregationType
  def getDescription(): java.lang.String
  def getFormula(): java.lang.String
  def getGroup(): java.lang.String
  def getId(): java.lang.String
  def getName(): java.lang.String
  def getType(): FieldType
  def isDefault(): scala.Boolean
  def isDimension(): scala.Boolean
  def isHidden(): scala.Boolean
  def isMetric(): scala.Boolean
  def setAggregation(aggregation: AggregationType): Field
  def setDescription(description: java.lang.String): Field
  def setFormula(formula: java.lang.String): Field
  def setGroup(group: java.lang.String): Field
  def setId(id: java.lang.String): Field
  def setIsHidden(isHidden: scala.Boolean): Field
  def setName(name: java.lang.String): Field
  def setType(`type`: FieldType): Field
}

