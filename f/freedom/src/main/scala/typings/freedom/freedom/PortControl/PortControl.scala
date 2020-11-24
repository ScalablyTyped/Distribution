package typings.freedom.freedom.PortControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Main interface for the module
@js.native
trait PortControl extends js.Object {
  
  def addMapping(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
  
  def addMappingPcp(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
  
  def addMappingPmp(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
  
  def addMappingUpnp(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
  def addMappingUpnp(intPort: Double, extPort: Double, lifetime: Double, controlUrl: String): js.Promise[Mapping] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def deleteMapping(extPort: Double): js.Promise[Boolean] = js.native
  
  def deleteMappingPcp(extPort: Double): js.Promise[Boolean] = js.native
  
  def deleteMappingPmp(extPort: Double): js.Promise[Boolean] = js.native
  
  def deleteMappingUpnp(extPort: Double): js.Promise[Boolean] = js.native
  
  def getActiveMappings(): js.Promise[ActiveMappings] = js.native
  
  def getPrivateIps(): js.Promise[js.Array[String]] = js.native
  
  def probePcpSupport(): js.Promise[Boolean] = js.native
  
  def probePmpSupport(): js.Promise[Boolean] = js.native
  
  def probeProtocolSupport(): js.Promise[ProtocolSupport] = js.native
  
  def probeUpnpSupport(): js.Promise[Boolean] = js.native
}
