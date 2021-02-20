package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Idx extends StObject {
  
  var idx: js.UndefOr[Double] = js.native
}
object Idx {
  
  @scala.inline
  def apply(): Idx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Idx]
  }
  
  @scala.inline
  implicit class IdxMutableBuilder[Self <: Idx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
  }
}
