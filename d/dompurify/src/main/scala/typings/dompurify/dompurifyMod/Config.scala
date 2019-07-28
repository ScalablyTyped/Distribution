package typings.dompurify.dompurifyMod

import typings.dompurify.Anon_Html
import typings.dompurify.dompurifyNumbers.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var ADD_ATTR: js.UndefOr[js.Array[String]] = js.undefined
  var ADD_TAGS: js.UndefOr[js.Array[String]] = js.undefined
  var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.undefined
  var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.undefined
  var ALLOWED_URI_REGEXP: js.UndefOr[RegExp] = js.undefined
  var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined
  var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined
  var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.undefined
  var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.undefined
  var FORCE_BODY: js.UndefOr[Boolean] = js.undefined
  var IN_PLACE: js.UndefOr[Boolean] = js.undefined
  var KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined
  var RETURN_DOM: js.UndefOr[Boolean] = js.undefined
  var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.undefined
  var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined
  var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.undefined
  var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined
  var SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined
  var USE_PROFILES: js.UndefOr[`false` | Anon_Html] = js.undefined
  var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ADD_ATTR: js.Array[String] = null,
    ADD_TAGS: js.Array[String] = null,
    ALLOWED_ATTR: js.Array[String] = null,
    ALLOWED_TAGS: js.Array[String] = null,
    ALLOWED_URI_REGEXP: RegExp = null,
    ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.undefined,
    ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.undefined,
    FORBID_ATTR: js.Array[String] = null,
    FORBID_TAGS: js.Array[String] = null,
    FORCE_BODY: js.UndefOr[Boolean] = js.undefined,
    IN_PLACE: js.UndefOr[Boolean] = js.undefined,
    KEEP_CONTENT: js.UndefOr[Boolean] = js.undefined,
    RETURN_DOM: js.UndefOr[Boolean] = js.undefined,
    RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.undefined,
    RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.undefined,
    SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.undefined,
    SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.undefined,
    SANITIZE_DOM: js.UndefOr[Boolean] = js.undefined,
    USE_PROFILES: `false` | Anon_Html = null,
    WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (ADD_ATTR != null) __obj.updateDynamic("ADD_ATTR")(ADD_ATTR)
    if (ADD_TAGS != null) __obj.updateDynamic("ADD_TAGS")(ADD_TAGS)
    if (ALLOWED_ATTR != null) __obj.updateDynamic("ALLOWED_ATTR")(ALLOWED_ATTR)
    if (ALLOWED_TAGS != null) __obj.updateDynamic("ALLOWED_TAGS")(ALLOWED_TAGS)
    if (ALLOWED_URI_REGEXP != null) __obj.updateDynamic("ALLOWED_URI_REGEXP")(ALLOWED_URI_REGEXP)
    if (!js.isUndefined(ALLOW_DATA_ATTR)) __obj.updateDynamic("ALLOW_DATA_ATTR")(ALLOW_DATA_ATTR)
    if (!js.isUndefined(ALLOW_UNKNOWN_PROTOCOLS)) __obj.updateDynamic("ALLOW_UNKNOWN_PROTOCOLS")(ALLOW_UNKNOWN_PROTOCOLS)
    if (FORBID_ATTR != null) __obj.updateDynamic("FORBID_ATTR")(FORBID_ATTR)
    if (FORBID_TAGS != null) __obj.updateDynamic("FORBID_TAGS")(FORBID_TAGS)
    if (!js.isUndefined(FORCE_BODY)) __obj.updateDynamic("FORCE_BODY")(FORCE_BODY)
    if (!js.isUndefined(IN_PLACE)) __obj.updateDynamic("IN_PLACE")(IN_PLACE)
    if (!js.isUndefined(KEEP_CONTENT)) __obj.updateDynamic("KEEP_CONTENT")(KEEP_CONTENT)
    if (!js.isUndefined(RETURN_DOM)) __obj.updateDynamic("RETURN_DOM")(RETURN_DOM)
    if (!js.isUndefined(RETURN_DOM_FRAGMENT)) __obj.updateDynamic("RETURN_DOM_FRAGMENT")(RETURN_DOM_FRAGMENT)
    if (!js.isUndefined(RETURN_DOM_IMPORT)) __obj.updateDynamic("RETURN_DOM_IMPORT")(RETURN_DOM_IMPORT)
    if (!js.isUndefined(SAFE_FOR_JQUERY)) __obj.updateDynamic("SAFE_FOR_JQUERY")(SAFE_FOR_JQUERY)
    if (!js.isUndefined(SAFE_FOR_TEMPLATES)) __obj.updateDynamic("SAFE_FOR_TEMPLATES")(SAFE_FOR_TEMPLATES)
    if (!js.isUndefined(SANITIZE_DOM)) __obj.updateDynamic("SANITIZE_DOM")(SANITIZE_DOM)
    if (USE_PROFILES != null) __obj.updateDynamic("USE_PROFILES")(USE_PROFILES.asInstanceOf[js.Any])
    if (!js.isUndefined(WHOLE_DOCUMENT)) __obj.updateDynamic("WHOLE_DOCUMENT")(WHOLE_DOCUMENT)
    __obj.asInstanceOf[Config]
  }
}

