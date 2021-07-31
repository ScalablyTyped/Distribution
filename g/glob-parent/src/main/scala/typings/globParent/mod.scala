package typings.globParent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(pattern: String): String = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(pattern: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("glob-parent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var flipBackslashes: js.UndefOr[Boolean] = js.undefined
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
