package typings
package feedparserLib.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enclosure extends js.Object {
  var length: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Enclosure {
  @scala.inline
  def apply(url: java.lang.String, length: java.lang.String = null, `type`: java.lang.String = null): Enclosure = {
    val __obj = js.Dynamic.literal(url = url)
    if (length != null) __obj.updateDynamic("length")(length)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Enclosure]
  }
}

