package typings.fuzzySearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<fuzzy-search.fuzzy-search.Options> */
  trait RequiredOptions extends StObject {
    
    var caseSensitive: Boolean
    
    var sort: Boolean
  }
  object RequiredOptions {
    
    inline def apply(caseSensitive: Boolean, sort: Boolean): RequiredOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    extension [Self <: RequiredOptions](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    }
  }
}
