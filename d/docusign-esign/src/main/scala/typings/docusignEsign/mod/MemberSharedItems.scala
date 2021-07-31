package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberSharedItems extends StObject {
  
  /**
    * List of information about shared envelopes.
    */
  var envelopes: js.UndefOr[js.Array[/* Information about the shared item. */ SharedItem]] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * List of information about shared folders.
    */
  var folders: js.UndefOr[js.Array[FolderSharedItem]] = js.undefined
  
  /**
    * List of information about shared templates.
    */
  var templates: js.UndefOr[js.Array[/* Information about shared templates. */ TemplateSharedItem]] = js.undefined
  
  /**
    * Information about the user requesting sharing information.
    */
  var user: js.UndefOr[UserInfo] = js.undefined
}
object MemberSharedItems {
  
  @scala.inline
  def apply(): MemberSharedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSharedItems]
  }
  
  @scala.inline
  implicit class MemberSharedItemsMutableBuilder[Self <: MemberSharedItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopes(value: js.Array[/* Information about the shared item. */ SharedItem]): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopesUndefined: Self = StObject.set(x, "envelopes", js.undefined)
    
    @scala.inline
    def setEnvelopesVarargs(value: (/* Information about the shared item. */ SharedItem)*): Self = StObject.set(x, "envelopes", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFolders(value: js.Array[FolderSharedItem]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: FolderSharedItem*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setTemplates(value: js.Array[/* Information about shared templates. */ TemplateSharedItem]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: (/* Information about shared templates. */ TemplateSharedItem)*): Self = StObject.set(x, "templates", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
