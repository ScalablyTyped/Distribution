package typings.ethersprojectNetworks

import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/networks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNetwork(network: Networkish): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetwork")(network.asInstanceOf[js.Any]).asInstanceOf[Network]
}
