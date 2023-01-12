package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDefinitionOverload
  extends StObject
     with BackboneElement {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _parameterName: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Comments to go on overload.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Name of parameter to include in overload.
    */
  var parameterName: js.UndefOr[js.Array[String]] = js.undefined
}
object OperationDefinitionOverload {
  
  inline def apply(): OperationDefinitionOverload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDefinitionOverload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationDefinitionOverload] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setParameterName(value: js.Array[String]): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    inline def setParameterNameVarargs(value: String*): Self = StObject.set(x, "parameterName", js.Array(value*))
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_parameterName(value: js.Array[Element]): Self = StObject.set(x, "_parameterName", value.asInstanceOf[js.Any])
    
    inline def set_parameterNameUndefined: Self = StObject.set(x, "_parameterName", js.undefined)
    
    inline def set_parameterNameVarargs(value: Element*): Self = StObject.set(x, "_parameterName", js.Array(value*))
  }
}
