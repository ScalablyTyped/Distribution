package typings.googleCloudSpanner.protosMod.google.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CustomHttpPattern. */
trait ICustomHttpPattern extends StObject {
  
  /** CustomHttpPattern kind */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /** CustomHttpPattern path */
  var path: js.UndefOr[String | Null] = js.undefined
}
object ICustomHttpPattern {
  
  inline def apply(): ICustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomHttpPattern]
  }
  
  extension [Self <: ICustomHttpPattern](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
