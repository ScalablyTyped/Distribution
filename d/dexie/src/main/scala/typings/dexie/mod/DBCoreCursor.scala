package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreCursor extends StObject {
  
  def advance(count: Double): Unit = js.native
  
  def continue(): Unit = js.native
  def continue(key: Any): Unit = js.native
  
  def continuePrimaryKey(key: Any, primaryKey: Any): Unit = js.native
  
  val done: js.UndefOr[Boolean] = js.native
  
  def fail(error: js.Error): Unit = js.native
  
  val key: Any = js.native
  
  def next(): js.Promise[DBCoreCursor] = js.native
  
  val primaryKey: Any = js.native
  
  def start(onNext: js.Function0[Unit]): js.Promise[Any] = js.native
  
  def stop(): Unit = js.native
  def stop(value: js.Promise[Any]): Unit = js.native
  def stop(value: Any): Unit = js.native
  
  val trans: DBCoreTransaction = js.native
  
  val value: js.UndefOr[Any] = js.native
}
