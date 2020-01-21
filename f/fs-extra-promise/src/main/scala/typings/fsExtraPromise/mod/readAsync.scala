package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "readAsync")
@js.native
object readAsync extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): ^[js.Tuple2[Double, Buffer]] = js.native
}

