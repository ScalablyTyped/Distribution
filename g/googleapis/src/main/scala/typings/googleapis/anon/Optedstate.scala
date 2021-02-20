package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optedstate extends StObject {
  
  var opted_state: js.UndefOr[String] = js.native
}
object Optedstate {
  
  @scala.inline
  def apply(): Optedstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optedstate]
  }
  
  @scala.inline
  implicit class OptedstateMutableBuilder[Self <: Optedstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpted_state(value: String): Self = StObject.set(x, "opted_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpted_stateUndefined: Self = StObject.set(x, "opted_state", js.undefined)
  }
}
