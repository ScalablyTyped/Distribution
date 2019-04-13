package typings
package expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-sitemap-xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]],
    base: java.lang.String
  ): expressLib.expressMod.RequestHandler = js.native
  def buildSitemaps(urls: js.Array[SitemapLeaf], base: java.lang.String): js.Promise[Sitemap] = js.native
}

