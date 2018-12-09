package typings
package freedomLib.freedomNs.PortControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Main interface for the module
@js.native
trait PortControl extends js.Object {
  def addMapping(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): js.Promise[Mapping] = js.native
  def addMappingPcp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): js.Promise[Mapping] = js.native
  def addMappingPmp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): js.Promise[Mapping] = js.native
  def addMappingUpnp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): js.Promise[Mapping] = js.native
  def addMappingUpnp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double, controlUrl: java.lang.String): js.Promise[Mapping] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def deleteMapping(extPort: scala.Double): js.Promise[scala.Boolean] = js.native
  def deleteMappingPcp(extPort: scala.Double): js.Promise[scala.Boolean] = js.native
  def deleteMappingPmp(extPort: scala.Double): js.Promise[scala.Boolean] = js.native
  def deleteMappingUpnp(extPort: scala.Double): js.Promise[scala.Boolean] = js.native
  def getActiveMappings(): js.Promise[ActiveMappings] = js.native
  def getPrivateIps(): js.Promise[js.Array[java.lang.String]] = js.native
  def probePcpSupport(): js.Promise[scala.Boolean] = js.native
  def probePmpSupport(): js.Promise[scala.Boolean] = js.native
  def probeProtocolSupport(): js.Promise[ProtocolSupport] = js.native
  def probeUpnpSupport(): js.Promise[scala.Boolean] = js.native
}

