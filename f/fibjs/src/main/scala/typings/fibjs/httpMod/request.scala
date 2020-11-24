package typings.fibjs.httpMod

import typings.fibjs.ClassHttpRequest
import typings.fibjs.ClassHttpResponse
import typings.fibjs.ClassStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http", "request")
@js.native
object request extends js.Object {
  
  def apply(conn: ClassStream, req: ClassHttpRequest): ClassHttpResponse = js.native
  def apply(method: String, url: String): ClassHttpResponse = js.native
  def apply(method: String, url: String, opts: js.Object): ClassHttpResponse = js.native
}
