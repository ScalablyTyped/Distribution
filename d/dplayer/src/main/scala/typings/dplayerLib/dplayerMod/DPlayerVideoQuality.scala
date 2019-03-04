package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerVideoQuality extends js.Object {
  var name: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object DPlayerVideoQuality {
  @scala.inline
  def apply(name: java.lang.String, url: java.lang.String, `type`: java.lang.String = null): DPlayerVideoQuality = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DPlayerVideoQuality]
  }
}

