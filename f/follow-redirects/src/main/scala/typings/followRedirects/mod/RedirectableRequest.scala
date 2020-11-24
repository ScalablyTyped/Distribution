package typings.followRedirects.mod

import typings.followRedirects.followRedirectsStrings.error
import typings.followRedirects.followRedirectsStrings.response
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectableRequest[Request /* <: WrappableRequest */, Response] extends Writable {
  
  var abort: /* import warning: importer.ImportType#apply Failed type conversion: Request['abort'] */ js.Any = js.native
  
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, response: Response): Boolean = js.native
  
  var flushHeaders: /* import warning: importer.ImportType#apply Failed type conversion: Request['flushHeaders'] */ js.Any = js.native
  
  var getHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['getHeader'] */ js.Any = js.native
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
  
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
  
  var removeHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['removeHeader'] */ js.Any = js.native
  
  var setHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['setHeader'] */ js.Any = js.native
  
  var setNoDelay: /* import warning: importer.ImportType#apply Failed type conversion: Request['setNoDelay'] */ js.Any = js.native
  
  var setSocketKeepAlive: /* import warning: importer.ImportType#apply Failed type conversion: Request['setSocketKeepAlive'] */ js.Any = js.native
  
  var setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: Request['setTimeout'] */ js.Any = js.native
}
