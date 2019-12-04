package typings.atEmberArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Index[T] extends js.Object {
  def apply(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], _]): js.UndefOr[T] = js.native
  def apply(
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], _],
    thisArg: js.Any
  ): js.UndefOr[T] = js.native
  def apply[S /* <: T */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ T, 
      /* index */ Double, 
      /* obj */ js.Array[T], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S] = js.native
  def apply[S /* <: T */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ T, 
      /* index */ Double, 
      /* obj */ js.Array[T], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S] = js.native
}

