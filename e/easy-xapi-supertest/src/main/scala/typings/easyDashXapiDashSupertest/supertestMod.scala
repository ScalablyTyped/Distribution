package typings.easyDashXapiDashSupertest

import typings.easyDashXapiDashSupertest.superagentMod.Request
import typings.easyDashXapiDashSupertest.superagentMod.SuperAgent
import typings.easyDashXapiDashSupertest.supertestMod.CallbackHandler
import typings.easyDashXapiDashSupertest.supertestMod.Response
import typings.easyDashXapiDashSupertest.supertestMod.SuperTest
import typings.easyDashXapiDashSupertest.supertestMod.Test
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supertest", JSImport.Namespace)
@js.native
object supertestMod extends js.Object {
  @js.native
  trait Test extends Request[Test] {
    var url: String = js.native
    def expect(body: String): Test = js.native
    def expect(body: String, callback: CallbackHandler): Test = js.native
    def expect(body: js.Object): Test = js.native
    def expect(body: js.Object, callback: CallbackHandler): Test = js.native
    def expect(body: RegExp): Test = js.native
    def expect(body: RegExp, callback: CallbackHandler): Test = js.native
    def expect(checker: js.Function1[/* res */ Response, _]): Test = js.native
    def expect(field: String, `val`: String): Test = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): Test = js.native
    def expect(field: String, `val`: RegExp): Test = js.native
    def expect(field: String, `val`: RegExp, callback: CallbackHandler): Test = js.native
    def expect(status: Double): Test = js.native
    def expect(status: Double, body: String): Test = js.native
    def expect(status: Double, body: String, callback: CallbackHandler): Test = js.native
    def expect(status: Double, callback: CallbackHandler): Test = js.native
    def serverAddress(app: js.Any, path: String): String = js.native
  }
  
  def apply(app: js.Any): SuperTest = js.native
  def agent(): SuperTest = js.native
  def agent(app: js.Any): SuperTest = js.native
  type CallbackHandler = (js.Function2[/* err */ js.Any, /* res */ Response, Unit]) | (js.Function1[/* res */ Response, Unit])
  type Response = typings.easyDashXapiDashSupertest.superagentMod.Response
  type SuperTest = SuperAgent[Test]
}

