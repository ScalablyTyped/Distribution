package typings
package atFrctlFractalLib.fractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "Fractal")
@js.native
class Fractal ()
  extends atFrctlFractalLib.fractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter[FractalConfig] {
  def this(config: FractalConfig) = this()
  val assets: atFrctlFractalLib.fractalMod.fractalNs.apiNs.assetsNs.AssetSourceCollection = js.native
  val cli: atFrctlFractalLib.fractalMod.fractalNs.cliNs.Cli = js.native
  val components: atFrctlFractalLib.fractalMod.fractalNs.apiNs.componentsNs.ComponentSource = js.native
  val debug: scala.Boolean = js.native
  val docs: atFrctlFractalLib.fractalMod.fractalNs.apiNs.docsNs.DocSource = js.native
  val version: java.lang.String = js.native
  val web: atFrctlFractalLib.fractalMod.fractalNs.webNs.Web = js.native
  def extend(plugin: java.lang.String): this.type = js.native
  def extend(plugin: js.ThisFunction1[/* this */ this.type, /* core */ js.Any, scala.Unit]): this.type = js.native
  def load(): stdLib.Promise[scala.Unit] = js.native
  def unwatch(): this.type = js.native
  def watch(): this.type = js.native
}

