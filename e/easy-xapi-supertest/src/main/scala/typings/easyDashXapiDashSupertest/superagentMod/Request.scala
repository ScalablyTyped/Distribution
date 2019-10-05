package typings.easyDashXapiDashSupertest.superagentMod

import typings.easyDashXapiDashSupertest.Buffer
import typings.easyDashXapiDashSupertest.NodeJS.WritableStream
import typings.easyDashXapiDashSupertest.easyDashXapiDashSupertestStrings.error
import typings.easyDashXapiDashSupertest.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request[Req /* <: Request[_] */] extends js.Object {
  def abort(): Unit = js.native
  def accept(`type`: String): Req = js.native
  def attach(field: String, file: String): Req = js.native
  def attach(field: String, file: String, filename: String): Req = js.native
  def auth(user: String, name: String): Req = js.native
  def buffer(`val`: Boolean): Req = js.native
  def clearTimeout(): Req = js.native
  def end(): Req = js.native
  def end(callback: CallbackHandler): Req = js.native
  def field(name: String, `val`: String): Req = js.native
  def get(field: String): String = js.native
  def on(name: String, handler: js.Function): Req = js.native
  @JSName("on")
  def on_error(name: error, handler: js.Function1[/* err */ js.Any, Unit]): Req = js.native
  def part(): Req = js.native
  def pipe(stream: WritableStream): Writable = js.native
  def pipe(stream: WritableStream, options: js.Object): Writable = js.native
  def query(`val`: js.Object): Req = js.native
  def redirects(n: Double): Req = js.native
  def send(data: String): Req = js.native
  def send(data: js.Object): Req = js.native
  def set(field: String, `val`: String): Req = js.native
  def set(field: js.Object): Req = js.native
  def timeout(ms: Double): Req = js.native
  def `type`(`val`: String): Req = js.native
  def withCredentials(): Req = js.native
  def write(data: String): Req = js.native
  def write(data: String, encoding: String): Req = js.native
  def write(data: Buffer): Req = js.native
  def write(data: Buffer, encoding: String): Req = js.native
}

