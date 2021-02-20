package typings.feathersjsPrimusClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/primus-client", JSImport.Default)
  @js.native
  def default(socket: js.Any): js.Function0[Unit] = js.native
  @JSImport("@feathersjs/primus-client", JSImport.Default)
  @js.native
  def default(socket: js.Any, options: FeathersPrimusClientOptions): js.Function0[Unit] = js.native
  
  @js.native
  trait FeathersPrimusClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object FeathersPrimusClientOptions {
    
    @scala.inline
    def apply(): FeathersPrimusClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersPrimusClientOptions]
    }
    
    @scala.inline
    implicit class FeathersPrimusClientOptionsMutableBuilder[Self <: FeathersPrimusClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
