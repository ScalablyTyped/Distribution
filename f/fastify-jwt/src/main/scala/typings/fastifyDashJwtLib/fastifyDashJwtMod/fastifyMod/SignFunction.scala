package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignFunction extends js.Object {
  def apply(payload: java.lang.String): java.lang.String = js.native
  def apply(payload: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def apply(
    payload: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def apply(payload: js.Object): java.lang.String = js.native
  def apply(payload: js.Object, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def apply(
    payload: js.Object,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def apply(payload: nodeLib.Buffer): java.lang.String = js.native
  def apply(payload: nodeLib.Buffer, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def apply(
    payload: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
}

