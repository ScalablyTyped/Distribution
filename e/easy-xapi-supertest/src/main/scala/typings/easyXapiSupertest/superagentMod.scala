package typings.easyXapiSupertest

import org.scalablytyped.runtime.Shortcut
import typings.easyXapiSupertest.NodeJS.ReadableStream
import typings.easyXapiSupertest.NodeJS.WritableStream
import typings.easyXapiSupertest.easyXapiSupertestStrings.error
import typings.easyXapiSupertest.streamMod.Stream
import typings.easyXapiSupertest.streamMod.Writable
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object superagentMod extends Shortcut {
  
  @JSImport("superagent", JSImport.Namespace)
  @js.native
  val ^ : SuperAgentStatic = js.native
  
  type CallbackHandler = (js.Function2[/* err */ js.Any, /* res */ Response, Unit]) | (js.Function1[/* res */ Response, Unit])
  
  @js.native
  trait Request[Req /* <: Request[js.Any] */] extends StObject {
    
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
  
  @js.native
  trait Response
    extends StObject
       with ReadableStream {
    
    var accepted: Boolean = js.native
    
    var badRequest: Boolean = js.native
    
    var body: js.Any = js.native
    
    var charset: String = js.native
    
    var clientError: Boolean = js.native
    
    var error: Error = js.native
    
    var files: js.Any = js.native
    
    var forbidden: Boolean = js.native
    
    def get(header: String): String = js.native
    
    var header: js.Any = js.native
    
    var info: Boolean = js.native
    
    var noContent: Boolean = js.native
    
    var notAcceptable: Boolean = js.native
    
    var notFound: Boolean = js.native
    
    var ok: Boolean = js.native
    
    var redirect: Boolean = js.native
    
    var serverError: Boolean = js.native
    
    var status: Double = js.native
    
    var statusType: Double = js.native
    
    var text: String = js.native
    
    var `type`: String = js.native
    
    var unauthorized: Boolean = js.native
  }
  
  @js.native
  trait SuperAgent[Req /* <: Request[js.Any] */] extends Stream {
    
    def attachCookies(req: Req): Unit = js.native
    
    def checkout(url: String): Req = js.native
    def checkout(url: String, callback: CallbackHandler): Req = js.native
    
    def connect(url: String): Req = js.native
    def connect(url: String, callback: CallbackHandler): Req = js.native
    
    def copy(url: String): Req = js.native
    def copy(url: String, callback: CallbackHandler): Req = js.native
    
    def del(url: String): Req = js.native
    def del(url: String, callback: CallbackHandler): Req = js.native
    
    def delete(url: String): Req = js.native
    def delete(url: String, callback: CallbackHandler): Req = js.native
    
    def get(url: String): Req = js.native
    def get(url: String, callback: CallbackHandler): Req = js.native
    
    def head(url: String): Req = js.native
    def head(url: String, callback: CallbackHandler): Req = js.native
    
    def lock(url: String): Req = js.native
    def lock(url: String, callback: CallbackHandler): Req = js.native
    
    def merge(url: String): Req = js.native
    def merge(url: String, callback: CallbackHandler): Req = js.native
    
    def mkactivity(url: String): Req = js.native
    def mkactivity(url: String, callback: CallbackHandler): Req = js.native
    
    def mkcol(url: String): Req = js.native
    def mkcol(url: String, callback: CallbackHandler): Req = js.native
    
    def move(url: String): Req = js.native
    def move(url: String, callback: CallbackHandler): Req = js.native
    
    // m-search(url: string, callback?: CallbackHandler): Req;
    def notify(url: String): Req = js.native
    def notify(url: String, callback: CallbackHandler): Req = js.native
    
    def options(url: String): Req = js.native
    def options(url: String, callback: CallbackHandler): Req = js.native
    
    def parse(fn: js.Function): Req = js.native
    
    def patch(url: String): Req = js.native
    def patch(url: String, callback: CallbackHandler): Req = js.native
    
    def post(url: String): Req = js.native
    def post(url: String, callback: CallbackHandler): Req = js.native
    
    def propfind(url: String): Req = js.native
    def propfind(url: String, callback: CallbackHandler): Req = js.native
    
    def proppatch(url: String): Req = js.native
    def proppatch(url: String, callback: CallbackHandler): Req = js.native
    
    def purge(url: String): Req = js.native
    def purge(url: String, callback: CallbackHandler): Req = js.native
    
    def put(url: String): Req = js.native
    def put(url: String, callback: CallbackHandler): Req = js.native
    
    def report(url: String): Req = js.native
    def report(url: String, callback: CallbackHandler): Req = js.native
    
    def saveCookies(res: Response): Unit = js.native
    
    def search(url: String): Req = js.native
    def search(url: String, callback: CallbackHandler): Req = js.native
    
    def subscribe(url: String): Req = js.native
    def subscribe(url: String, callback: CallbackHandler): Req = js.native
    
    def trace(url: String): Req = js.native
    def trace(url: String, callback: CallbackHandler): Req = js.native
    
    def unlock(url: String): Req = js.native
    def unlock(url: String, callback: CallbackHandler): Req = js.native
    
    def unsubscribe(url: String): Req = js.native
    def unsubscribe(url: String, callback: CallbackHandler): Req = js.native
  }
  
  type SuperAgentRequest = Request[Request[Request[Request[js.Any]]]]
  
  @js.native
  trait SuperAgentStatic extends SuperAgent[SuperAgentRequest] {
    
    def apply(method: String, url: String): SuperAgentRequest = js.native
    def apply(url: String): SuperAgentRequest = js.native
    
    def agent(): SuperAgent[SuperAgentRequest] = js.native
  }
  
  type _To = SuperAgentStatic
  
  /* This means you don't have to write `^`, but can instead just say `superagentMod.foo` */
  override def _to: SuperAgentStatic = ^
}
