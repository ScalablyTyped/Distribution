package typings
package easyDashXapiDashSupertestLib.supertestMod.supertestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test
  extends easyDashXapiDashSupertestLib.superagentMod.requestNs.Request[Test] {
  var url: java.lang.String = js.native
  def expect(body: java.lang.String): Test = js.native
  def expect(body: java.lang.String, callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler): Test = js.native
  def expect(body: js.Object): Test = js.native
  def expect(body: js.Object, callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler): Test = js.native
  def expect(body: stdLib.RegExp): Test = js.native
  def expect(body: stdLib.RegExp, callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler): Test = js.native
  def expect(checker: js.Function1[/* res */ Response, _]): Test = js.native
  def expect(field: java.lang.String, `val`: java.lang.String): Test = js.native
  def expect(
    field: java.lang.String,
    `val`: java.lang.String,
    callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler
  ): Test = js.native
  def expect(field: java.lang.String, `val`: stdLib.RegExp): Test = js.native
  def expect(
    field: java.lang.String,
    `val`: stdLib.RegExp,
    callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler
  ): Test = js.native
  def expect(status: scala.Double): Test = js.native
  def expect(status: scala.Double, body: java.lang.String): Test = js.native
  def expect(
    status: scala.Double,
    body: java.lang.String,
    callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler
  ): Test = js.native
  def expect(status: scala.Double, callback: easyDashXapiDashSupertestLib.supertestMod.CallbackHandler): Test = js.native
  def serverAddress(app: js.Any, path: java.lang.String): java.lang.String = js.native
}

