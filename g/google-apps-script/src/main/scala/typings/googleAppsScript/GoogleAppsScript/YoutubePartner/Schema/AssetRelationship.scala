package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetRelationship extends js.Object {
  
  var childAssetId: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var parentAssetId: js.UndefOr[String] = js.native
}
object AssetRelationship {
  
  @scala.inline
  def apply(): AssetRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetRelationship]
  }
  
  @scala.inline
  implicit class AssetRelationshipOps[Self <: AssetRelationship] (val x: Self) extends AnyVal {
    
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
    def setChildAssetId(value: String): Self = this.set("childAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildAssetId: Self = this.set("childAssetId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setParentAssetId(value: String): Self = this.set("parentAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentAssetId: Self = this.set("parentAssetId", js.undefined)
  }
}
