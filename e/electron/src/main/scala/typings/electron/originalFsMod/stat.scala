package typings.electron.originalFsMod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "stat")
@js.native
object stat extends js.Object {
  
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BigIntOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.BigIntStats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats, 
      Unit
    ]
  ): Unit = js.native
}
