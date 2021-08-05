package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refreshtoken extends StObject {
  
  var refresh_token: js.UndefOr[String] = js.undefined
}
object Refreshtoken {
  
  inline def apply(): Refreshtoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refreshtoken]
  }
  
  extension [Self <: Refreshtoken](x: Self) {
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
  }
}
