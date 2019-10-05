package typings.gapiDotClientDotDiscovery.gapi.client.discovery

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDiscovery.Anon_Alt
import typings.gapiDotClientDotDiscovery.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: Anon_Alt): Request[RestDescription]
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: Anon_AltFields): Request[DirectoryList]
}

object ApisResource {
  @scala.inline
  def apply(getRest: Anon_Alt => Request[RestDescription], list: Anon_AltFields => Request[DirectoryList]): ApisResource = {
    val __obj = js.Dynamic.literal(getRest = js.Any.fromFunction1(getRest), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ApisResource]
  }
}

