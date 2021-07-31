package typings.globToRegexp

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(glob: String): RegExp = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  @scala.inline
  def apply(glob: String, options: Options): RegExp = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  
  @JSImport("glob-to-regexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var extended: js.UndefOr[Boolean] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var globstar: js.UndefOr[Boolean] = js.undefined
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
      def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
    }
  }
}
