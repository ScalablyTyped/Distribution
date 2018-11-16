package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyFunction extends js.Object {
  def apply(token: java.lang.String): js.Object | java.lang.String = js.native
  def apply(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions): js.Object | java.lang.String = js.native
  def apply(
    token: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
}

