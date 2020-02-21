package typings.expect

import typings.expect.typesMod.Tester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIterableEquality extends js.Object {
  var iterableEquality: Tester
  var subsetEquality: Tester
}

object AnonIterableEquality {
  @scala.inline
  def apply(
    iterableEquality: (/* a */ js.Any, /* b */ js.Any) => js.UndefOr[Boolean],
    subsetEquality: (/* a */ js.Any, /* b */ js.Any) => js.UndefOr[Boolean]
  ): AnonIterableEquality = {
    val __obj = js.Dynamic.literal(iterableEquality = js.Any.fromFunction2(iterableEquality), subsetEquality = js.Any.fromFunction2(subsetEquality))
  
    __obj.asInstanceOf[AnonIterableEquality]
  }
}

