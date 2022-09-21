package typings.doiRegex

import typings.std.RegExpExecArray
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.RegExp]
  inline def apply(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  @JSImport("doi-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def declared(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("declared")().asInstanceOf[js.RegExp]
  inline def declared(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("declared")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def groups(doi: String): ReturnType[js.Function1[/* string */ String, RegExpExecArray | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groups")(doi.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* string */ String, RegExpExecArray | Null]]]
  
  inline def resolvePath(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")().asInstanceOf[js.RegExp]
  inline def resolvePath(options: PathOptions): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  trait Options extends StObject {
    
    var exact: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
  
  trait PathOptions extends StObject {
    
    var protocol: js.UndefOr[Boolean] = js.undefined
  }
  object PathOptions {
    
    inline def apply(): PathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOptions]
    }
    
    extension [Self <: PathOptions](x: Self) {
      
      inline def setProtocol(value: Boolean): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
}
