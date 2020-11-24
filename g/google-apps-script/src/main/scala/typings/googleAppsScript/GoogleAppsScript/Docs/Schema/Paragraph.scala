package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paragraph extends js.Object {
  
  var bullet: js.UndefOr[Bullet] = js.native
  
  var elements: js.UndefOr[js.Array[ParagraphElement]] = js.native
  
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.native
  
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.native
  
  var suggestedBulletChanges: js.UndefOr[js.Object] = js.native
  
  var suggestedParagraphStyleChanges: js.UndefOr[js.Object] = js.native
  
  var suggestedPositionedObjectIds: js.UndefOr[js.Object] = js.native
}
object Paragraph {
  
  @scala.inline
  def apply(): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit class ParagraphOps[Self <: Paragraph] (val x: Self) extends AnyVal {
    
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
    def setBullet(value: Bullet): Self = this.set("bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: ParagraphElement*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[ParagraphElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setParagraphStyle(value: ParagraphStyle): Self = this.set("paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphStyle: Self = this.set("paragraphStyle", js.undefined)
    
    @scala.inline
    def setPositionedObjectIdsVarargs(value: String*): Self = this.set("positionedObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setPositionedObjectIds(value: js.Array[String]): Self = this.set("positionedObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjectIds: Self = this.set("positionedObjectIds", js.undefined)
    
    @scala.inline
    def setSuggestedBulletChanges(value: js.Object): Self = this.set("suggestedBulletChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedBulletChanges: Self = this.set("suggestedBulletChanges", js.undefined)
    
    @scala.inline
    def setSuggestedParagraphStyleChanges(value: js.Object): Self = this.set("suggestedParagraphStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedParagraphStyleChanges: Self = this.set("suggestedParagraphStyleChanges", js.undefined)
    
    @scala.inline
    def setSuggestedPositionedObjectIds(value: js.Object): Self = this.set("suggestedPositionedObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedPositionedObjectIds: Self = this.set("suggestedPositionedObjectIds", js.undefined)
  }
}
