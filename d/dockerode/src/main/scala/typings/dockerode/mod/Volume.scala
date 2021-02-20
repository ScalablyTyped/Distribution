package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Volume")
@js.native
class Volume protected () extends StObject {
  def this(modem: js.Any, name: String) = this()
  
  def inspect(): js.Promise[VolumeInspectInfo] = js.native
  def inspect(callback: Callback[VolumeInspectInfo]): Unit = js.native
  
  var modem: js.Any = js.native
  
  var name: String = js.native
  
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): Unit = js.native
}
