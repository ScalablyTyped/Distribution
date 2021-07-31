package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Field extends StObject {
  
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
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAggregation(value: () => AggregationType | Null): Self = StObject.set(x, "getAggregation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String | Null): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormula(value: () => String | Null): Self = StObject.set(x, "getFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroup(value: () => String | Null): Self = StObject.set(x, "getGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String | Null): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsReaggregatable(value: () => Boolean | Null): Self = StObject.set(x, "getIsReaggregatable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String | Null): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => FieldType | Null): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDefault(value: () => Boolean): Self = StObject.set(x, "isDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDimension(value: () => Boolean): Self = StObject.set(x, "isDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHidden(value: () => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMetric(value: () => Boolean): Self = StObject.set(x, "isMetric", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAggregation(value: AggregationType => Field): Self = StObject.set(x, "setAggregation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDescription(value: String => Field): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFormula(value: String => Field): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroup(value: String => Field): Self = StObject.set(x, "setGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: String => Field): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsHidden(value: Boolean => Field): Self = StObject.set(x, "setIsHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsReaggregatable(value: Boolean => Field): Self = StObject.set(x, "setIsReaggregatable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => Field): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetType(value: FieldType => Field): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
  }
}
