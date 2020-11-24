package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsGenerateTagsResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.native
}
object PlacementsGenerateTagsResponse {
  
  @scala.inline
  def apply(): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
  
  @scala.inline
  implicit class PlacementsGenerateTagsResponseOps[Self <: PlacementsGenerateTagsResponse] (val x: Self) extends AnyVal {
    
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
    def setPlacementTagsVarargs(value: PlacementTag*): Self = this.set("placementTags", js.Array(value :_*))
    
    @scala.inline
    def setPlacementTags(value: js.Array[PlacementTag]): Self = this.set("placementTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementTags: Self = this.set("placementTags", js.undefined)
  }
}
