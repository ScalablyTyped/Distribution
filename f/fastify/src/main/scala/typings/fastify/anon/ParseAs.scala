package typings.fastify.anon

import typings.fastify.fastifyStrings.buffer
import typings.fastify.fastifyStrings.string
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseAs[parseAs /* <: String | Buffer */] extends StObject {
  
  var bodyLimit: js.UndefOr[Double] = js.undefined
  
  var parseAs: string | buffer
}
object ParseAs {
  
  inline def apply[parseAs /* <: String | Buffer */](parseAs: string | buffer): ParseAs[parseAs] = {
    val __obj = js.Dynamic.literal(parseAs = parseAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseAs[parseAs]]
  }
  
  extension [Self <: ParseAs[?], parseAs /* <: String | Buffer */](x: Self & ParseAs[parseAs]) {
    
    inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
    
    inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
    
    inline def setParseAs(value: string | buffer): Self = StObject.set(x, "parseAs", value.asInstanceOf[js.Any])
  }
}
