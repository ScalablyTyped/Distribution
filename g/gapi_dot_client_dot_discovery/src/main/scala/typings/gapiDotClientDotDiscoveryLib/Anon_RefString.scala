package typings
package gapiDotClientDotDiscoveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RefString extends js.Object {
  /** Schema ID for the response schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_RefString {
  @scala.inline
  def apply($ref: java.lang.String = null): Anon_RefString = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    __obj.asInstanceOf[Anon_RefString]
  }
}

