package typings.dockerode.mod

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Service")
@js.native
class Service protected ()
  extends StObject
     with Meta {
  def this(modem: js.Any, id: String) = this()
  
  var Endpoint: js.UndefOr[typings.dockerode.mod.Endpoint] = js.native
  
  var ID: String = js.native
  
  var JobStatus: js.UndefOr[typings.dockerode.mod.JobStatus] = js.native
  
  var PreviousSpec: js.UndefOr[ServiceSpec] = js.native
  
  var ServiceStatus: js.UndefOr[typings.dockerode.mod.ServiceStatus] = js.native
  
  var Spec: js.UndefOr[ServiceSpec] = js.native
  
  var UpdateStatus: js.UndefOr[typings.dockerode.mod.UpdateStatus] = js.native
  
  var id: String = js.native
  
  def inspect(): js.Promise[js.Any] = js.native
  def inspect(callback: Callback[js.Any]): Unit = js.native
  
  def logs(): js.Promise[ReadableStream] = js.native
  def logs(callback: Callback[ReadableStream]): Unit = js.native
  def logs(options: ContainerLogsOptions): js.Promise[ReadableStream] = js.native
  def logs(options: ContainerLogsOptions, callback: Callback[ReadableStream]): Unit = js.native
  
  var modem: js.Any = js.native
  
  def remove(): js.Promise[js.Any] = js.native
  def remove(callback: Callback[js.Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[js.Any] = js.native
  def remove(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def update(options: js.Object): js.Promise[js.Any] = js.native
  def update(options: js.Object, callback: Callback[js.Any]): Unit = js.native
}
