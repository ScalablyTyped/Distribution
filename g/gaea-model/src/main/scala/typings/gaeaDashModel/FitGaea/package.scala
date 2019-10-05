package typings.gaeaDashModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FitGaea {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState

  type Component = ComponentClass[ComponentProps, ComponentState]
  type ComponentPropsOptionValue = Double | String | Boolean | js.Array[ComponentPropsOptionsArrayValue] | js.Any
}
