package typings.expoDashLinearDashGradient

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/LinearGradient", JSImport.Namespace)
@js.native
object buildLinearGradientMod extends js.Object {
  @js.native
  trait LinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends LinearGradient
  
  /* static members */
  @js.native
  object default extends js.Object {
    var propTypes: Anon_AccessibilityActions = js.native
  }
  
  type Point = Anon_X | (js.Tuple2[Double, Double])
  type Props = Anon_Colors with ComponentProps[TypeofClassView]
}

