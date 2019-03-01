package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jwt extends js.Object {
  var options: fastifyDashJwtLib.Anon_Decode = js.native
  var secret: jsonwebtokenLib.jsonwebtokenMod.Secret = js.native
  def decode(token: java.lang.String): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def decode(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.DecodeOptions): scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def sign(playload: java.lang.String): java.lang.String = js.native
  def sign(playload: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def sign(
    playload: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): java.lang.String = js.native
  def sign(playload: js.Object): java.lang.String = js.native
  def sign(playload: js.Object, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def sign(
    playload: js.Object,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): java.lang.String = js.native
  def sign(playload: nodeLib.Buffer): java.lang.String = js.native
  def sign(playload: nodeLib.Buffer, options: jsonwebtokenLib.jsonwebtokenMod.SignOptions): java.lang.String = js.native
  def sign(
    playload: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): java.lang.String = js.native
  def verify(token: java.lang.String): js.Promise[js.Object | java.lang.String] = js.native
  def verify(token: java.lang.String, options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions): js.Promise[js.Object | java.lang.String] = js.native
  def verify(
    token: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): js.Promise[js.Object | java.lang.String] = js.native
}

