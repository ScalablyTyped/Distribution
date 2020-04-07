package typings.expoLinearGradient

import typings.react.mod.ComponentProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Namespace)
@js.native
object nativeLinearGradientWebMod extends js.Object {
  val default: FunctionComponent[Props] = js.native
  type Point = js.Tuple2[Double, Double]
  type Props = AnonOnLayout with ComponentProps[TypeofView]
}

