package typings
package fsDashPromiseLib.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadJsonOptions extends js.Object {
  var encoding: java.lang.String
  var flag: js.UndefOr[java.lang.String] = js.undefined
  def reviver(key: js.Any, value: js.Any): js.Any
}

object ReadJsonOptions {
  @scala.inline
  def apply(encoding: java.lang.String, reviver: (js.Any, js.Any) => js.Any, flag: java.lang.String = null): ReadJsonOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding, reviver = js.Any.fromFunction2(reviver))
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[ReadJsonOptions]
  }
}

