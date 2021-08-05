package typings.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewDocument
  extends StObject
     with UniqueId
     with /** Custom properties */
/* key */ StringDictionary[js.Any] {
  
  /** The time to live in seconds of the document. */
  var ttl: js.UndefOr[Double] = js.undefined
}
object NewDocument {
  
  inline def apply(id: String): NewDocument = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDocument]
  }
  
  extension [Self <: NewDocument](x: Self) {
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
