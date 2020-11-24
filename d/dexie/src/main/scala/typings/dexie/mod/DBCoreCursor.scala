package typings.dexie.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreCursor extends js.Object {
  
  def advance(count: Double): Unit = js.native
  
  def continue(): Unit = js.native
  def continue(key: js.Any): Unit = js.native
  
  def continuePrimaryKey(key: js.Any, primaryKey: js.Any): Unit = js.native
  
  val done: js.UndefOr[Boolean] = js.native
  
  def fail(error: Error): Unit = js.native
  
  val key: js.Any = js.native
  
  def next(): js.Promise[DBCoreCursor] = js.native
  
  val primaryKey: js.Any = js.native
  
  def start(onNext: js.Function0[Unit]): js.Promise[_] = js.native
  
  def stop(): Unit = js.native
  def stop(value: js.Any): Unit = js.native
  def stop(value: js.Promise[_]): Unit = js.native
  
  val trans: DBCoreTransaction = js.native
  
  val value: js.UndefOr[js.Any] = js.native
}
