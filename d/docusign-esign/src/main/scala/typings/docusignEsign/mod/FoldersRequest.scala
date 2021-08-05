package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldersRequest extends StObject {
  
  /**
    * A comma-separated list of envelope IDs.
    */
  var envelopeIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.undefined
  
  /**
    *  The id of the folder that the envelope is being moved from.
    */
  var fromFolderId: js.UndefOr[String] = js.undefined
}
object FoldersRequest {
  
  inline def apply(): FoldersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldersRequest]
  }
  
  extension [Self <: FoldersRequest](x: Self) {
    
    inline def setEnvelopeIds(value: js.Array[String]): Self = StObject.set(x, "envelopeIds", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdsUndefined: Self = StObject.set(x, "envelopeIds", js.undefined)
    
    inline def setEnvelopeIdsVarargs(value: String*): Self = StObject.set(x, "envelopeIds", js.Array(value :_*))
    
    inline def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    inline def setFromFolderId(value: String): Self = StObject.set(x, "fromFolderId", value.asInstanceOf[js.Any])
    
    inline def setFromFolderIdUndefined: Self = StObject.set(x, "fromFolderId", js.undefined)
  }
}
