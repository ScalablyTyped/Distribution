package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail Attachment restricts (i.e. has:attachment, has:drive, filename:pdf).
  */
@js.native
trait SchemaGmailAttachmentRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGmailAttachmentRestrict {
  
  @scala.inline
  def apply(): SchemaGmailAttachmentRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailAttachmentRestrict]
  }
  
  @scala.inline
  implicit class SchemaGmailAttachmentRestrictMutableBuilder[Self <: SchemaGmailAttachmentRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
