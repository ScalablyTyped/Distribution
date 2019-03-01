package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneChildContainer extends js.Object {
  /** The zone's nickname for the child container. */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /** The child container's public id. */
  var publicId: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneChildContainer {
  @scala.inline
  def apply(nickname: java.lang.String = null, publicId: java.lang.String = null): ZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (publicId != null) __obj.updateDynamic("publicId")(publicId)
    __obj.asInstanceOf[ZoneChildContainer]
  }
}

