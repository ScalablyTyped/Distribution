package typings.dnssd.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "Service")
@js.native
class Service () extends js.Object {
               // 8009
  var addresses: js.Array[String] = js.native
          // { name: 'googlecast'; protocol: 'tcp' }
  var domain: String = js.native
  var fullname: String = js.native
             // 'local'
  var host: String = js.native
           // 'InstanceName._googlecast._tcp.local.'
  var name: String = js.native
               // 'Hostname.local.'
  var port: Double = js.native
        // ['192.168.1.15']
  var txt: js.Any = js.native
                   // { id: 'strings' }
  var txtRaw: js.Any = js.native
               // 'InstanceName'
  var `type`: ServiceType = js.native
}

