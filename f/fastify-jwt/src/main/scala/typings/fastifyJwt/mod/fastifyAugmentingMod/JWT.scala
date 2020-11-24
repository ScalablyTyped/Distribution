package typings.fastifyJwt.mod.fastifyAugmentingMod

import typings.fastifyJwt.anon.Decode
import typings.fastifyJwt.mod.JWTTypes.DecodePayloadType
import typings.fastifyJwt.mod.JWTTypes.SignCallback
import typings.fastifyJwt.mod.JWTTypes.SignPayloadType
import typings.fastifyJwt.mod.JWTTypes.VerifyCallback
import typings.fastifyJwt.mod.JWTTypes.VerifyPayloadType
import typings.jsonwebtoken.mod.DecodeOptions
import typings.jsonwebtoken.mod.Secret
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWT extends js.Object {
  
  def decode[Decoded /* <: DecodePayloadType */](token: String): Null | Decoded = js.native
  def decode[Decoded /* <: DecodePayloadType */](token: String, options: DecodeOptions): Null | Decoded = js.native
  
  var options: Decode = js.native
  
  var secret: Secret = js.native
  
  def sign(payload: SignPayloadType): String = js.native
  def sign(payload: SignPayloadType, callback: SignCallback): Unit = js.native
  def sign(payload: SignPayloadType, options: SignOptions): String = js.native
  def sign(payload: SignPayloadType, options: SignOptions, callback: SignCallback): Unit = js.native
  
  def verify[Decoded /* <: VerifyPayloadType */](token: String): Decoded = js.native
  def verify[Decoded /* <: VerifyPayloadType */](token: String, callback: VerifyCallback[Decoded]): Unit = js.native
  def verify[Decoded /* <: VerifyPayloadType */](token: String, options: VerifyOptions): Decoded = js.native
  def verify[Decoded /* <: VerifyPayloadType */](token: String, options: VerifyOptions, callback: VerifyCallback[Decoded]): Unit = js.native
}
