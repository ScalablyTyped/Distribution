package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.parserMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Err[T]
    extends StObject
       with Result[T, Any]
       with typings.formatjsIcuMessageformatParser.libParserMod.Result[T, Any] {
    
    var err: Null
    
    var `val`: T
  }
  object Err {
    
    inline def apply[T](err: Null, `val`: T): Err[T] = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Err[T]]
    }
    
    extension [Self <: Err[?], T](x: Self & Err[T]) {
      
      inline def setErr(value: Null): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setVal(value: T): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  trait Val[E]
    extends StObject
       with Result[Any, E]
       with typings.formatjsIcuMessageformatParser.libParserMod.Result[Any, E] {
    
    var err: E
    
    var `val`: Null
  }
  object Val {
    
    inline def apply[E](err: E, `val`: Null): Val[E] = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Val[E]]
    }
    
    extension [Self <: Val[?], E](x: Self & Val[E]) {
      
      inline def setErr(value: E): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Null): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
