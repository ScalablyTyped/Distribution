package typings.engineCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("engine-check", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("engine-check", JSImport.Namespace)
  @js.native
  def apply(options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var searchRoot: js.UndefOr[String] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setSearchRoot(value: String): Self = StObject.set(x, "searchRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchRootUndefined: Self = StObject.set(x, "searchRoot", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
