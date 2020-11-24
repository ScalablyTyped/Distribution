package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementStrategiesListResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var placementStrategies: js.UndefOr[js.Array[PlacementStrategy]] = js.native
}
object PlacementStrategiesListResponse {
  
  @scala.inline
  def apply(): PlacementStrategiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementStrategiesListResponse]
  }
  
  @scala.inline
  implicit class PlacementStrategiesListResponseOps[Self <: PlacementStrategiesListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPlacementStrategiesVarargs(value: PlacementStrategy*): Self = this.set("placementStrategies", js.Array(value :_*))
    
    @scala.inline
    def setPlacementStrategies(value: js.Array[PlacementStrategy]): Self = this.set("placementStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategies: Self = this.set("placementStrategies", js.undefined)
  }
}
