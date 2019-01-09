package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternateurls extends js.Object {
  /** @deprecated Unsupported on Firefox at this time. */
  var alternate_urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Encoding of the search term. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var favicon_url: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url_post_params: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url_post_params: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the default engine to a built-in engine only. */
  var is_default: js.UndefOr[scala.Boolean] = js.undefined
  var keyword: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  /**
    * A list of optional search url parameters. This allows the additon of search url parameters based on
    * how the search is performed in Firefox.
    */
  var params: js.UndefOr[js.Array[Anon_Condition]] = js.undefined
  /** @deprecated Unsupported on Firefox. */
  var prepopulated_id: js.UndefOr[scala.Double] = js.undefined
  var search_url: java.lang.String
  /** POST parameters to the search_url as a query string. */
  var search_url_post_params: js.UndefOr[java.lang.String] = js.undefined
  var suggest_url: js.UndefOr[java.lang.String] = js.undefined
  /** POST parameters to the suggest_url as a query string. */
  var suggest_url_post_params: js.UndefOr[java.lang.String] = js.undefined
}

