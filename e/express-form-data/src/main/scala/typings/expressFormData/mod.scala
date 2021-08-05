package typings.expressFormData

import typings.connect.mod.NextHandleFunction
import typings.multiparty.mod.FormOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-form-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[NextHandleFunction]
  
  inline def parse(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[NextHandleFunction]
  inline def parse(options: FormDataOptions): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  inline def stream(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[NextHandleFunction]
  
  inline def union(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("union")().asInstanceOf[NextHandleFunction]
  
  trait FormDataOptions
    extends StObject
       with FormOptions {
    
    var autoClean: js.UndefOr[Boolean] = js.undefined
  }
  object FormDataOptions {
    
    inline def apply(): FormDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormDataOptions]
    }
    
    extension [Self <: FormDataOptions](x: Self) {
      
      inline def setAutoClean(value: Boolean): Self = StObject.set(x, "autoClean", value.asInstanceOf[js.Any])
      
      inline def setAutoCleanUndefined: Self = StObject.set(x, "autoClean", js.undefined)
    }
  }
}
