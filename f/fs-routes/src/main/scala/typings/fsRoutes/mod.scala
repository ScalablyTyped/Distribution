package typings.fsRoutes

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dir: String): js.Array[FsRoute] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[FsRoute]]
  inline def default(dir: String, options: FsRoutesOptions): js.Array[FsRoute] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[FsRoute]]
  
  trait FsRoute extends StObject {
    
    var path: String
    
    var route: String
  }
  object FsRoute {
    
    inline def apply(path: String, route: String): FsRoute = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsRoute]
    }
    
    extension [Self <: FsRoute](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait FsRoutesOptions extends StObject {
    
    var glob: js.UndefOr[String] = js.undefined
    
    var indexFileRegExp: js.UndefOr[RegExp] = js.undefined
  }
  object FsRoutesOptions {
    
    inline def apply(): FsRoutesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsRoutesOptions]
    }
    
    extension [Self <: FsRoutesOptions](x: Self) {
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setIndexFileRegExp(value: RegExp): Self = StObject.set(x, "indexFileRegExp", value.asInstanceOf[js.Any])
      
      inline def setIndexFileRegExpUndefined: Self = StObject.set(x, "indexFileRegExp", js.undefined)
    }
  }
}
