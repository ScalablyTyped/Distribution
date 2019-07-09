package typings
package atEmotionStyledDashBaseLib.atEmotionStyledDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme /* <: js.Object */] extends js.Object {
  def apply[StyleProps /* <: atEmotionStyledDashBaseLib.typesHelperMod.Omit[
    atEmotionStyledDashBaseLib.typesHelperMod.Overwrapped[InnerProps, StyleProps], 
    ReactClassPropKeys
  ] */, Theme /* <: js.Object */](styles: (atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[WithTheme[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
  def apply[StyleProps /* <: atEmotionStyledDashBaseLib.typesHelperMod.Omit[
    atEmotionStyledDashBaseLib.typesHelperMod.Overwrapped[InnerProps, StyleProps], 
    ReactClassPropKeys
  ] */, Theme /* <: js.Object */](
    template: stdLib.TemplateStringsArray,
    styles: (atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[WithTheme[StyleProps, Theme]])*
  ): StyledComponent[InnerProps, StyleProps, Theme] = js.native
}

