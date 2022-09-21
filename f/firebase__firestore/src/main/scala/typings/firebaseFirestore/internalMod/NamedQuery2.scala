package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a NamedQuery. */
trait NamedQuery2 extends StObject {
  
  /** NamedQuery bundledQuery */
  var bundledQuery: js.UndefOr[BundledQuery | Null] = js.undefined
  
  /** NamedQuery name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** NamedQuery readTime */
  var readTime: js.UndefOr[Timestamp2 | Null] = js.undefined
}
object NamedQuery2 {
  
  inline def apply(): NamedQuery2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedQuery2]
  }
  
  extension [Self <: NamedQuery2](x: Self) {
    
    inline def setBundledQuery(value: BundledQuery): Self = StObject.set(x, "bundledQuery", value.asInstanceOf[js.Any])
    
    inline def setBundledQueryNull: Self = StObject.set(x, "bundledQuery", null)
    
    inline def setBundledQueryUndefined: Self = StObject.set(x, "bundledQuery", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadTime(value: Timestamp2): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
