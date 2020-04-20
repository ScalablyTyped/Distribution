package typings.expressSitemapXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-sitemap-xml", "buildSitemaps")
@js.native
object buildSitemaps extends js.Object {
  /**
    *
    * Create an object where the keys are sitemap URLs to be served by the server
    * and the values are strings of sitemap XML content
    */
  def apply(urls: js.Array[SitemapLeaf], base: String): js.Promise[Sitemap] = js.native
}

