package typings
package fastifyDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decode extends js.Object {
  /**
    * decodeOptions
    */
  var decode: jsonwebtokenLib.jsonwebtokenMod.DecodeOptions
  /**
    * signOptions
    */
  var sign: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  /**
    * verifyOptions
    */
  var verify: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
}

object Anon_Decode {
  @scala.inline
  def apply(
    decode: jsonwebtokenLib.jsonwebtokenMod.DecodeOptions,
    sign: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    verify: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): Anon_Decode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("sign")(sign)
    __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[Anon_Decode]
  }
}

