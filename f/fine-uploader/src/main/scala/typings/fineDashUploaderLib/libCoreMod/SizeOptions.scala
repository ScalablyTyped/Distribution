package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeOptions extends js.Object {
  /**
    * maximum size
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * name property will be appended to the file name of the scaled file
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * MIME type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SizeOptions {
  @scala.inline
  def apply(
    maxSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): SizeOptions = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SizeOptions]
  }
}

