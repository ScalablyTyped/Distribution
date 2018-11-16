package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>An instantiation of an Ethernet network adaptor</p>
* 
* @url http://www.espruino.com/Reference#Ethernet
*/
@js.native
trait Ethernet
  extends /**
     * 
     * @return  
     */
ScalablyTyped.runtime.Instantiable0[Ethernet] {
  /**
       * <p>Get the current IP address, subnet, gateway and mac address.</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Ethernet_getIP
       */
  def getIP(): js.Any = js.native
  /**
       * <p>Set the current IP address or get an IP from DHCP (if no options object is specified)</p>
       * <p>If &#39;mac&#39; is specified as an option, it must be a string of the form <code>&quot;00:01:02:03:04:05&quot;</code></p>
       * 
       * @param options 
       * @return  
       * @url http://www.espruino.com/Reference#l_Ethernet_setIP
       */
  def setIP(options: js.Any): scala.Boolean = js.native
}

