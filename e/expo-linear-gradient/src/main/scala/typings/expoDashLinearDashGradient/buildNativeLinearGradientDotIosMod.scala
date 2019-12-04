package typings.expoDashLinearDashGradient

import typings.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.NativeLinearGradient
import typings.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.Props
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Namespace)
@js.native
object buildNativeLinearGradientDotIosMod extends js.Object {
  @js.native
  trait NativeLinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends NativeLinearGradient
  
  type Point = js.Tuple2[Double, Double]
  type Props = Anon_ColorsEndPointLocations with ComponentProps[TypeofClassView]
}

