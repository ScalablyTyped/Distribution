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
  
  inline def apply(): MemberSharedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSharedItems]
  }
  
  extension [Self <: MemberSharedItems](x: Self) {
    
    inline def setEnvelopes(value: js.Array[/* Information about the shared item. */ SharedItem]): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
    
    inline def setEnvelopesUndefined: Self = StObject.set(x, "envelopes", js.undefined)
    
    inline def setEnvelopesVarargs(value: (/* Information about the shared item. */ SharedItem)*): Self = StObject.set(x, "envelopes", js.Array(value :_*))
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setFolders(value: js.Array[FolderSharedItem]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: FolderSharedItem*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    inline def setTemplates(value: js.Array[/* Information about shared templates. */ TemplateSharedItem]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: (/* Information about shared templates. */ TemplateSharedItem)*): Self = StObject.set(x, "templates", js.Array(value :_*))
    
    inline def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
