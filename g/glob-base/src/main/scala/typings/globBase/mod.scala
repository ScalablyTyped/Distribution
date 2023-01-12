package typings.globBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): GlobBaseResult = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[GlobBaseResult]
  inline def apply(basePath: String): GlobBaseResult = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[GlobBaseResult]
  
  @JSImport("glob-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GlobBaseResult extends StObject {
    
    var base: String
    
    var glob: String
    
    var isGlob: Boolean
  }
  object GlobBaseResult {
    
    inline def apply(base: String, glob: String, isGlob: Boolean): GlobBaseResult = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobBaseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobBaseResult] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
    }
  }
}
