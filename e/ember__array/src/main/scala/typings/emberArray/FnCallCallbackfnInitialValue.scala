package typings.emberArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallCallbackfnInitialValue[T] extends js.Object {
  def apply(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): T = js.native
  def apply(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
}

