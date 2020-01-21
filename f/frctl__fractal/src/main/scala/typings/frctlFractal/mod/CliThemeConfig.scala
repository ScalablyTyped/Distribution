package typings.frctlFractal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliThemeConfig extends js.Object {
  var delimiter: js.UndefOr[AnonFormat] = js.undefined
  @JSName("delimiter.format")
  var delimiterDotformat: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  @JSName("delimiter.text")
  var delimiterDottext: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object CliThemeConfig {
  @scala.inline
  def apply(
    delimiter: AnonFormat = null,
    delimiterDotformat: /* str */ String => String = null,
    delimiterDottext: String = null,
    styles: StringDictionary[js.Any] = null
  ): CliThemeConfig = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (delimiterDotformat != null) __obj.updateDynamic("delimiter.format")(js.Any.fromFunction1(delimiterDotformat))
    if (delimiterDottext != null) __obj.updateDynamic("delimiter.text")(delimiterDottext.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliThemeConfig]
  }
}

