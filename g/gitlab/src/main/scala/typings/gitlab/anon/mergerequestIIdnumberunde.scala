package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  mergerequestIId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait mergerequestIIdnumberunde
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var mergerequestIId: js.UndefOr[Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object mergerequestIIdnumberunde {
  
  @scala.inline
  def apply(): mergerequestIIdnumberunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mergerequestIIdnumberunde]
  }
  
  @scala.inline
  implicit class mergerequestIIdnumberundeMutableBuilder[Self <: mergerequestIIdnumberunde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergerequestIId(value: Double): Self = StObject.set(x, "mergerequestIId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergerequestIIdUndefined: Self = StObject.set(x, "mergerequestIId", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
