package typings.easyXapiSupertest

import typings.easyXapiSupertest.superagentMod.Request
import typings.easyXapiSupertest.superagentMod.SuperAgent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("supertest", JSImport.Namespace)
@js.native
object supertestMod extends js.Object {
  
  def apply(app: js.Any): SuperTest = js.native
  
  def agent(): SuperTest = js.native
  def agent(app: js.Any): SuperTest = js.native
  
  @js.native
  trait Test extends Request[Test] {
    
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
    
    var url: String = js.native
  }
  
  type CallbackHandler = (js.Function2[/* err */ js.Any, /* res */ Response, Unit]) | (js.Function1[/* res */ Response, Unit])
  
  type Response = typings.easyXapiSupertest.superagentMod.Response
  
  type SuperTest = SuperAgent[Test]
}
