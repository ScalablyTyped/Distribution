package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.ActivityId
import typings.gapiClientPlusdomains.anon.Alt
import typings.gapiClientPlusdomains.anon.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: ActivityId): Request[Activity] = js.native
  /** Create a new activity for the authenticated user. */
  def insert(request: Alt): Request[Activity] = js.native
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Collection): Request[ActivityFeed] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: ActivityId => Request[Activity],
    insert: Alt => Request[Activity],
    list: Collection => Request[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ActivitiesResource]
  }
  @scala.inline
  implicit class ActivitiesResourceOps[Self <: ActivitiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: ActivityId => Request[Activity]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Alt => Request[Activity]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Collection => Request[ActivityFeed]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

