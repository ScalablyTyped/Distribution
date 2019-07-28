package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import typings.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconDefinition
import typings.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup
import typings.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fortawesome/fontawesome-svg-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val config: Config = js.native
  val dom: DOM = js.native
  val library: Library = js.native
  def counter(content: String): Counter = js.native
  def counter(content: String, params: CounterParams): Counter = js.native
  def counter(content: Double): Counter = js.native
  def counter(content: Double, params: CounterParams): Counter = js.native
  def findIconDefinition(iconLookup: IconLookup): IconDefinition = js.native
  def icon(icon: IconLookup): Icon = js.native
  def icon(icon: IconLookup, params: IconParams): Icon = js.native
  def icon(icon: IconName): Icon = js.native
  def icon(icon: IconName, params: IconParams): Icon = js.native
  def layer(
    assembler: js.Function1[
      /* addLayerCallback */ js.Function1[/* layerToAdd */ IconOrText | js.Array[IconOrText], Unit], 
      Unit
    ]
  ): Layer = js.native
  def noAuto(): Unit = js.native
  def text(content: String): Text = js.native
  def text(content: String, params: TextParams): Text = js.native
  def toHtml(abstractNodes: AbstractElement): String = js.native
  def toHtml(content: js.Any): String = js.native
}

