package typings.getUri.httpMod

import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-uri/dist/http", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(parsed: UrlWithStringQuery, opts: HttpOptions): js.Promise[Readable] = js.native
}
