package typings.eventemitterAsyncresource

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.eventemitterAsyncresource.mod.EventEmitterAsyncResource
import typings.eventemitterAsyncresource.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait TypeofEventEmitterAsyncRe
    extends StObject
       with Instantiable0[EventEmitterAsyncResource]
       with Instantiable1[(/* options */ Options) | (/* options */ String), EventEmitterAsyncResource] {
    
    def EventEmitterAsyncResource: /* import warning: importer.ImportType#apply Failed type conversion: typeof EventEmitterAsyncResource */ js.Any = js.native
  }
}
