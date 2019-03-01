package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IfGenerationMatch extends js.Object {
  /**
    * Only perform the composition if the generation of the source object that would be used matches this value. If this value and a generation are both
    * specified, they must be the same value or the call will fail.
    */
  var ifGenerationMatch: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IfGenerationMatch {
  @scala.inline
  def apply(ifGenerationMatch: java.lang.String = null): Anon_IfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch)
    __obj.asInstanceOf[Anon_IfGenerationMatch]
  }
}

