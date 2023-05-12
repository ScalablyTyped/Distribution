package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleCorrectorDefinition extends StObject {
  
  var applyTo: js.UndefOr[js.Array[String]] = js.undefined
  
  var correct: ScaleCorrector
}
object ScaleCorrectorDefinition {
  
  inline def apply(correct: (/* latest */ String | Double, /* node */ IProjectionNode[Any]) => String | Double): ScaleCorrectorDefinition = {
    val __obj = js.Dynamic.literal(correct = js.Any.fromFunction2(correct))
    __obj.asInstanceOf[ScaleCorrectorDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleCorrectorDefinition] (val x: Self) extends AnyVal {
    
    inline def setApplyTo(value: js.Array[String]): Self = StObject.set(x, "applyTo", value.asInstanceOf[js.Any])
    
    inline def setApplyToUndefined: Self = StObject.set(x, "applyTo", js.undefined)
    
    inline def setApplyToVarargs(value: String*): Self = StObject.set(x, "applyTo", js.Array(value*))
    
    inline def setCorrect(value: (/* latest */ String | Double, /* node */ IProjectionNode[Any]) => String | Double): Self = StObject.set(x, "correct", js.Any.fromFunction2(value))
  }
}
