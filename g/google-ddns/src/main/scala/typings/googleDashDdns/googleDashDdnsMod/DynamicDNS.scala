package typings.googleDashDdns.googleDashDdnsMod

import typings.googleDashDdns.googleDashDdnsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-ddns", "DynamicDNS")
@js.native
class DynamicDNS protected () extends js.Object {
  def this(options: DynamicDNSOptions) = this()
  /**
    * Gets the current IP address in the DNS record.
    * @returns a Promise resolving with the IP or rejecting with an error object `{error: message}`
    */
  def getCurrentIP(): js.Promise[String] = js.native
  /**
    * Gets the public IP address of the network hosting this application.
    * @returns a Promise resolving with the IP or rejecting with an error object `{error: message}`
    */
  def getPublicIP(): js.Promise[String] = js.native
  /**
    * Synchronizes the DNS IP address with the current public IP address.
    * Compares the current public IP address against the DNS record for
    * the domain, and updates the record if they differ.
    * @param force Send an update request without checking whether
    * the current DNS and public IPs differ.
    * @returns `Promise<true>` if the public IP address and the IP address
    * in the DNS record are the same and no sync was attempted. Otherwise
    * returns a Promise of an object with response data. Error responses
    * are rejected.
    */
  def sync(): js.Promise[`true` | SuccessResponse] = js.native
  def sync(force: Boolean): js.Promise[`true` | SuccessResponse] = js.native
}

