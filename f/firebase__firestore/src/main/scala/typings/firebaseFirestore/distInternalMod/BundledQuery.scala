package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BundledQuery. */
trait BundledQuery extends StObject {
  
  /** BundledQuery limitType */
  var limitType: js.UndefOr[LimitType2 | Null] = js.undefined
  
  /** BundledQuery parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** BundledQuery structuredQuery */
  var structuredQuery: js.UndefOr[StructuredQuery | Null] = js.undefined
}
object BundledQuery {
  
  inline def apply(): BundledQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundledQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundledQuery] (val x: Self) extends AnyVal {
    
    inline def setLimitType(value: LimitType2): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    inline def setLimitTypeNull: Self = StObject.set(x, "limitType", null)
    
    inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryNull: Self = StObject.set(x, "structuredQuery", null)
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
  }
}
