package typings.fsDashMerger.fsDashMergerMod

import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends FSMerger {
  @JSName("existsSync")
  var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
  @JSName("lstatSync")
  var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  def existsSync(path: PathLike): Boolean = js.native
  def lstatSync(path: PathLike): Stats = js.native
  def statSync(path: PathLike): Stats = js.native
}

