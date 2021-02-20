package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CiEnvBase extends StObject {
  
  var isCi: `true` = js.native
}
object CiEnvBase {
  
  @scala.inline
  def apply(isCi: `true`): CiEnvBase = {
    val __obj = js.Dynamic.literal(isCi = isCi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiEnvBase]
  }
  
  @scala.inline
  implicit class CiEnvBaseMutableBuilder[Self <: CiEnvBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCi(value: `true`): Self = StObject.set(x, "isCi", value.asInstanceOf[js.Any])
  }
}
