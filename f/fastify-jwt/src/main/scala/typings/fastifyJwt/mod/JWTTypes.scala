package typings.fastifyJwt.mod

import typings.jsonwebtoken.mod.VerifyErrors
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify-jwt", "JWTTypes")
@js.native
object JWTTypes extends js.Object {
  
  @js.native
  trait VerifyCallback[Decoded /* <: VerifyPayloadType */]
    extends typings.jsonwebtoken.mod.VerifyCallback {
    
    def apply(err: VerifyErrors, decoded: Decoded): Unit = js.native
  }
  
  type DecodePayloadType = js.Object | String
  
  type SignCallback = typings.jsonwebtoken.mod.SignCallback
  
  type SignPayloadType = js.Object | String | Buffer
  
  type VerifyPayloadType = js.Object | String
}
