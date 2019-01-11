package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "Fractal")
@js.native
class Fractal ()
  extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter[FractalConfig] {
  def this(config: FractalConfig) = this()
  val assets: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetSourceCollection = js.native
  val cli: atFrctlFractalLib.atFrctlFractalMod.fractalNs.cliNs.Cli = js.native
  val components: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.ComponentSource = js.native
  val debug: scala.Boolean = js.native
  val docs: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.DocSource = js.native
  val version: java.lang.String = js.native
  val web: atFrctlFractalLib.atFrctlFractalMod.fractalNs.webNs.Web = js.native
  def extend(plugin: java.lang.String): this.type = js.native
  def extend(plugin: js.ThisFunction1[/* this */ this.type, /* core */ js.Any, scala.Unit]): this.type = js.native
  def load(): js.Promise[scala.Unit] = js.native
  def unwatch(): this.type = js.native
  def watch(): this.type = js.native
}

