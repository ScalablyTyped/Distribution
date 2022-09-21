package typings.ejWebAll.global.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Model")
@js.native
open class Model protected ()
  extends StObject
     with typings.ejWebAll.ej.Model {
  def this(json: Any, table: String, name: String) = this()
  
  /* CompleteClass */
  override def bindTo(element: Any): Unit = js.native
  
  /* CompleteClass */
  override def changeState(state: Boolean, args: Any): Unit = js.native
  
  /* CompleteClass */
  override def computes(value: Any): Unit = js.native
  
  /* CompleteClass */
  var formElements: js.Array[String] = js.native
  
  /* CompleteClass */
  override def get(field: String): Any = js.native
  
  /* CompleteClass */
  override def markCommit(): Unit = js.native
  
  /* CompleteClass */
  override def markDelete(): Unit = js.native
  
  /* CompleteClass */
  override def off(eventName: String, handler: Any): Unit = js.native
  
  /* CompleteClass */
  override def on(eventName: String, handler: Any): Unit = js.native
  
  /* CompleteClass */
  override def properties(): Any = js.native
  
  /* CompleteClass */
  override def revert(suspendEvent: Any): Unit = js.native
  
  /* CompleteClass */
  override def save(dm: typings.ejWebAll.ej.DataManager, key: String): Unit = js.native
  
  /* CompleteClass */
  override def set(field: String, value: Any): Unit = js.native
  
  /* CompleteClass */
  override def unbind(element: Any): Unit = js.native
}
