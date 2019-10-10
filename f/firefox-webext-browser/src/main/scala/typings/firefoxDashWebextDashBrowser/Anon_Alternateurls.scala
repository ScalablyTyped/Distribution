package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternateurls extends js.Object {
  /** @deprecated Unsupported on Firefox at this time. */
  var alternate_urls: js.UndefOr[js.Array[String]] = js.undefined
  /** Encoding of the search term. */
  var encoding: js.UndefOr[String] = js.undefined
  var favicon_url: js.UndefOr[String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url: js.UndefOr[String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url_post_params: js.UndefOr[String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url: js.UndefOr[String] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url_post_params: js.UndefOr[String] = js.undefined
  /** Sets the default engine to a built-in engine only. */
  var is_default: js.UndefOr[Boolean] = js.undefined
  var keyword: js.UndefOr[String] = js.undefined
  var name: String
  /**
    * A list of optional search url parameters. This allows the additon of search url parameters based on
    * how the search is performed in Firefox.
    */
  var params: js.UndefOr[js.Array[Anon_Condition]] = js.undefined
  /** @deprecated Unsupported on Firefox. */
  var prepopulated_id: js.UndefOr[Double] = js.undefined
  var search_form: js.UndefOr[String] = js.undefined
  var search_url: String
  /** GET parameters to the search_url as a query string. */
  var search_url_get_params: js.UndefOr[String] = js.undefined
  /** POST parameters to the search_url as a query string. */
  var search_url_post_params: js.UndefOr[String] = js.undefined
  var suggest_url: js.UndefOr[String] = js.undefined
  /** GET parameters to the suggest_url as a query string. */
  var suggest_url_get_params: js.UndefOr[String] = js.undefined
  /** POST parameters to the suggest_url as a query string. */
  var suggest_url_post_params: js.UndefOr[String] = js.undefined
}

object Anon_Alternateurls {
  @scala.inline
  def apply(
    name: String,
    search_url: String,
    alternate_urls: js.Array[String] = null,
    encoding: String = null,
    favicon_url: String = null,
    image_url: String = null,
    image_url_post_params: String = null,
    instant_url: String = null,
    instant_url_post_params: String = null,
    is_default: js.UndefOr[Boolean] = js.undefined,
    keyword: String = null,
    params: js.Array[Anon_Condition] = null,
    prepopulated_id: Int | Double = null,
    search_form: String = null,
    search_url_get_params: String = null,
    search_url_post_params: String = null,
    suggest_url: String = null,
    suggest_url_get_params: String = null,
    suggest_url_post_params: String = null
  ): Anon_Alternateurls = {
    val __obj = js.Dynamic.literal(name = name, search_url = search_url)
    if (alternate_urls != null) __obj.updateDynamic("alternate_urls")(alternate_urls)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (favicon_url != null) __obj.updateDynamic("favicon_url")(favicon_url)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    if (image_url_post_params != null) __obj.updateDynamic("image_url_post_params")(image_url_post_params)
    if (instant_url != null) __obj.updateDynamic("instant_url")(instant_url)
    if (instant_url_post_params != null) __obj.updateDynamic("instant_url_post_params")(instant_url_post_params)
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (params != null) __obj.updateDynamic("params")(params)
    if (prepopulated_id != null) __obj.updateDynamic("prepopulated_id")(prepopulated_id.asInstanceOf[js.Any])
    if (search_form != null) __obj.updateDynamic("search_form")(search_form)
    if (search_url_get_params != null) __obj.updateDynamic("search_url_get_params")(search_url_get_params)
    if (search_url_post_params != null) __obj.updateDynamic("search_url_post_params")(search_url_post_params)
    if (suggest_url != null) __obj.updateDynamic("suggest_url")(suggest_url)
    if (suggest_url_get_params != null) __obj.updateDynamic("suggest_url_get_params")(suggest_url_get_params)
    if (suggest_url_post_params != null) __obj.updateDynamic("suggest_url_post_params")(suggest_url_post_params)
    __obj.asInstanceOf[Anon_Alternateurls]
  }
}

