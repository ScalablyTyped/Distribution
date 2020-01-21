package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.mod.WebTheme
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "fractal.web.Web")
@js.native
class Web () extends EventEmitter {
  def builder(): Builder = js.native
  def builder(config: WebBuilderConfig): Builder = js.native
  def config(): WebConfig = js.native
  def config(config: WebConfig): this.type = js.native
  def defaultTheme(): WebTheme = js.native
  def defaultTheme(instance: WebTheme): this.type = js.native
  def get[K /* <: String */, V](path: K): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def server(): Server = js.native
  def server(config: WebServerConfig): Server = js.native
  def set[K /* <: String */](path: K): this.type = js.native
  def set[K /* <: String */](
    path: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def theme(name: String): this.type = js.native
  def theme(name: String, instance: WebTheme): this.type = js.native
}

