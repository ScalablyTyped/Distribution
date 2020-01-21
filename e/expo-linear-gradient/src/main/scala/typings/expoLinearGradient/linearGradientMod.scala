package typings.expoLinearGradient

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
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends LinearGradient
  
  /* static members */
  @js.native
  object default extends js.Object {
    var propTypes: AnonAccessibilityActions = js.native
  }
  
  type Point = AnonX | (js.Tuple2[Double, Double])
  type Props = AnonColors with ComponentProps[TypeofClassView]
}

