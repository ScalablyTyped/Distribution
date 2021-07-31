package typings.eggLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Excludes extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Excludes {
    
    @scala.inline
    def apply(): Excludes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Excludes]
    }
    
    @scala.inline
    implicit class ExcludesMutableBuilder[Self <: Excludes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      @scala.inline
      def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    }
  }
}
