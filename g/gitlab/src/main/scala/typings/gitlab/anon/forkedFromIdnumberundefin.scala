package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  forkedFromId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait forkedFromIdnumberundefin
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var forkedFromId: js.UndefOr[Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object forkedFromIdnumberundefin {
  
  inline def apply(): forkedFromIdnumberundefin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[forkedFromIdnumberundefin]
  }
  
  extension [Self <: forkedFromIdnumberundefin](x: Self) {
    
    inline def setForkedFromId(value: Double): Self = StObject.set(x, "forkedFromId", value.asInstanceOf[js.Any])
    
    inline def setForkedFromIdUndefined: Self = StObject.set(x, "forkedFromId", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
