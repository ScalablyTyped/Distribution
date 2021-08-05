package typings.expressUnless

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressUnless.anon.Method
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], Boolean]): typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: Options): typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-unless", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var custom: js.UndefOr[
        js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], Boolean]
      ] = js.undefined
    
    var ext: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var method: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var path: js.UndefOr[pathFilter | js.Array[pathFilter]] = js.undefined
    
    var useOriginalUrl: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustom(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => Boolean): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setExt(value: String | js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
      
      inline def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      inline def setPath(value: pathFilter | js.Array[pathFilter]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: pathFilter*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setUseOriginalUrl(value: Boolean): Self = StObject.set(x, "useOriginalUrl", value.asInstanceOf[js.Any])
      
      inline def setUseOriginalUrlUndefined: Self = StObject.set(x, "useOriginalUrl", js.undefined)
    }
  }
  
  @js.native
  trait RequestHandler
    extends typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
    
    var unless: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof unless */ js.Any
      ] = js.native
  }
  
  type pathFilter = String | RegExp | Method
}
