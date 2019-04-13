package typings
package atEmotionStyledDashBaseLib.atEmotionStyledDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyled[Theme /* <: js.Object */] extends js.Object {
  def apply[Tag /* <: reactLib.reactMod.ComponentType[_] */, ExtraProps](tag: Tag): CreateStyledComponentExtrinsic[Tag, ExtraProps, Theme] = js.native
  def apply[Tag /* <: reactLib.reactMod.ComponentType[_] */, ExtraProps](tag: Tag, options: StyledOptions): CreateStyledComponentExtrinsic[Tag, ExtraProps, Theme] = js.native
}

