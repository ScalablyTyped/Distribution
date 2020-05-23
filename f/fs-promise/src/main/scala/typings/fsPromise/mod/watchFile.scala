package typings.fsPromise.mod

import typings.mz.anon.Interval
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "watchFile")
@js.native
object watchFile extends js.Object {
  def apply(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def apply(
    filename: PathLike,
    options: js.UndefOr[Interval | typings.node.anon.Interval],
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
}

