package typings.glob.anon

import typings.node.NodeJS.ErrnoException
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflstat extends StObject {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
  ): Unit = js.native
}
