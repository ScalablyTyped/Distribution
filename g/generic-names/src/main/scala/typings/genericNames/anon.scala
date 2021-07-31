package typings.genericNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<generic-names.generic-names.Options> */
  trait PartialOptions extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var hashPrefix: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
    }
  }
}
