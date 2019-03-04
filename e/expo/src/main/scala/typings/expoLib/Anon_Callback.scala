package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var size: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    name: java.lang.String,
    callback: js.Function0[_] = null,
    description: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    version: java.lang.String = null
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(name = name)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (description != null) __obj.updateDynamic("description")(description)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Callback]
  }
}

