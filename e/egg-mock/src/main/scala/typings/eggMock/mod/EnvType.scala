package typings.eggMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eggMock.eggMockStrings.default
  - typings.eggMock.eggMockStrings.test
  - typings.eggMock.eggMockStrings.prod
  - typings.eggMock.eggMockStrings.local
  - typings.eggMock.eggMockStrings.unittest
*/
trait EnvType extends js.Object

object EnvType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.eggMock.eggMockStrings.default = this.cast("default")
  @scala.inline
  def local: typings.eggMock.eggMockStrings.local = this.cast("local")
  @scala.inline
  def prod: typings.eggMock.eggMockStrings.prod = this.cast("prod")
  @scala.inline
  def test: typings.eggMock.eggMockStrings.test = this.cast("test")
  @scala.inline
  def unittest: typings.eggMock.eggMockStrings.unittest = this.cast("unittest")
}

