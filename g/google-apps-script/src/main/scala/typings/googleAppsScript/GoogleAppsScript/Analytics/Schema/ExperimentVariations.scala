package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentVariations extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var weight: js.UndefOr[Double] = js.native
  
  var won: js.UndefOr[Boolean] = js.native
}
object ExperimentVariations {
  
  @scala.inline
  def apply(): ExperimentVariations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentVariations]
  }
  
  @scala.inline
  implicit class ExperimentVariationsOps[Self <: ExperimentVariations] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWon(value: Boolean): Self = this.set("won", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWon: Self = this.set("won", js.undefined)
  }
}
