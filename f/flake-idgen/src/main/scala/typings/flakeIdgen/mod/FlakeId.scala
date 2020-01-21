package typings.flakeIdgen.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlakeId extends js.Object {
  def next(): Buffer = js.native
  def next(callback: js.Function2[/* err */ Error, /* id */ Buffer, Unit]): Buffer = js.native
}

