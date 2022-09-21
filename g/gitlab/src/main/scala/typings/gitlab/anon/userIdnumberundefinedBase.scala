package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  userId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait userIdnumberundefinedBase
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var sudo: js.UndefOr[String | Double] = js.undefined
  
  var userId: js.UndefOr[Double] = js.undefined
}
object userIdnumberundefinedBase {
  
  inline def apply(): userIdnumberundefinedBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[userIdnumberundefinedBase]
  }
  
  extension [Self <: userIdnumberundefinedBase](x: Self) {
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
