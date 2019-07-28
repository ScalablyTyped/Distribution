package typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdmin.Anon_ActorIpAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: Anon_ActorIpAddress): Request[Activities]
  /** Push changes to activities */
  def watch(request: Anon_ActorIpAddress): Request[Channel]
}

object ActivitiesResource {
  @scala.inline
  def apply(list: Anon_ActorIpAddress => Request[Activities], watch: Anon_ActorIpAddress => Request[Channel]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

