package typings.atFrctlFractal.atFrctlFractalMod

import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.assets.AssetSourceCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components.ComponentSource
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.docs.DocSource
import typings.atFrctlFractal.atFrctlFractalMod.fractal.cli.Cli
import typings.atFrctlFractal.atFrctlFractalMod.fractal.web.Web
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atFrctlFractal.atFrctlFractalMod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "Fractal")
@js.native
class Fractal () extends EventEmitter {
  def this(config: FractalConfig) = this()
  val assets: AssetSourceCollection = js.native
  val cli: Cli = js.native
  val components: ComponentSource = js.native
  val debug: Boolean = js.native
  val docs: DocSource = js.native
  val version: String = js.native
  val web: Web = js.native
  def config(): FractalConfig = js.native
  def config(config: FractalConfig): this.type = js.native
  def extend(plugin: String): this.type = js.native
  def extend(plugin: js.ThisFunction1[/* this */ this.type, /* core */ js.Any, Unit]): this.type = js.native
  def get[K /* <: String */, V](path: K): js.UndefOr[
    (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
    (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def load(): js.Promise[Unit] = js.native
  def set[K /* <: String */](path: K): this.type = js.native
  def set[K /* <: String */](path: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
  def unwatch(): this.type = js.native
  def watch(): this.type = js.native
}

