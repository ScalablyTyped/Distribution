package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IListValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KeySet. */
trait IKeySet extends StObject {
  
  /** KeySet all */
  var all: js.UndefOr[Boolean | Null] = js.undefined
  
  /** KeySet keys */
  var keys: js.UndefOr[js.Array[IListValue] | Null] = js.undefined
  
  /** KeySet ranges */
  var ranges: js.UndefOr[js.Array[IKeyRange] | Null] = js.undefined
}
object IKeySet {
  
  inline def apply(): IKeySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeySet]
  }
  
  extension [Self <: IKeySet](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllNull: Self = StObject.set(x, "all", null)
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setKeys(value: js.Array[IListValue]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: IListValue*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setRanges(value: js.Array[IKeyRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesNull: Self = StObject.set(x, "ranges", null)
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: IKeyRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
