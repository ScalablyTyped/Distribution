package typings.expect.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", "spyOn")
@js.native
object spyOn extends js.Object {
  def apply[T](`object`: T, methodName: String): Spy[T] = js.native
}

