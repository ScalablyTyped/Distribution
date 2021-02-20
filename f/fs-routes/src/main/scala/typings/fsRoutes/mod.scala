package typings.fsRoutes

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-routes", JSImport.Default)
  @js.native
  def default(dir: String): js.Array[FsRoute] = js.native
  @JSImport("fs-routes", JSImport.Default)
  @js.native
  def default(dir: String, options: FsRoutesOptions): js.Array[FsRoute] = js.native
  
  @js.native
  trait FsRoute extends StObject {
    
    var path: String = js.native
    
    var route: String = js.native
  }
  object FsRoute {
    
    @scala.inline
    def apply(path: String, route: String): FsRoute = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsRoute]
    }
    
    @scala.inline
    implicit class FsRouteMutableBuilder[Self <: FsRoute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FsRoutesOptions extends StObject {
    
    var glob: js.UndefOr[String] = js.native
    
    var indexFileRegExp: js.UndefOr[RegExp] = js.native
  }
  object FsRoutesOptions {
    
    @scala.inline
    def apply(): FsRoutesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsRoutesOptions]
    }
    
    @scala.inline
    implicit class FsRoutesOptionsMutableBuilder[Self <: FsRoutesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setIndexFileRegExp(value: RegExp): Self = StObject.set(x, "indexFileRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexFileRegExpUndefined: Self = StObject.set(x, "indexFileRegExp", js.undefined)
    }
  }
}
