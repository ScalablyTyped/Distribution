package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Network")
@js.native
class Network protected () extends StObject {
  def this(modem: js.Any, id: String) = this()
  
  var Type: String = js.native
  
  def connect(): js.Promise[js.Any] = js.native
  def connect(callback: Callback[js.Any]): Unit = js.native
  def connect(options: js.Object): js.Promise[js.Any] = js.native
  def connect(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def disconnect(): js.Promise[js.Any] = js.native
  def disconnect(callback: Callback[js.Any]): Unit = js.native
  def disconnect(options: js.Object): js.Promise[js.Any] = js.native
  def disconnect(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  var id: String = js.native
  
  def inspect(): js.Promise[js.Any] = js.native
  def inspect(callback: Callback[js.Any]): Unit = js.native
  
  var modem: js.Any = js.native
  
  def remove(): js.Promise[js.Any] = js.native
  def remove(callback: Callback[js.Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[js.Any] = js.native
  def remove(options: js.Object, callback: Callback[js.Any]): Unit = js.native
}
