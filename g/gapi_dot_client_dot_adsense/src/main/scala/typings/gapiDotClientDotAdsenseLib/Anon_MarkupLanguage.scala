package typings
package gapiDotClientDotAdsenseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MarkupLanguage extends js.Object {
  /** The markup language to use for this ad unit. */
  var markupLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The scripting language to use for this ad unit. */
  var scriptingLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** Size of this ad unit. */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this ad unit. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MarkupLanguage {
  @scala.inline
  def apply(
    markupLanguage: java.lang.String = null,
    scriptingLanguage: java.lang.String = null,
    size: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_MarkupLanguage = {
    val __obj = js.Dynamic.literal()
    if (markupLanguage != null) __obj.updateDynamic("markupLanguage")(markupLanguage)
    if (scriptingLanguage != null) __obj.updateDynamic("scriptingLanguage")(scriptingLanguage)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_MarkupLanguage]
  }
}

