package typings.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClientPagespeedonline.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedApiFormatStringV2 extends js.Object {
  /** List of arguments for the format string. */
  var args: js.UndefOr[js.Array[Key]] = js.undefined
  /**
    * A localized format string with {{FOO}} placeholders, where 'FOO' is the key of the argument whose value should be substituted. For HYPERLINK arguments,
    * the format string will instead contain {{BEGIN_FOO}} and {{END_FOO}} for the argument with key 'FOO'.
    */
  var format: js.UndefOr[String] = js.undefined
}

object PagespeedApiFormatStringV2 {
  @scala.inline
  def apply(args: js.Array[Key] = null, format: String = null): PagespeedApiFormatStringV2 = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagespeedApiFormatStringV2]
  }
}

