package typings.expoLinearGradient

import typings.react.mod.Component
import typings.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Namespace)
@js.native
object nativeLinearGradientIosMod extends js.Object {
  @js.native
  trait NativeLinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends NativeLinearGradient
  
  type Point = js.Tuple2[Double, Double]
  type Props = AnonLocations with ComponentProps[TypeofView]
}

