package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliThemeConfig extends js.Object {
  var delimiter: js.UndefOr[atFrctlFractalLib.Anon_Format] = js.undefined
  var `delimiter.format`: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  var `delimiter.text`: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object CliThemeConfig {
  @scala.inline
  def apply(
    delimiter: atFrctlFractalLib.Anon_Format = null,
    `delimiter.format`: /* str */ java.lang.String => java.lang.String = null,
    `delimiter.text`: java.lang.String = null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): CliThemeConfig = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (`delimiter.format` != null) __obj.updateDynamic("delimiter.format")(js.Any.fromFunction1(`delimiter.format`))
    if (`delimiter.text` != null) __obj.updateDynamic("delimiter.text")(`delimiter.text`)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CliThemeConfig]
  }
}

