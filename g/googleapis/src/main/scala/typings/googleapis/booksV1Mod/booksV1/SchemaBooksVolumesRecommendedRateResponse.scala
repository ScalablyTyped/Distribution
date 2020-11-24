package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBooksVolumesRecommendedRateResponse extends js.Object {
  
  var consistency_token: js.UndefOr[String] = js.native
}
object SchemaBooksVolumesRecommendedRateResponse {
  
  @scala.inline
  def apply(): SchemaBooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooksVolumesRecommendedRateResponse]
  }
  
  @scala.inline
  implicit class SchemaBooksVolumesRecommendedRateResponseOps[Self <: SchemaBooksVolumesRecommendedRateResponse] (val x: Self) extends AnyVal {
    
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
    def setConsistency_token(value: String): Self = this.set("consistency_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistency_token: Self = this.set("consistency_token", js.undefined)
  }
}
