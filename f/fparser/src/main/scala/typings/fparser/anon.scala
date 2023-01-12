package typings.fparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Memoization extends StObject {
    
    var memoization: js.UndefOr[Boolean] = js.undefined
  }
  object Memoization {
    
    inline def apply(): Memoization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Memoization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Memoization] (val x: Self) extends AnyVal {
      
      inline def setMemoization(value: Boolean): Self = StObject.set(x, "memoization", value.asInstanceOf[js.Any])
      
      inline def setMemoizationUndefined: Self = StObject.set(x, "memoization", js.undefined)
    }
  }
}
