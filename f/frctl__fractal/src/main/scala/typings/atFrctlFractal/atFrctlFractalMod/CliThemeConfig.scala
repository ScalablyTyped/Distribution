package typings.atFrctlFractal.atFrctlFractalMod

import org.scalablytyped.runtime.StringDictionary
import typings.atFrctlFractal.Anon_Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliThemeConfig extends js.Object {
  var delimiter: js.UndefOr[Anon_Format] = js.undefined
  var `delimiter.format`: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  var `delimiter.text`: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object CliThemeConfig {
  @scala.inline
  def apply(
    delimiter: Anon_Format = null,
    `delimiter.format`: /* str */ String => String = null,
    `delimiter.text`: String = null,
    styles: StringDictionary[js.Any] = null
  ): CliThemeConfig = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (`delimiter.format` != null) __obj.updateDynamic("delimiter.format")(js.Any.fromFunction1(`delimiter.format`))
    if (`delimiter.text` != null) __obj.updateDynamic("delimiter.text")(`delimiter.text`.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliThemeConfig]
  }
}

