package typings.expoLinearGradient

import typings.expoLinearGradient.anon.OnLayout
import typings.expoLinearGradient.anon.TypeofView
import typings.react.mod.ComponentProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Namespace)
@js.native
object nativeLinearGradientWebMod extends js.Object {
  val default: FunctionComponent[Props] = js.native
  type Point = js.Tuple2[Double, Double]
  type Props = OnLayout with ComponentProps[TypeofView]
}

