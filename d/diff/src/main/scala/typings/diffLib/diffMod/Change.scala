package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * `true` if the value was inserted into the new string.
    */
  var added: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * `true` if the value was removed from the old string.
    */
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text content.
    */
  var value: java.lang.String
}

