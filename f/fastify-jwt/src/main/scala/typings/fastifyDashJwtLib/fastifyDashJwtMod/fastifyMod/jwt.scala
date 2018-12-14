package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jwt extends js.Object {
  var secret: jsonwebtokenLib.jsonwebtokenMod.Secret = js.native
  @JSName("sign")
  var sign_Original: SignFunction = js.native
  @JSName("verify")
  var verify_Original: VerifyFunction = js.native
  def decode(token: java.lang.String): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def decode(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.DecodeOptions): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def sign(payload: java.lang.String): java.lang.String = js.native
  def sign(payload: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def sign(
    payload: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(payload: js.Object): java.lang.String = js.native
  def sign(payload: js.Object, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def sign(
    payload: js.Object,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def sign(payload: nodeLib.Buffer): java.lang.String = js.native
  def sign(payload: nodeLib.Buffer, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def sign(
    payload: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  @JSName("sign")
  def sign_Unit(payload: java.lang.String): scala.Unit = js.native
  @JSName("sign")
  def sign_Unit(payload: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): scala.Unit = js.native
  @JSName("sign")
  def sign_Unit(payload: js.Object): scala.Unit = js.native
  @JSName("sign")
  def sign_Unit(payload: js.Object, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): scala.Unit = js.native
  @JSName("sign")
  def sign_Unit(payload: nodeLib.Buffer): scala.Unit = js.native
  @JSName("sign")
  def sign_Unit(payload: nodeLib.Buffer, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): scala.Unit = js.native
  def verify(token: java.lang.String): js.Object | java.lang.String = js.native
  def verify(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions): js.Object | java.lang.String = js.native
  def verify(
    token: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String): scala.Unit = js.native
  @JSName("verify")
  def verify_Unit(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions): scala.Unit = js.native
}

