package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a create operation. */
trait ICreateOptions extends StObject {
  
  /** Disables automatic generation of "id" field of the document to be created (if it is not provided) */
  var disableAutomaticIdGeneration: js.UndefOr[String] = js.undefined
  
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.undefined
}
object ICreateOptions {
  
  inline def apply(): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICreateOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableAutomaticIdGeneration(value: String): Self = StObject.set(x, "disableAutomaticIdGeneration", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomaticIdGenerationUndefined: Self = StObject.set(x, "disableAutomaticIdGeneration", js.undefined)
    
    inline def setIndexAction(value: String): Self = StObject.set(x, "indexAction", value.asInstanceOf[js.Any])
    
    inline def setIndexActionUndefined: Self = StObject.set(x, "indexAction", js.undefined)
  }
}
