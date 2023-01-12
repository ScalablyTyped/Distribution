package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  mergerequestIId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait mergerequestIIdnumberunde
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var mergerequestIId: js.UndefOr[Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object mergerequestIIdnumberunde {
  
  inline def apply(): mergerequestIIdnumberunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mergerequestIIdnumberunde]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: mergerequestIIdnumberunde] (val x: Self) extends AnyVal {
    
    inline def setMergerequestIId(value: Double): Self = StObject.set(x, "mergerequestIId", value.asInstanceOf[js.Any])
    
    inline def setMergerequestIIdUndefined: Self = StObject.set(x, "mergerequestIId", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
