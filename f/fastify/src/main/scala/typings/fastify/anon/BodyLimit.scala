package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyLimit extends StObject {
  
  var bodyLimit: js.UndefOr[Double] = js.undefined
}
object BodyLimit {
  
  inline def apply(): BodyLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyLimit]
  }
  
  extension [Self <: BodyLimit](x: Self) {
    
    inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
    
    inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
  }
}
