package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMenuPropsOptions
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] {
  var refKey: js.UndefOr[java.lang.String] = js.undefined
}

object GetMenuPropsOptions {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] = null,
    refKey: java.lang.String = null
  ): GetMenuPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey)
    __obj.asInstanceOf[GetMenuPropsOptions]
  }
}

