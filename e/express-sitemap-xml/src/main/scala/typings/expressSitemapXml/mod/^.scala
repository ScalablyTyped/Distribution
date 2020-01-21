package typings.expressSitemapXml.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-sitemap-xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]], base: String): RequestHandler[ParamsDictionary] = js.native
}

