package typings
package atEmotionStyledDashBaseLib.atEmotionStyledDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledComponentBase[InnerProps, ExtraProps, Theme /* <: js.Object */] extends js.Object {
  def apply[StyleProps /* <: atEmotionStyledDashBaseLib.typesHelperMod.Omit[
    atEmotionStyledDashBaseLib.typesHelperMod.Overwrapped[InnerProps, StyleProps], 
    ReactClassPropKeys
  ] */](styles: (atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[WithTheme[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
  def apply[StyleProps /* <: atEmotionStyledDashBaseLib.typesHelperMod.Omit[
    atEmotionStyledDashBaseLib.typesHelperMod.Overwrapped[InnerProps, StyleProps], 
    ReactClassPropKeys
  ] */](
    template: stdLib.TemplateStringsArray,
    styles: (atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[WithTheme[StyleProps, Theme]])*
  ): StyledComponent[InnerProps, StyleProps, Theme] = js.native
}

