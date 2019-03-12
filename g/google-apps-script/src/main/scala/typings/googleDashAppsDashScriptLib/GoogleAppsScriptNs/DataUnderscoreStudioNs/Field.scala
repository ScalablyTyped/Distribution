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
    getAggregation: () => AggregationType,
    getDescription: () => java.lang.String,
    getFormula: () => java.lang.String,
    getGroup: () => java.lang.String,
    getId: () => java.lang.String,
    getIsReaggregatable: () => scala.Boolean,
    getName: () => java.lang.String,
    getType: () => FieldType,
    isDefault: () => scala.Boolean,
    isDimension: () => scala.Boolean,
    isHidden: () => scala.Boolean,
    isMetric: () => scala.Boolean,
    setAggregation: AggregationType => Field,
    setDescription: java.lang.String => Field,
    setFormula: java.lang.String => Field,
    setGroup: java.lang.String => Field,
    setId: java.lang.String => Field,
    setIsHidden: scala.Boolean => Field,
    setIsReaggregatable: scala.Boolean => Field,
    setName: java.lang.String => Field,
    setType: FieldType => Field
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = js.Any.fromFunction0(getAggregation), getDescription = js.Any.fromFunction0(getDescription), getFormula = js.Any.fromFunction0(getFormula), getGroup = js.Any.fromFunction0(getGroup), getId = js.Any.fromFunction0(getId), getIsReaggregatable = js.Any.fromFunction0(getIsReaggregatable), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), isDefault = js.Any.fromFunction0(isDefault), isDimension = js.Any.fromFunction0(isDimension), isHidden = js.Any.fromFunction0(isHidden), isMetric = js.Any.fromFunction0(isMetric), setAggregation = js.Any.fromFunction1(setAggregation), setDescription = js.Any.fromFunction1(setDescription), setFormula = js.Any.fromFunction1(setFormula), setGroup = js.Any.fromFunction1(setGroup), setId = js.Any.fromFunction1(setId), setIsHidden = js.Any.fromFunction1(setIsHidden), setIsReaggregatable = js.Any.fromFunction1(setIsReaggregatable), setName = js.Any.fromFunction1(setName), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[Field]
  }
}

