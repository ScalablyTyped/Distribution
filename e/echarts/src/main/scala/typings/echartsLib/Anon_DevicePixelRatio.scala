package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DevicePixelRatio extends js.Object {
  var devicePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var renderer: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_DevicePixelRatio {
  @scala.inline
  def apply(
    devicePixelRatio: scala.Int | scala.Double = null,
    height: scala.Double | java.lang.String = null,
    renderer: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): Anon_DevicePixelRatio = {
    val __obj = js.Dynamic.literal()
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DevicePixelRatio]
  }
}

