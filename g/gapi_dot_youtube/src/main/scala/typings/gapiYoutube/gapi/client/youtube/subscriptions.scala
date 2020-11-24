package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeSubscriptionResource
import typings.gapiYoutube.anon.ForChannelId
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.PartRequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait subscriptions extends js.Object {
  
  /**
    * Deletes a subscription.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubeSubscriptionResource] = js.native
  
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: PartRequestBody): HttpRequest[GoogleApiYouTubeSubscriptionResource] = js.native
  
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: ForChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]] = js.native
}
object subscriptions {
  
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    insert: PartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    list: ForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
  ): subscriptions = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[subscriptions]
  }
  
  @scala.inline
  implicit class subscriptionsOps[Self <: subscriptions] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: Id => HttpRequest[GoogleApiYouTubeSubscriptionResource]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: PartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(
      value: ForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
    ): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
