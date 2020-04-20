package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains field-related data. Its properties determine how the field is used in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fields = cc.getFields();
  *     var types = cc.FieldType;
  *
  *     var field1 = fields.newDimension()
  *       .setId('field1_id')
  *       .setName('Field 1 ID')
  *       .setDescription('The first field.')
  *       .setType(types.YEAR_MONTH)
  *       .setGroup('DATETIME');
  */
trait Field extends js.Object {
  def getAggregation(): AggregationType | Null
  def getDescription(): String | Null
  def getFormula(): String | Null
  def getGroup(): String | Null
  def getId(): String | Null
  def getIsReaggregatable(): Boolean | Null
  def getName(): String | Null
  def getType(): FieldType | Null
  def isDefault(): Boolean
  def isDimension(): Boolean
  def isHidden(): Boolean
  def isMetric(): Boolean
  def setAggregation(aggregation: AggregationType): Field
  def setDescription(description: String): Field
  def setFormula(formula: String): Field
  def setGroup(group: String): Field
  def setId(id: String): Field
  def setIsHidden(isHidden: Boolean): Field
  def setIsReaggregatable(isReaggregatable: Boolean): Field
  def setName(name: String): Field
  def setType(`type`: FieldType): Field
}

object Field {
  @scala.inline
  def apply(
    getAggregation: () => AggregationType | Null,
    getDescription: () => String | Null,
    getFormula: () => String | Null,
    getGroup: () => String | Null,
    getId: () => String | Null,
    getIsReaggregatable: () => Boolean | Null,
    getName: () => String | Null,
    getType: () => FieldType | Null,
    isDefault: () => Boolean,
    isDimension: () => Boolean,
    isHidden: () => Boolean,
    isMetric: () => Boolean,
    setAggregation: AggregationType => Field,
    setDescription: String => Field,
    setFormula: String => Field,
    setGroup: String => Field,
    setId: String => Field,
    setIsHidden: Boolean => Field,
    setIsReaggregatable: Boolean => Field,
    setName: String => Field,
    setType: FieldType => Field
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = js.Any.fromFunction0(getAggregation), getDescription = js.Any.fromFunction0(getDescription), getFormula = js.Any.fromFunction0(getFormula), getGroup = js.Any.fromFunction0(getGroup), getId = js.Any.fromFunction0(getId), getIsReaggregatable = js.Any.fromFunction0(getIsReaggregatable), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), isDefault = js.Any.fromFunction0(isDefault), isDimension = js.Any.fromFunction0(isDimension), isHidden = js.Any.fromFunction0(isHidden), isMetric = js.Any.fromFunction0(isMetric), setAggregation = js.Any.fromFunction1(setAggregation), setDescription = js.Any.fromFunction1(setDescription), setFormula = js.Any.fromFunction1(setFormula), setGroup = js.Any.fromFunction1(setGroup), setId = js.Any.fromFunction1(setId), setIsHidden = js.Any.fromFunction1(setIsHidden), setIsReaggregatable = js.Any.fromFunction1(setIsReaggregatable), setName = js.Any.fromFunction1(setName), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[Field]
  }
}

