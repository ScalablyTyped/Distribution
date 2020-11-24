package typings.easyXapiSupertest.superagentMod

import typings.easyXapiSupertest.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends ReadableStream {
  
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
