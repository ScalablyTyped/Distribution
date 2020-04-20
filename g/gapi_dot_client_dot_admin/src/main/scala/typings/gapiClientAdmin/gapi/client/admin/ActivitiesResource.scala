package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdmin.AnonActorIpAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: AnonActorIpAddress): Request_[Activities]
  /** Push changes to activities */
  def watch(request: AnonActorIpAddress): Request_[Channel]
}

object ActivitiesResource {
  @scala.inline
  def apply(list: AnonActorIpAddress => Request_[Activities], watch: AnonActorIpAddress => Request_[Channel]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

