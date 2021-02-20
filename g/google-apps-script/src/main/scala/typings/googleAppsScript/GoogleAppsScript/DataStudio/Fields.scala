package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set of Fields for a community connector. This set of fields define which
  * dimensions and metrics can be used in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fields = cc.getFields();
  *     var types = cc.FieldType;
  *
  *     var field1 = fields.newDimension()
  *       // Set other properties as needed.
  *       .setId('field1_id');
  */
@js.native
trait Fields extends StObject {
  
  def asArray(): js.Array[Field] = js.native
  
  def build(): js.Array[_] = js.native
  
  def forIds(ids: js.Array[String]): Fields = js.native
  
  def getDefaultDimension(): Field | Null = js.native
  
  def getDefaultMetric(): Field | Null = js.native
  
  def getFieldById(fieldId: String): Field | Null = js.native
  
  def newDimension(): Field = js.native
  
  def newMetric(): Field = js.native
  
  def setDefaultDimension(fieldId: String): Unit = js.native
  
  def setDefaultMetric(fieldId: String): Unit = js.native
}
object Fields {
  
  @scala.inline
  def apply(
    asArray: () => js.Array[Field],
    build: () => js.Array[_],
    forIds: js.Array[String] => Fields,
    getDefaultDimension: () => Field | Null,
    getDefaultMetric: () => Field | Null,
    getFieldById: String => Field | Null,
    newDimension: () => Field,
    newMetric: () => Field,
    setDefaultDimension: String => Unit,
    setDefaultMetric: String => Unit
  ): Fields = {
    val __obj = js.Dynamic.literal(asArray = js.Any.fromFunction0(asArray), build = js.Any.fromFunction0(build), forIds = js.Any.fromFunction1(forIds), getDefaultDimension = js.Any.fromFunction0(getDefaultDimension), getDefaultMetric = js.Any.fromFunction0(getDefaultMetric), getFieldById = js.Any.fromFunction1(getFieldById), newDimension = js.Any.fromFunction0(newDimension), newMetric = js.Any.fromFunction0(newMetric), setDefaultDimension = js.Any.fromFunction1(setDefaultDimension), setDefaultMetric = js.Any.fromFunction1(setDefaultMetric))
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsArray(value: () => js.Array[Field]): Self = StObject.set(x, "asArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuild(value: () => js.Array[_]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForIds(value: js.Array[String] => Fields): Self = StObject.set(x, "forIds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultDimension(value: () => Field | Null): Self = StObject.set(x, "getDefaultDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultMetric(value: () => Field | Null): Self = StObject.set(x, "getDefaultMetric", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldById(value: String => Field | Null): Self = StObject.set(x, "getFieldById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewDimension(value: () => Field): Self = StObject.set(x, "newDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMetric(value: () => Field): Self = StObject.set(x, "newMetric", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDefaultDimension(value: String => Unit): Self = StObject.set(x, "setDefaultDimension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultMetric(value: String => Unit): Self = StObject.set(x, "setDefaultMetric", js.Any.fromFunction1(value))
  }
}
