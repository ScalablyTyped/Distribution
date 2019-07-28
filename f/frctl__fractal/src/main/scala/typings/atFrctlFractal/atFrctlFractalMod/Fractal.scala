package typings.atFrctlFractal.atFrctlFractalMod

import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetSourceCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.ComponentSource
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.DocSource
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.cliNs.Cli
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "Fractal")
@js.native
class Fractal () extends ConfigurableEmitter[FractalConfig] {
  def this(config: FractalConfig) = this()
  val assets: AssetSourceCollection = js.native
  val cli: Cli = js.native
  val components: ComponentSource = js.native
  val debug: Boolean = js.native
  val docs: DocSource = js.native
  val version: String = js.native
  val web: Web = js.native
  def extend(plugin: String): this.type = js.native
  def extend(plugin: js.ThisFunction1[/* this */ this.type, /* core */ js.Any, Unit]): this.type = js.native
  def load(): js.Promise[Unit] = js.native
  def unwatch(): this.type = js.native
  def watch(): this.type = js.native
}

