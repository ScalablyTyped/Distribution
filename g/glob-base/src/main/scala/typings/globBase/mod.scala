package typings.globBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glob-base", JSImport.Namespace)
  @js.native
  def apply(): GlobBaseResult = js.native
  @JSImport("glob-base", JSImport.Namespace)
  @js.native
  def apply(basePath: String): GlobBaseResult = js.native
  
  @js.native
  trait GlobBaseResult extends StObject {
    
    var base: String = js.native
    
    var glob: String = js.native
    
    var isGlob: Boolean = js.native
  }
  object GlobBaseResult {
    
    @scala.inline
    def apply(base: String, glob: String, isGlob: Boolean): GlobBaseResult = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobBaseResult]
    }
    
    @scala.inline
    implicit class GlobBaseResultMutableBuilder[Self <: GlobBaseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
    }
  }
}
