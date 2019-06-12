package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer
  /**
    * File mapping details, if available.
    */
  var file: js.UndefOr[FileMapping] = js.undefined
  /**
    * Protection.
    */
  var protection: PageProtection
  /**
    * Size in bytes.
    */
  var size: scala.Double
}

object RangeDetails {
  @scala.inline
  def apply(base: NativePointer, protection: PageProtection, size: scala.Double, file: FileMapping = null): RangeDetails = {
    val __obj = js.Dynamic.literal(base = base, protection = protection, size = size)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[RangeDetails]
  }
}

