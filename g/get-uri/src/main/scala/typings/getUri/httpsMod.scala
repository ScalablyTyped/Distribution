package typings.getUri

import typings.getUri.httpMod.HttpOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-uri/dist/https", JSImport.Namespace)
@js.native
object httpsMod extends js.Object {
  
  def default(parsed: UrlWithStringQuery, opts: HttpOptions): js.Promise[Readable] = js.native
}
