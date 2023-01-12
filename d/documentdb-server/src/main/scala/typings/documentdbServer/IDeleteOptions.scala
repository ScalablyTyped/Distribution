package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a delete operation. */
trait IDeleteOptions extends StObject {
  
  /**
    * The entity tag associated with the resource.
    * This is matched with the persisted resource before deletion.
    */
  var etag: js.UndefOr[String] = js.undefined
}
object IDeleteOptions {
  
  inline def apply(): IDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDeleteOptions] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
