package typings.fastifyJwt.mod.fastifyAugmentingMod

import typings.fastifyJwt.mod.JWTTypes.SignCallback
import typings.fastifyJwt.mod.JWTTypes.SignPayloadType
import typings.jsonwebtoken.mod.SignOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyReply extends js.Object {
  
  def jwtSign(payload: SignPayloadType): js.Promise[String] = js.native
  def jwtSign(payload: SignPayloadType, callback: SignCallback): Unit = js.native
  def jwtSign(payload: SignPayloadType, options: SignOptions): js.Promise[String] = js.native
  def jwtSign(payload: SignPayloadType, options: SignOptions, callback: SignCallback): Unit = js.native
}
