package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsConstMod.ConstInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsReproducibleMod {
  
  trait IReproducibleInterval[T /* <: ConstInterval */] extends StObject {
    
    def makeByLengthEnd(length: Double, end: Double): T
    
    def makeByStartEnd(start: Double, end: Double): T
    
    def makeByStartLength(start: Double, length: Double): T
  }
  object IReproducibleInterval {
    
    inline def apply[T /* <: ConstInterval */](
      makeByLengthEnd: (Double, Double) => T,
      makeByStartEnd: (Double, Double) => T,
      makeByStartLength: (Double, Double) => T
    ): IReproducibleInterval[T] = {
      val __obj = js.Dynamic.literal(makeByLengthEnd = js.Any.fromFunction2(makeByLengthEnd), makeByStartEnd = js.Any.fromFunction2(makeByStartEnd), makeByStartLength = js.Any.fromFunction2(makeByStartLength))
      __obj.asInstanceOf[IReproducibleInterval[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IReproducibleInterval[?], T /* <: ConstInterval */] (val x: Self & IReproducibleInterval[T]) extends AnyVal {
      
      inline def setMakeByLengthEnd(value: (Double, Double) => T): Self = StObject.set(x, "makeByLengthEnd", js.Any.fromFunction2(value))
      
      inline def setMakeByStartEnd(value: (Double, Double) => T): Self = StObject.set(x, "makeByStartEnd", js.Any.fromFunction2(value))
      
      inline def setMakeByStartLength(value: (Double, Double) => T): Self = StObject.set(x, "makeByStartLength", js.Any.fromFunction2(value))
    }
  }
}
