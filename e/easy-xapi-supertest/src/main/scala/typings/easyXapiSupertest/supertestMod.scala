package typings.easyXapiSupertest

import typings.easyXapiSupertest.superagentMod.Request
import typings.easyXapiSupertest.superagentMod.SuperAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supertestMod {
  
  inline def apply(app: Any): SuperTest = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest]
  
  @JSImport("supertest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def agent(): SuperTest = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")().asInstanceOf[SuperTest]
  inline def agent(app: Any): SuperTest = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest]
  
  type CallbackHandler = (js.Function2[/* err */ Any, /* res */ Response, Unit]) | (js.Function1[/* res */ Response, Unit])
  
  type Response = typings.easyXapiSupertest.superagentMod.Response
  
  type SuperTest = SuperAgent[Test]
  
  @js.native
  trait Test
    extends StObject
       with Request[Test] {
    
    def expect(body: String): Test = js.native
    def expect(body: String, callback: CallbackHandler): Test = js.native
    def expect(body: js.Object): Test = js.native
    def expect(body: js.Object, callback: CallbackHandler): Test = js.native
    def expect(body: js.RegExp): Test = js.native
    def expect(body: js.RegExp, callback: CallbackHandler): Test = js.native
    def expect(checker: js.Function1[/* res */ Response, Any]): Test = js.native
    def expect(field: String, `val`: String): Test = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): Test = js.native
    def expect(field: String, `val`: js.RegExp): Test = js.native
    def expect(field: String, `val`: js.RegExp, callback: CallbackHandler): Test = js.native
    def expect(status: Double): Test = js.native
    def expect(status: Double, body: String): Test = js.native
    def expect(status: Double, body: String, callback: CallbackHandler): Test = js.native
    def expect(status: Double, callback: CallbackHandler): Test = js.native
    
    def serverAddress(app: Any, path: String): String = js.native
    
    var url: String = js.native
  }
}
