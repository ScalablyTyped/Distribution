package typings
package expectLib.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", "Expectation")
@js.native
class Expectation[T] protected ()
  extends expectLib.expectMod.expectNs.Expectation[T] {
  def this(actual: js.Any) = this()
}

