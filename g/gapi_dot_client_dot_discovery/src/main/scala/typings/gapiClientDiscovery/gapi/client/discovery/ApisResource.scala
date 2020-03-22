package typings.gapiClientDiscovery.gapi.client.discovery

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDiscovery.AnonAlt
import typings.gapiClientDiscovery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: AnonAlt): Request_[RestDescription]
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: AnonFields): Request_[DirectoryList]
}

object ApisResource {
  @scala.inline
  def apply(getRest: AnonAlt => Request_[RestDescription], list: AnonFields => Request_[DirectoryList]): ApisResource = {
    val __obj = js.Dynamic.literal(getRest = js.Any.fromFunction1(getRest), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ApisResource]
  }
}

