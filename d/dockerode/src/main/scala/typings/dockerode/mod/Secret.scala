package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Secret")
@js.native
class Secret protected ()
  extends StObject
     with Meta {
  def this(modem: js.Any, id: String) = this()
  
  var ID: String = js.native
  
  var Spec: js.UndefOr[SecretSpec] = js.native
  
  var id: String = js.native
  
  def inspect(): js.Promise[Secret] = js.native
  def inspect(callback: Callback[Secret]): Unit = js.native
  
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
