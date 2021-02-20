package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This contains item&#39;s status and any errors.
  */
@js.native
trait SchemaItemStatus extends StObject {
  
  /**
    * Status code.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Error details in case the item is in ERROR state.
    */
  var processingErrors: js.UndefOr[js.Array[SchemaProcessingError]] = js.native
  
  /**
    * Repository error reported by connector.
    */
  var repositoryErrors: js.UndefOr[js.Array[SchemaRepositoryError]] = js.native
}
object SchemaItemStatus {
  
  @scala.inline
  def apply(): SchemaItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStatus]
  }
  
  @scala.inline
  implicit class SchemaItemStatusMutableBuilder[Self <: SchemaItemStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setProcessingErrors(value: js.Array[SchemaProcessingError]): Self = StObject.set(x, "processingErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingErrorsUndefined: Self = StObject.set(x, "processingErrors", js.undefined)
    
    @scala.inline
    def setProcessingErrorsVarargs(value: SchemaProcessingError*): Self = StObject.set(x, "processingErrors", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryErrors(value: js.Array[SchemaRepositoryError]): Self = StObject.set(x, "repositoryErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryErrorsUndefined: Self = StObject.set(x, "repositoryErrors", js.undefined)
    
    @scala.inline
    def setRepositoryErrorsVarargs(value: SchemaRepositoryError*): Self = StObject.set(x, "repositoryErrors", js.Array(value :_*))
  }
}
