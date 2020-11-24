package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaComment extends js.Object {
  
  /**
    * A comment from a developer.
    */
  var developerComment: js.UndefOr[SchemaDeveloperComment] = js.native
  
  /**
    * A comment from a user.
    */
  var userComment: js.UndefOr[SchemaUserComment] = js.native
}
object SchemaComment {
  
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentOps[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
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
    def setDeveloperComment(value: SchemaDeveloperComment): Self = this.set("developerComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperComment: Self = this.set("developerComment", js.undefined)
    
    @scala.inline
    def setUserComment(value: SchemaUserComment): Self = this.set("userComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserComment: Self = this.set("userComment", js.undefined)
  }
}
