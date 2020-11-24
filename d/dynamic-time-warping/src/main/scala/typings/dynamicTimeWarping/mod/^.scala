package typings.dynamicTimeWarping.mod

import typings.dynamicTimeWarping.mod.global.DynamicTimeWarping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynamic-time-warping", JSImport.Namespace)
@js.native
class ^[T] protected () extends DynamicTimeWarping[T] {
  def this(ser1: js.Array[T], ser2: js.Array[T], distFunc: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}
