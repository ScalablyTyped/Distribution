package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mount extends StObject {
  
  var mount: js.UndefOr[String] = js.native
}
object Mount {
  
  @scala.inline
  def apply(): Mount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mount]
  }
  
  @scala.inline
  implicit class MountMutableBuilder[Self <: Mount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
  }
}
