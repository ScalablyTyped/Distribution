package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var size: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    name: String,
    callback: () => _ = null,
    description: String = null,
    size: Int | Double = null,
    version: String = null
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(name = name)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (description != null) __obj.updateDynamic("description")(description)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Callback]
  }
}

