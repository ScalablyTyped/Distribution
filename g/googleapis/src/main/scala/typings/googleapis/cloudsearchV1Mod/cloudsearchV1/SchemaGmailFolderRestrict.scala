package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail Folder restricts (i.e. in Drafts/Sent/Chats/User Generated Labels).
  */
trait SchemaGmailFolderRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGmailFolderRestrict {
  
  @scala.inline
  def apply(): SchemaGmailFolderRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailFolderRestrict]
  }
  
  @scala.inline
  implicit class SchemaGmailFolderRestrictMutableBuilder[Self <: SchemaGmailFolderRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
