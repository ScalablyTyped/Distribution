package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a replace operation. */
trait IReplaceOptions extends StObject {
  
  /**
    * The entity tag associated with the resource.
    * This is matched with the persisted resource before deletion.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.undefined
}
object IReplaceOptions {
  
  inline def apply(): IReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReplaceOptions]
  }
  
  extension [Self <: IReplaceOptions](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIndexAction(value: String): Self = StObject.set(x, "indexAction", value.asInstanceOf[js.Any])
    
    inline def setIndexActionUndefined: Self = StObject.set(x, "indexAction", js.undefined)
  }
}
