package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A classification of the Folder Operation error.
  */
trait SchemaFolderOperationError extends StObject {
  
  /**
    * The type of operation error experienced.
    */
  var errorMessageId: js.UndefOr[String] = js.undefined
}
object SchemaFolderOperationError {
  
  inline def apply(): SchemaFolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderOperationError]
  }
  
  extension [Self <: SchemaFolderOperationError](x: Self) {
    
    inline def setErrorMessageId(value: String): Self = StObject.set(x, "errorMessageId", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageIdUndefined: Self = StObject.set(x, "errorMessageId", js.undefined)
  }
}
