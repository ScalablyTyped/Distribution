package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  mergerequestIId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait mergerequestIIdnumberunde
  extends /* key */ StringDictionary[js.Any] {
  
  var mergerequestIId: js.UndefOr[Double] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object mergerequestIIdnumberunde {
  
  @scala.inline
  def apply(): mergerequestIIdnumberunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mergerequestIIdnumberunde]
  }
  
  @scala.inline
  implicit class mergerequestIIdnumberundeOps[Self <: mergerequestIIdnumberunde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMergerequestIId(value: Double): Self = this.set("mergerequestIId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergerequestIId: Self = this.set("mergerequestIId", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
