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
  def getIsReaggregatable(): scala.Boolean
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
  def setIsReaggregatable(isReaggregatable: scala.Boolean): Field
  def setName(name: java.lang.String): Field
  def setType(`type`: FieldType): Field
}

object Field {
  @scala.inline
  def apply(
    getAggregation: js.Function0[AggregationType],
    getDescription: js.Function0[java.lang.String],
    getFormula: js.Function0[java.lang.String],
    getGroup: js.Function0[java.lang.String],
    getId: js.Function0[java.lang.String],
    getIsReaggregatable: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[FieldType],
    isDefault: js.Function0[scala.Boolean],
    isDimension: js.Function0[scala.Boolean],
    isHidden: js.Function0[scala.Boolean],
    isMetric: js.Function0[scala.Boolean],
    setAggregation: js.Function1[AggregationType, Field],
    setDescription: js.Function1[java.lang.String, Field],
    setFormula: js.Function1[java.lang.String, Field],
    setGroup: js.Function1[java.lang.String, Field],
    setId: js.Function1[java.lang.String, Field],
    setIsHidden: js.Function1[scala.Boolean, Field],
    setIsReaggregatable: js.Function1[scala.Boolean, Field],
    setName: js.Function1[java.lang.String, Field],
    setType: js.Function1[FieldType, Field]
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = getAggregation, getDescription = getDescription, getFormula = getFormula, getGroup = getGroup, getId = getId, getIsReaggregatable = getIsReaggregatable, getName = getName, getType = getType, isDefault = isDefault, isDimension = isDimension, isHidden = isHidden, isMetric = isMetric, setAggregation = setAggregation, setDescription = setDescription, setFormula = setFormula, setGroup = setGroup, setId = setId, setIsHidden = setIsHidden, setIsReaggregatable = setIsReaggregatable, setName = setName, setType = setType)
  
    __obj.asInstanceOf[Field]
  }
}

