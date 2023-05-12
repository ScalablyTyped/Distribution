package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueType extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var createTransformer: js.UndefOr[js.Function1[/* template */ String, Transformer]] = js.undefined
  
  var getAnimatableNone: js.UndefOr[js.Function1[/* v */ Any, Any]] = js.undefined
  
  def parse(v: Any): Any
  
  def test(v: Any): Boolean
  
  var transform: js.UndefOr[Transformer] = js.undefined
}
object ValueType {
  
  inline def apply(parse: Any => Any, test: Any => Boolean): ValueType = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ValueType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueType] (val x: Self) extends AnyVal {
    
    inline def setCreateTransformer(value: /* template */ String => Transformer): Self = StObject.set(x, "createTransformer", js.Any.fromFunction1(value))
    
    inline def setCreateTransformerUndefined: Self = StObject.set(x, "createTransformer", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setGetAnimatableNone(value: /* v */ Any => Any): Self = StObject.set(x, "getAnimatableNone", js.Any.fromFunction1(value))
    
    inline def setGetAnimatableNoneUndefined: Self = StObject.set(x, "getAnimatableNone", js.undefined)
    
    inline def setParse(value: Any => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setTest(value: Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTransform(value: /* v */ Any => Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
