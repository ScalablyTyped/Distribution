package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  allowHTTP1 :boolean}> */
trait ReadonlyallowHTTP1boolean extends StObject {
  
  val allowHTTP1: Boolean
}
object ReadonlyallowHTTP1boolean {
  
  inline def apply(allowHTTP1: Boolean): ReadonlyallowHTTP1boolean = {
    val __obj = js.Dynamic.literal(allowHTTP1 = allowHTTP1.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyallowHTTP1boolean]
  }
  
  extension [Self <: ReadonlyallowHTTP1boolean](x: Self) {
    
    inline def setAllowHTTP1(value: Boolean): Self = StObject.set(x, "allowHTTP1", value.asInstanceOf[js.Any])
  }
}
