package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionRequestVersionOptions extends js.Object {
  /** The name of the container version to be created. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The notes of the container version to be created. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
}

object CreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(name: java.lang.String = null, notes: java.lang.String = null): CreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
  }
}

