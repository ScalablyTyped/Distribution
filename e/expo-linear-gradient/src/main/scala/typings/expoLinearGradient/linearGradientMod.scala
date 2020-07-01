package typings.expoLinearGradient

import typings.expoLinearGradient.anon.Colors
import typings.expoLinearGradient.anon.TypeofView
import typings.expoLinearGradient.anon.X
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/LinearGradient", JSImport.Namespace)
@js.native
object linearGradientMod extends js.Object {
  @js.native
  trait LinearGradient
    extends Component[LinearGradientProps, js.Object, js.Any]
  
  @js.native
  class default () extends LinearGradient
  
  type LinearGradienPoint = X | (js.Tuple2[Double, Double])
  type LinearGradientProps = Colors with ComponentProps[TypeofView]
}

