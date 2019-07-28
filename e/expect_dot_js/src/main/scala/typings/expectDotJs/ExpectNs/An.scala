package typings.expectDotJs.ExpectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait An extends Assertion {
  /**
    * Assert typeof.
    */
  def apply(`type`: String): Assertion = js.native
  /**
    * Assert instanceof.
    */
  def apply(`type`: js.Function): Assertion = js.native
}

