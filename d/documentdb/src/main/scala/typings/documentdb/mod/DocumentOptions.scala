package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOptions
  extends StObject
     with RequestOptions {
  
  /** Disables the automatic id generation. If id is missing in the body and this option is true, an error will be returned. */
  var disableAutomaticIdGeneration: js.UndefOr[Boolean] = js.undefined
}
object DocumentOptions {
  
  inline def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableAutomaticIdGeneration(value: Boolean): Self = StObject.set(x, "disableAutomaticIdGeneration", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomaticIdGenerationUndefined: Self = StObject.set(x, "disableAutomaticIdGeneration", js.undefined)
  }
}
