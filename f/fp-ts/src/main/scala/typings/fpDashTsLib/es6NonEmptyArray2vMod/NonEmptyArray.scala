package typings
package fpDashTsLib.es6NonEmptyArray2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonEmptyArray[A]
  extends fpDashTsLib.libArrayMod.Global.Array[A] {
  var `0`: A
  def concat(as: fpDashTsLib.libArrayMod.Global.Array[A]): NonEmptyArray[A]
  def map[B](f: js.Function3[/* a */ A, /* index */ scala.Double, /* nea */ NonEmptyArray[A], B]): NonEmptyArray[B]
}

object NonEmptyArray {
  @scala.inline
  def apply[A](
    `0`: A,
    _A: A,
    _URI: fpDashTsLib.libArrayMod.URI,
    concat: fpDashTsLib.libArrayMod.Global.Array[A] => NonEmptyArray[A],
    map: js.Function3[/* a */ A, /* index */ scala.Double, /* nea */ NonEmptyArray[A], js.Any] => NonEmptyArray[js.Any]
  ): NonEmptyArray[A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _URI = _URI, concat = js.Any.fromFunction1(concat), map = js.Any.fromFunction1(map))
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonEmptyArray[A]]
  }
}

