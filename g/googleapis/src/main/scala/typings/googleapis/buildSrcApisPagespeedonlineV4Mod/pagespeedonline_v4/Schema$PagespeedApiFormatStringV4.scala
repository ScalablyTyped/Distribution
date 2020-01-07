package typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4

import typings.googleapis.Anon_KeyRects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PagespeedApiFormatStringV4 extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.UndefOr[js.Array[Anon_KeyRects]] = js.native
  /**
    * A localized format string with {{FOO}} placeholders, where &#39;FOO&#39;
    * is the key of the argument whose value should be substituted. For
    * HYPERLINK arguments, the format string will instead contain {{BEGIN_FOO}}
    * and {{END_FOO}} for the argument with key &#39;FOO&#39;.
    */
  var format: js.UndefOr[String] = js.native
}

object Schema$PagespeedApiFormatStringV4 {
  @scala.inline
  def apply(args: js.Array[Anon_KeyRects] = null, format: String = null): Schema$PagespeedApiFormatStringV4 = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PagespeedApiFormatStringV4]
  }
}

