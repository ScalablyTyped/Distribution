package typings.eggLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Excludes extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Excludes {
    
    inline def apply(): Excludes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Excludes]
    }
    
    extension [Self <: Excludes](x: Self) {
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    }
  }
}
