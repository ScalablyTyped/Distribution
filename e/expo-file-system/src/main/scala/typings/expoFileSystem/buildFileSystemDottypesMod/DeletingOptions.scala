package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletingOptions extends StObject {
  
  /**
    * If `true`, don't throw an error if there is no file or directory at this URI.
    * @default false
    */
  var idempotent: js.UndefOr[Boolean] = js.undefined
}
object DeletingOptions {
  
  inline def apply(): DeletingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletingOptions] (val x: Self) extends AnyVal {
    
    inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
    
    inline def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
  }
}
