package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Options
import typings.gatsby.Anon_Prefix
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyConfig extends js.Object {
  /** Sometimes you need more granular/flexible access to the development server. Gatsby exposes the Express.js development server to your site’s gatsby-config.js where you can add Express middleware as needed. */
  var developMiddleware: js.UndefOr[js.Function1[/* app */ js.Any, Unit]] = js.undefined
  var mapping: js.UndefOr[Record[String, String]] = js.undefined
  /** It’s common for sites to be hosted somewhere other than the root of their domain. Say we have a Gatsby site at `example.com/blog/`. In this case, we would need a prefix (`/blog`) added to all paths on the site. */
  var pathPrefix: js.UndefOr[String] = js.undefined
  /** Plugins are Node.js packages that implement Gatsby APIs. The config file accepts an array of plugins. Some plugins may need only to be listed by name, while others may take options. */
  var plugins: js.UndefOr[js.Array[String | Anon_Options]] = js.undefined
  /** Gatsby uses the ES6 Promise API. Because some browsers don't support this, Gatsby includes a Promise polyfill by default. If you'd like to provide your own Promise polyfill, you can set `polyfill` to false.*/
  var polyfill: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting the proxy config option will tell the develop server to proxy any unknown requests to your specified server.
    * @see https://www.gatsbyjs.org/docs/api-proxy/
    * */
  var proxy: js.UndefOr[Anon_Prefix] = js.undefined
  /** When you want to reuse common pieces of data across the site (for example, your site title), you can store that here. */
  var siteMetadata: js.UndefOr[Record[String, _]] = js.undefined
}

object GatsbyConfig {
  @scala.inline
  def apply(
    developMiddleware: /* app */ js.Any => Unit = null,
    mapping: Record[String, String] = null,
    pathPrefix: String = null,
    plugins: js.Array[String | Anon_Options] = null,
    polyfill: js.UndefOr[Boolean] = js.undefined,
    proxy: Anon_Prefix = null,
    siteMetadata: Record[String, _] = null
  ): GatsbyConfig = {
    val __obj = js.Dynamic.literal()
    if (developMiddleware != null) __obj.updateDynamic("developMiddleware")(js.Any.fromFunction1(developMiddleware))
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (siteMetadata != null) __obj.updateDynamic("siteMetadata")(siteMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyConfig]
  }
}

