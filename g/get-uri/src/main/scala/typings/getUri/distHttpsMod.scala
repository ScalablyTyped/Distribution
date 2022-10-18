package typings.getUri

import typings.getUri.distHttpMod.HttpOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHttpsMod {
  
  @JSImport("get-uri/dist/https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: UrlWithStringQuery, opts: HttpOptions): js.Promise[Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Readable]]
}
