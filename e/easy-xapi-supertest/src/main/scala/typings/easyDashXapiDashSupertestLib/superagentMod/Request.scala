package typings
package easyDashXapiDashSupertestLib.superagentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request[Req /* <: Request[_] */] extends js.Object {
  def abort(): scala.Unit = js.native
  def accept(`type`: java.lang.String): Req = js.native
  def attach(field: java.lang.String, file: java.lang.String): Req = js.native
  def attach(field: java.lang.String, file: java.lang.String, filename: java.lang.String): Req = js.native
  def auth(user: java.lang.String, name: java.lang.String): Req = js.native
  def buffer(`val`: scala.Boolean): Req = js.native
  def clearTimeout(): Req = js.native
  def end(): Req = js.native
  def end(callback: CallbackHandler): Req = js.native
  def field(name: java.lang.String, `val`: java.lang.String): Req = js.native
  def get(field: java.lang.String): java.lang.String = js.native
  def on(name: java.lang.String, handler: js.Function): Req = js.native
  @JSName("on")
  def on_error(
    name: easyDashXapiDashSupertestLib.easyDashXapiDashSupertestLibStrings.error,
    handler: js.Function1[/* err */ js.Any, scala.Unit]
  ): Req = js.native
  def part(): Req = js.native
  def pipe(stream: easyDashXapiDashSupertestLib.NodeJSNs.WritableStream): easyDashXapiDashSupertestLib.streamMod.Writable = js.native
  def pipe(stream: easyDashXapiDashSupertestLib.NodeJSNs.WritableStream, options: js.Object): easyDashXapiDashSupertestLib.streamMod.Writable = js.native
  def query(`val`: js.Object): Req = js.native
  def redirects(n: scala.Double): Req = js.native
  def send(data: java.lang.String): Req = js.native
  def send(data: js.Object): Req = js.native
  def set(field: java.lang.String, `val`: java.lang.String): Req = js.native
  def set(field: js.Object): Req = js.native
  def timeout(ms: scala.Double): Req = js.native
  def `type`(`val`: java.lang.String): Req = js.native
  def withCredentials(): Req = js.native
  def write(data: easyDashXapiDashSupertestLib.Buffer): Req = js.native
  def write(data: easyDashXapiDashSupertestLib.Buffer, encoding: java.lang.String): Req = js.native
  def write(data: java.lang.String): Req = js.native
  def write(data: java.lang.String, encoding: java.lang.String): Req = js.native
}

