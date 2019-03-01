package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: js.Function1[/* str */ java.lang.String, java.lang.String] = null,
    text: java.lang.String = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Format]
  }
}

