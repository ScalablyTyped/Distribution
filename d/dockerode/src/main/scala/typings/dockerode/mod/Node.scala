package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Node")
@js.native
class Node protected () extends StObject {
  def this(modem: js.Any, id: String) = this()
  
  var id: String = js.native
  
  def inspect(): js.Promise[js.Any] = js.native
  def inspect(callback: Callback[js.Any]): Unit = js.native
  
  var modem: js.Any = js.native
  
  def remove(): js.Promise[js.Any] = js.native
  def remove(callback: Callback[js.Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[js.Any] = js.native
  def remove(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def update(): js.Promise[js.Any] = js.native
  def update(callback: Callback[js.Any]): Unit = js.native
  def update(options: js.Object): js.Promise[js.Any] = js.native
  def update(options: js.Object, callback: Callback[js.Any]): Unit = js.native
}
