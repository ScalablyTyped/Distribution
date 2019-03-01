package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  /** @default "GET" */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Callback to invoke when request is completed */
  var onComplete: js.Function
}

object Anon_Method {
  @scala.inline
  def apply(onComplete: js.Function, method: java.lang.String = null): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_Method]
  }
}

