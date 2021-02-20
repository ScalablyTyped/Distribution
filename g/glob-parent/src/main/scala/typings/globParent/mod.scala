package typings.globParent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glob-parent", JSImport.Namespace)
  @js.native
  def apply(pattern: String): String = js.native
  @JSImport("glob-parent", JSImport.Namespace)
  @js.native
  def apply(pattern: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var flipBackslashes: js.UndefOr[Boolean] = js.native
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
      def setFlipBackslashes(value: Boolean): Self = StObject.set(x, "flipBackslashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipBackslashesUndefined: Self = StObject.set(x, "flipBackslashes", js.undefined)
    }
  }
}
