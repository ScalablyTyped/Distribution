package typings.fastify.mod

import typings.fastify.fastifyBooleans.`true`
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.node.http2Mod.Http2Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastifyHttp2Options[Server /* <: Http2Server */, Logger /* <: FastifyBaseLogger */]
  extends StObject
     with FastifyServerOptions[Server, Logger] {
  
  var http2: `true`
  
  var http2SessionTimeout: js.UndefOr[Double] = js.undefined
}
object FastifyHttp2Options {
  
  inline def apply[Server /* <: Http2Server */, Logger /* <: FastifyBaseLogger */](): FastifyHttp2Options[Server, Logger] = {
    val __obj = js.Dynamic.literal(http2 = true)
    __obj.asInstanceOf[FastifyHttp2Options[Server, Logger]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastifyHttp2Options[?, ?], Server /* <: Http2Server */, Logger /* <: FastifyBaseLogger */] (val x: Self & (FastifyHttp2Options[Server, Logger])) extends AnyVal {
    
    inline def setHttp2(value: `true`): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeout(value: Double): Self = StObject.set(x, "http2SessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeoutUndefined: Self = StObject.set(x, "http2SessionTimeout", js.undefined)
  }
}
