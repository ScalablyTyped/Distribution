package typings.atFrctlFractal.atFrctlFractalMod

import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "CliTheme")
@js.native
class CliTheme () extends ConfigurableEmitter[CliThemeConfig] {
  def this(config: CliThemeConfig) = this()
  def delimiter(): String = js.native
  def format(str: String): String = js.native
  def format(str: String, style: String): String = js.native
  def format(str: String, style: String, strip: Boolean): String = js.native
  def setDelimiter(text: String, formatter: js.Function1[/* str */ String, String]): Unit = js.native
  def setStyle(name: String, opts: js.Any): Unit = js.native
  def style(name: String): js.Any = js.native
}

