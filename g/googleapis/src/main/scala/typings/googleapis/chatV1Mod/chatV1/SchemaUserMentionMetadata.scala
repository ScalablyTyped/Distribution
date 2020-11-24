package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation metadata for user mentions (@).
  */
@js.native
trait SchemaUserMentionMetadata extends js.Object {
  
  /**
    * The type of user mention.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The user mentioned.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}
object SchemaUserMentionMetadata {
  
  @scala.inline
  def apply(): SchemaUserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMentionMetadata]
  }
  
  @scala.inline
  implicit class SchemaUserMentionMetadataOps[Self <: SchemaUserMentionMetadata] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
