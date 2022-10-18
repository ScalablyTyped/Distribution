package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends StObject {
  
  var abortReason: String | Null = js.native
  
  var applyLocally: Boolean = js.native
  
  var currentInputSnapshot: Node2 | Null = js.native
  
  var currentOutputSnapshotRaw: Node2 | Null = js.native
  
  var currentOutputSnapshotResolved: Node2 | Null = js.native
  
  var currentWriteId: Double = js.native
  
  def onComplete(error: js.Error, committed: Boolean): Unit = js.native
  def onComplete(error: js.Error, committed: Boolean, node: Node2): Unit = js.native
  def onComplete(error: Null, committed: Boolean): Unit = js.native
  def onComplete(error: Null, committed: Boolean, node: Node2): Unit = js.native
  
  var order: Double = js.native
  
  var path: Path = js.native
  
  var retryCount: Double = js.native
  
  var status: TransactionStatus = js.native
  
  def unwatcher(): Unit = js.native
  
  def update(a: Any): Any = js.native
}
