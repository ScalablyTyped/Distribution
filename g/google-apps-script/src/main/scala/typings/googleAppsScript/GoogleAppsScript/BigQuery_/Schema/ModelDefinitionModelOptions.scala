package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelDefinitionModelOptions extends StObject {
  
  var labels: js.UndefOr[js.Array[String]] = js.native
  
  var lossType: js.UndefOr[String] = js.native
  
  var modelType: js.UndefOr[String] = js.native
}
object ModelDefinitionModelOptions {
  
  @scala.inline
  def apply(): ModelDefinitionModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinitionModelOptions]
  }
  
  @scala.inline
  implicit class ModelDefinitionModelOptionsMutableBuilder[Self <: ModelDefinitionModelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLossType(value: String): Self = StObject.set(x, "lossType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLossTypeUndefined: Self = StObject.set(x, "lossType", js.undefined)
    
    @scala.inline
    def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
  }
}
