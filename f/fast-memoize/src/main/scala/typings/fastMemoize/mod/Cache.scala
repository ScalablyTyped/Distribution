package typings.fastMemoize.mod

import typings.fastMemoize.AnonGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[K, V] extends js.Object {
  @JSName("create")
  var create_Original: CacheCreateFunc[K, V] = js.native
  def create(): AnonGet[K, V] = js.native
}

