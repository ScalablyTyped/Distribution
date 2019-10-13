package typings.atFrctlFractal.atFrctlFractalMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atFrctlFractal.atFrctlFractalMod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "CliTheme")
@js.native
class CliTheme () extends EventEmitter {
  def this(config: CliThemeConfig) = this()
  def config(): CliThemeConfig = js.native
  def config(config: CliThemeConfig): this.type = js.native
  def delimiter(): String = js.native
  def format(str: String): String = js.native
  def format(str: String, style: String): String = js.native
  def format(str: String, style: String, strip: Boolean): String = js.native
  def get[K /* <: String */, V](path: K): js.UndefOr[
    (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
    (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def set[K /* <: String */](path: K): this.type = js.native
  def set[K /* <: String */](path: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
  def setDelimiter(text: String, formatter: js.Function1[/* str */ String, String]): Unit = js.native
  def setStyle(name: String, opts: js.Any): Unit = js.native
  def style(name: String): js.Any = js.native
}

