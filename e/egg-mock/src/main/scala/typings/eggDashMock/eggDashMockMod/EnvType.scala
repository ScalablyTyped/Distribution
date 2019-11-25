package typings.eggDashMock.eggDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eggDashMock.eggDashMockStrings.default
  - typings.eggDashMock.eggDashMockStrings.test
  - typings.eggDashMock.eggDashMockStrings.prod
  - typings.eggDashMock.eggDashMockStrings.local
  - typings.eggDashMock.eggDashMockStrings.unittest
*/
trait EnvType extends js.Object

object EnvType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.eggDashMock.eggDashMockStrings.default = this.cast("default")
  @scala.inline
  def local: typings.eggDashMock.eggDashMockStrings.local = this.cast("local")
  @scala.inline
  def prod: typings.eggDashMock.eggDashMockStrings.prod = this.cast("prod")
  @scala.inline
  def test: typings.eggDashMock.eggDashMockStrings.test = this.cast("test")
  @scala.inline
  def unittest: typings.eggDashMock.eggDashMockStrings.unittest = this.cast("unittest")
}

