package typings.expoLinearGradient

import typings.expoLinearGradient.anon.EndPoint
import typings.expoLinearGradient.anon.TypeofView
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linear-gradient/build/NativeLinearGradient.android", JSImport.Namespace)
@js.native
object nativeLinearGradientAndroidMod extends js.Object {
  @js.native
  trait NativeLinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends NativeLinearGradient
  
  type Point = js.Tuple2[Double, Double]
  type Props = EndPoint with ComponentProps[TypeofView]
}

