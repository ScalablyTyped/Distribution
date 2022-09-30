package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IListValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KeyRange. */
trait IKeyRange extends StObject {
  
  /** KeyRange endClosed */
  var endClosed: js.UndefOr[IListValue | Null] = js.undefined
  
  /** KeyRange endOpen */
  var endOpen: js.UndefOr[IListValue | Null] = js.undefined
  
  /** KeyRange startClosed */
  var startClosed: js.UndefOr[IListValue | Null] = js.undefined
  
  /** KeyRange startOpen */
  var startOpen: js.UndefOr[IListValue | Null] = js.undefined
}
object IKeyRange {
  
  inline def apply(): IKeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyRange]
  }
  
  extension [Self <: IKeyRange](x: Self) {
    
    inline def setEndClosed(value: IListValue): Self = StObject.set(x, "endClosed", value.asInstanceOf[js.Any])
    
    inline def setEndClosedNull: Self = StObject.set(x, "endClosed", null)
    
    inline def setEndClosedUndefined: Self = StObject.set(x, "endClosed", js.undefined)
    
    inline def setEndOpen(value: IListValue): Self = StObject.set(x, "endOpen", value.asInstanceOf[js.Any])
    
    inline def setEndOpenNull: Self = StObject.set(x, "endOpen", null)
    
    inline def setEndOpenUndefined: Self = StObject.set(x, "endOpen", js.undefined)
    
    inline def setStartClosed(value: IListValue): Self = StObject.set(x, "startClosed", value.asInstanceOf[js.Any])
    
    inline def setStartClosedNull: Self = StObject.set(x, "startClosed", null)
    
    inline def setStartClosedUndefined: Self = StObject.set(x, "startClosed", js.undefined)
    
    inline def setStartOpen(value: IListValue): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    inline def setStartOpenNull: Self = StObject.set(x, "startOpen", null)
    
    inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
  }
}
