package typings.atFrctlFractal.atFrctlFractalMod

import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.assets.AssetSourceCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components.ComponentSource
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.docs.DocSource
import typings.atFrctlFractal.atFrctlFractalMod.fractal.cli.Cli
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.mixins.ConfigurableEmitter
import typings.atFrctlFractal.atFrctlFractalMod.fractal.web.Web
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

