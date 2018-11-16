package typings
package expectationsLib.ExpectationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpectations extends js.Object {
  def apply(value: js.Any): Expect = js.native
  def addAssertion(name: java.lang.String, matcher: js.Function): scala.Unit = js.native
}

