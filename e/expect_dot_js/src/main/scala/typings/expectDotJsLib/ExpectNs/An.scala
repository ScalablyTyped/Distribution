package typings
package expectDotJsLib.ExpectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait An extends Assertion {
  /**
    * Assert typeof.
    */
  def apply(`type`: java.lang.String): Assertion = js.native
  /**
    * Assert instanceof.
    */
  def apply(`type`: js.Function): Assertion = js.native
}

