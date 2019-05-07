package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fortawesome/fontawesome-svg-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val config: Config = js.native
  val dom: DOM = js.native
  val library: Library = js.native
  def counter(content: java.lang.String): Counter = js.native
  def counter(content: java.lang.String, params: CounterParams): Counter = js.native
  def counter(content: scala.Double): Counter = js.native
  def counter(content: scala.Double, params: CounterParams): Counter = js.native
  def findIconDefinition(
    iconLookup: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup
  ): atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconDefinition = js.native
  def icon(
    icon: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup
  ): Icon = js.native
  def icon(
    icon: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup,
    params: IconParams
  ): Icon = js.native
  def icon(
    icon: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconName
  ): Icon = js.native
  def icon(
    icon: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconName,
    params: IconParams
  ): Icon = js.native
  def layer(
    assembler: js.Function1[
      /* addLayerCallback */ js.Function1[/* layerToAdd */ IconOrText | js.Array[IconOrText], scala.Unit], 
      scala.Unit
    ]
  ): Layer = js.native
  def noAuto(): scala.Unit = js.native
  def text(content: java.lang.String): Text = js.native
  def text(content: java.lang.String, params: TextParams): Text = js.native
  def toHtml(abstractNodes: AbstractElement): java.lang.String = js.native
  def toHtml(content: js.Any): java.lang.String = js.native
}

