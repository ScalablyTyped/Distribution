package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  userId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait userIdnumberundefinedBase
  extends /* key */ StringDictionary[js.Any] {
  
  var sudo: js.UndefOr[String | Double] = js.native
  
  var userId: js.UndefOr[Double] = js.native
}
object userIdnumberundefinedBase {
  
  @scala.inline
  def apply(): userIdnumberundefinedBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[userIdnumberundefinedBase]
  }
  
  @scala.inline
  implicit class userIdnumberundefinedBaseMutableBuilder[Self <: userIdnumberundefinedBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    
    @scala.inline
    def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
