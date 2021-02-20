package typings.gapiYoutube

import typings.gapiYoutube.anon.ChannelIdChannelTitle
import typings.gapiYoutube.anon.ChannelIdDescription
import typings.gapiYoutube.anon.NewItemCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeSubscriptionResource extends StObject {
  
  /**
    *
    */
  var contentDetails: NewItemCount = js.native
  
  /**
    * The ETag of the subscription resource.
    */
  var etag: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: String = js.native
  
  /**
    * The type of the API resource. For subscription resources, the value will be youtube#subscription.
    */
  var kind: String = js.native
  
  /**
    * The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to.
    */
  var snippet: ChannelIdChannelTitle = js.native
  
  /**
    *
    */
  var subscriberSnippet: ChannelIdDescription = js.native
}
object GoogleApiYouTubeSubscriptionResource {
  
  @scala.inline
  def apply(
    contentDetails: NewItemCount,
    etag: String,
    id: String,
    kind: String,
    snippet: ChannelIdChannelTitle,
    subscriberSnippet: ChannelIdDescription
  ): GoogleApiYouTubeSubscriptionResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], subscriberSnippet = subscriberSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSubscriptionResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeSubscriptionResourceMutableBuilder[Self <: GoogleApiYouTubeSubscriptionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: NewItemCount): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: ChannelIdChannelTitle): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberSnippet(value: ChannelIdDescription): Self = StObject.set(x, "subscriberSnippet", value.asInstanceOf[js.Any])
  }
}
