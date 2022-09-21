package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Secret")
@js.native
open class Secret protected ()
  extends StObject
     with Meta {
  def this(modem: Any, id: String) = this()
  
  var ID: String = js.native
  
  var Spec: js.UndefOr[SecretSpec] = js.native
  
  var id: String = js.native
  
  def inspect(): js.Promise[Secret] = js.native
  def inspect(callback: Callback[Secret]): Unit = js.native
  def inspect(options: js.Object): js.Promise[Secret] = js.native
  def inspect(options: js.Object, callback: Callback[Secret]): Unit = js.native
  
  var modem: Any = js.native
  
  def remove(): js.Promise[Any] = js.native
  def remove(callback: Callback[Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[Any] = js.native
  def remove(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def update(): js.Promise[Any] = js.native
  def update(callback: Callback[Any]): Unit = js.native
  def update(options: js.Object): js.Promise[Any] = js.native
  def update(options: js.Object, callback: Callback[Any]): Unit = js.native
}
