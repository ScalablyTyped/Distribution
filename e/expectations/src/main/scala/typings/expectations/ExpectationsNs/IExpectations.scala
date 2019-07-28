package typings.expectations.ExpectationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpectations extends js.Object {
  def apply(value: js.Any): Expect = js.native
  def addAssertion(name: String, matcher: js.Function): Unit = js.native
}

