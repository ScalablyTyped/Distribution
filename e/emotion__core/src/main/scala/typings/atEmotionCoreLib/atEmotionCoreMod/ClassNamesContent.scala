package typings
package atEmotionCoreLib.atEmotionCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNamesContent[Theme] extends js.Object {
  var theme: Theme = js.native
  def css(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): java.lang.String = js.native
  def css(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): java.lang.String = js.native
  def cx(args: ClassNamesArg*): java.lang.String = js.native
}

