package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "CliTheme")
@js.native
class CliTheme ()
  extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter[CliThemeConfig] {
  def this(config: CliThemeConfig) = this()
  def delimiter(): java.lang.String = js.native
  def format(str: java.lang.String): java.lang.String = js.native
  def format(str: java.lang.String, style: java.lang.String): java.lang.String = js.native
  def format(str: java.lang.String, style: java.lang.String, strip: scala.Boolean): java.lang.String = js.native
  def setDelimiter(text: java.lang.String, formatter: js.Function1[/* str */ java.lang.String, java.lang.String]): scala.Unit = js.native
  def setStyle(name: java.lang.String, opts: js.Any): scala.Unit = js.native
  def style(name: java.lang.String): js.Any = js.native
}

