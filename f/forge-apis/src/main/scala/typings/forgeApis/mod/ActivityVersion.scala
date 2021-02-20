package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityVersion extends StObject {
  
  var Version: js.UndefOr[Double] = js.native
}
object ActivityVersion {
  
  @scala.inline
  def apply(): ActivityVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityVersion]
  }
  
  @scala.inline
  implicit class ActivityVersionMutableBuilder[Self <: ActivityVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
