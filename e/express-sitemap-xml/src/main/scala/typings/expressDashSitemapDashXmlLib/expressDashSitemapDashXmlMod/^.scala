package typings
package expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-sitemap-xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    getUrls: js.Function0[
      (js.Array[
        expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod.expressSitemapXmlNs.SitemapLeaf
      ]) | (js.Promise[
        js.Array[
          expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod.expressSitemapXmlNs.SitemapLeaf
        ]
      ])
    ],
    base: java.lang.String
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def buildSitemaps(
    urls: js.Array[
      expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod.expressSitemapXmlNs.SitemapLeaf
    ],
    base: java.lang.String
  ): js.Promise[
    expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod.expressSitemapXmlNs.Sitemap
  ] = js.native
}

