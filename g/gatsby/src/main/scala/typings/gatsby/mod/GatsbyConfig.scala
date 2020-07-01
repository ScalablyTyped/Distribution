package typings.gatsby.mod

import typings.gatsby.anon.Prefix
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyConfig extends js.Object {
  /** In some circumstances you may want to deploy assets (non-HTML resources such as JavaScript, CSS, etc.) to a separate domain. `assetPrefix` allows you to use Gatsby with assets hosted from a separate domain */
  var assetPrefix: js.UndefOr[String] = js.undefined
  /** Sometimes you need more granular/flexible access to the development server. Gatsby exposes the Express.js development server to your site’s gatsby-config.js where you can add Express middleware as needed. */
  var developMiddleware: js.UndefOr[js.Function1[/* app */ js.Any, Unit]] = js.undefined
  var mapping: js.UndefOr[Record[String, String]] = js.undefined
  /** It’s common for sites to be hosted somewhere other than the root of their domain. Say we have a Gatsby site at `example.com/blog/`. In this case, we would need a prefix (`/blog`) added to all paths on the site. */
  var pathPrefix: js.UndefOr[String] = js.undefined
  /** Plugins are Node.js packages that implement Gatsby APIs. The config file accepts an array of plugins. Some plugins may need only to be listed by name, while others may take options. */
  var plugins: js.UndefOr[js.Array[PluginRef]] = js.undefined
  /** Gatsby uses the ES6 Promise API. Because some browsers don't support this, Gatsby includes a Promise polyfill by default. If you'd like to provide your own Promise polyfill, you can set `polyfill` to false.*/
  var polyfill: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting the proxy config option will tell the develop server to proxy any unknown requests to your specified server.
    * @see https://www.gatsbyjs.org/docs/api-proxy/
    * */
  var proxy: js.UndefOr[Prefix] = js.undefined
  /** When you want to reuse common pieces of data across the site (for example, your site title), you can store that here. */
  var siteMetadata: js.UndefOr[Record[String, _]] = js.undefined
}

object GatsbyConfig {
  @scala.inline
  def apply(
    assetPrefix: String = null,
    developMiddleware: /* app */ js.Any => Unit = null,
    mapping: Record[String, String] = null,
    pathPrefix: String = null,
    plugins: js.Array[PluginRef] = null,
    polyfill: js.UndefOr[Boolean] = js.undefined,
    proxy: Prefix = null,
    siteMetadata: Record[String, _] = null
  ): GatsbyConfig = {
    val __obj = js.Dynamic.literal()
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (developMiddleware != null) __obj.updateDynamic("developMiddleware")(js.Any.fromFunction1(developMiddleware))
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (siteMetadata != null) __obj.updateDynamic("siteMetadata")(siteMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyConfig]
  }
}

