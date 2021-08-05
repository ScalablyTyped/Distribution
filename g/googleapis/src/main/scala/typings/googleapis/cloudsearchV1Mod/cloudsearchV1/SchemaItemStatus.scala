package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This contains item&#39;s status and any errors.
  */
trait SchemaItemStatus extends StObject {
  
  /**
    * Status code.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Error details in case the item is in ERROR state.
    */
  var processingErrors: js.UndefOr[js.Array[SchemaProcessingError]] = js.undefined
  
  /**
    * Repository error reported by connector.
    */
  var repositoryErrors: js.UndefOr[js.Array[SchemaRepositoryError]] = js.undefined
}
object SchemaItemStatus {
  
  inline def apply(): SchemaItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStatus]
  }
  
  extension [Self <: SchemaItemStatus](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setProcessingErrors(value: js.Array[SchemaProcessingError]): Self = StObject.set(x, "processingErrors", value.asInstanceOf[js.Any])
    
    inline def setProcessingErrorsUndefined: Self = StObject.set(x, "processingErrors", js.undefined)
    
    inline def setProcessingErrorsVarargs(value: SchemaProcessingError*): Self = StObject.set(x, "processingErrors", js.Array(value :_*))
    
    inline def setRepositoryErrors(value: js.Array[SchemaRepositoryError]): Self = StObject.set(x, "repositoryErrors", value.asInstanceOf[js.Any])
    
    inline def setRepositoryErrorsUndefined: Self = StObject.set(x, "repositoryErrors", js.undefined)
    
    inline def setRepositoryErrorsVarargs(value: SchemaRepositoryError*): Self = StObject.set(x, "repositoryErrors", js.Array(value :_*))
  }
}
