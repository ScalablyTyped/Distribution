package typings.elasticlunr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Tf extends StObject {
    
    var tf: js.UndefOr[Double] = js.native
  }
  object Tf {
    
    @scala.inline
    def apply(): Tf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tf]
    }
    
    @scala.inline
    implicit class TfMutableBuilder[Self <: Tf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTf(value: Double): Self = StObject.set(x, "tf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfUndefined: Self = StObject.set(x, "tf", js.undefined)
    }
  }
}
