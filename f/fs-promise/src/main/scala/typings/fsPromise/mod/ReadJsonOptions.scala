package typings.fsPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadJsonOptions extends js.Object {
  var encoding: String
  var flag: js.UndefOr[String] = js.undefined
  def reviver(key: js.Any, value: js.Any): js.Any
}

object ReadJsonOptions {
  @scala.inline
  def apply(encoding: String, reviver: (js.Any, js.Any) => js.Any, flag: String = null): ReadJsonOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], reviver = js.Any.fromFunction2(reviver))
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJsonOptions]
  }
}

