package typings.findImports

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AbsoluteImports extends StObject {
    
    var absoluteImports: js.UndefOr[Boolean] = js.undefined
    
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    var packageImports: js.UndefOr[Boolean] = js.undefined
    
    var relativeImports: js.UndefOr[Boolean] = js.undefined
  }
  object AbsoluteImports {
    
    inline def apply(): AbsoluteImports = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbsoluteImports]
    }
    
    extension [Self <: AbsoluteImports](x: Self) {
      
      inline def setAbsoluteImports(value: Boolean): Self = StObject.set(x, "absoluteImports", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteImportsUndefined: Self = StObject.set(x, "absoluteImports", js.undefined)
      
      inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setPackageImports(value: Boolean): Self = StObject.set(x, "packageImports", value.asInstanceOf[js.Any])
      
      inline def setPackageImportsUndefined: Self = StObject.set(x, "packageImports", js.undefined)
      
      inline def setRelativeImports(value: Boolean): Self = StObject.set(x, "relativeImports", value.asInstanceOf[js.Any])
      
      inline def setRelativeImportsUndefined: Self = StObject.set(x, "relativeImports", js.undefined)
    }
  }
}
