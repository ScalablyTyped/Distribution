package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Context. */
trait IContext extends StObject {
  
  /** Context lifespanCount */
  var lifespanCount: js.UndefOr[Double | Null] = js.undefined
  
  /** Context name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Context parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
}
object IContext {
  
  inline def apply(): IContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContext]
  }
  
  extension [Self <: IContext](x: Self) {
    
    inline def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    inline def setLifespanCountNull: Self = StObject.set(x, "lifespanCount", null)
    
    inline def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: IStruct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
