package typings.emberApplication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationsMod {
  
  @JSImport("@ember/application/deprecations", "deprecate")
  @js.native
  def deprecate(message: String, test: Boolean, options: DeprecationOptions): js.Any = js.native
  
  @JSImport("@ember/application/deprecations", "deprecateFunc")
  @js.native
  def deprecateFunc[Func /* <: js.Function1[/* repeated */ js.Any, _] */](message: String, options: DeprecationOptions, func: Func): Func = js.native
  
  @js.native
  trait DeprecationOptions extends StObject {
    
    var id: String = js.native
    
    var until: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object DeprecationOptions {
    
    @scala.inline
    def apply(id: String, until: String): DeprecationOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecationOptions]
    }
    
    @scala.inline
    implicit class DeprecationOptionsMutableBuilder[Self <: DeprecationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
