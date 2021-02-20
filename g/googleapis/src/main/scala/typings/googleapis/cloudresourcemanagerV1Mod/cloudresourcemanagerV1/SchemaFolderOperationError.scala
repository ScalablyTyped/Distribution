package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A classification of the Folder Operation error.
  */
@js.native
trait SchemaFolderOperationError extends StObject {
  
  /**
    * The type of operation error experienced.
    */
  var errorMessageId: js.UndefOr[String] = js.native
}
object SchemaFolderOperationError {
  
  @scala.inline
  def apply(): SchemaFolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderOperationError]
  }
  
  @scala.inline
  implicit class SchemaFolderOperationErrorMutableBuilder[Self <: SchemaFolderOperationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessageId(value: String): Self = StObject.set(x, "errorMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageIdUndefined: Self = StObject.set(x, "errorMessageId", js.undefined)
  }
}
