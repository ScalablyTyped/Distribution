package typings
package freedomLib.freedomNs.PortControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Main interface for the module
@js.native
trait PortControl extends js.Object {
  def addMapping(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): stdLib.Promise[Mapping] = js.native
  def addMappingPcp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): stdLib.Promise[Mapping] = js.native
  def addMappingPmp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): stdLib.Promise[Mapping] = js.native
  def addMappingUpnp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double): stdLib.Promise[Mapping] = js.native
  def addMappingUpnp(intPort: scala.Double, extPort: scala.Double, lifetime: scala.Double, controlUrl: java.lang.String): stdLib.Promise[Mapping] = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def deleteMapping(extPort: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def deleteMappingPcp(extPort: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def deleteMappingPmp(extPort: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def deleteMappingUpnp(extPort: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def getActiveMappings(): stdLib.Promise[ActiveMappings] = js.native
  def getPrivateIps(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def probePcpSupport(): stdLib.Promise[scala.Boolean] = js.native
  def probePmpSupport(): stdLib.Promise[scala.Boolean] = js.native
  def probeProtocolSupport(): stdLib.Promise[ProtocolSupport] = js.native
  def probeUpnpSupport(): stdLib.Promise[scala.Boolean] = js.native
}

