package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Refreshtoken extends StObject {
  
  var refresh_token: js.UndefOr[String] = js.native
}
object Refreshtoken {
  
  @scala.inline
  def apply(): Refreshtoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refreshtoken]
  }
  
  @scala.inline
  implicit class RefreshtokenMutableBuilder[Self <: Refreshtoken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
  }
}
