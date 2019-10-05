package typings.atFrctlFractal.atFrctlFractalMod.fractal.web

import typings.atFrctlFractal.atFrctlFractalMod.WebTheme
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.mixins.ConfigurableEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.web.Web")
@js.native
class Web () extends ConfigurableEmitter[WebConfig] {
  def builder(): Builder = js.native
  def builder(config: WebBuilderConfig): Builder = js.native
  def defaultTheme(): WebTheme = js.native
  def defaultTheme(instance: WebTheme): this.type = js.native
  def server(): Server = js.native
  def server(config: WebServerConfig): Server = js.native
  def theme(name: String): this.type = js.native
  def theme(name: String, instance: WebTheme): this.type = js.native
}

