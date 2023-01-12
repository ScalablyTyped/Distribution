package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTab extends StObject {
  
  /**
    * The content tab that users should display by default when viewers arrive at your channel page.
    */
  var defaultTab: String
  
  /**
    * The channel description, which appears in the channel information box on your channel page.
    */
  var description: String
  
  /**
    * The title that displays above the featured channels module.
    */
  var featuredChannelsTitle: String
  
  /**
    * A list of up to 16 channels that you would like to link to from the featured channels module. The property value is a list of YouTube channel ID values, each of which uniquely identifies a channel.
    */
  var featuredChannelsUrls: js.Array[String]
  
  /**
    * Keywords associated with your channel. The value is a comma-separated list of strings.
    */
  var keywords: String
  
  /**
    * This setting determines whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible. The default value is false.
    */
  var moderateComments: Boolean
  
  /**
    * This setting indicates whether the channel page should display content in a browse or feed view.
    */
  var showBrowseView: Boolean
  
  /**
    * This setting indicates whether YouTube should show an algorithmically generated list of related channels on your channel page.
    */
  var showRelatedChannels: Boolean
  
  /**
    * The channels title. The title has a maximum length of 30 characters.
    */
  var title: String
  
  /**
    * The ID for a Google Analytics account that you want to use to track and measure traffic to your channel.
    */
  var trackingAnalyticsAccountId: String
  
  /**
    * The video that should play in the featured video module in the channel pages browse view for unsubscribed viewers. Subscribed viewers may see a different view that highlights more recent channel activity.
    */
  var unsubscribedTrailer: String
}
object DefaultTab {
  
  inline def apply(
    defaultTab: String,
    description: String,
    featuredChannelsTitle: String,
    featuredChannelsUrls: js.Array[String],
    keywords: String,
    moderateComments: Boolean,
    showBrowseView: Boolean,
    showRelatedChannels: Boolean,
    title: String,
    trackingAnalyticsAccountId: String,
    unsubscribedTrailer: String
  ): DefaultTab = {
    val __obj = js.Dynamic.literal(defaultTab = defaultTab.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], featuredChannelsTitle = featuredChannelsTitle.asInstanceOf[js.Any], featuredChannelsUrls = featuredChannelsUrls.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], moderateComments = moderateComments.asInstanceOf[js.Any], showBrowseView = showBrowseView.asInstanceOf[js.Any], showRelatedChannels = showRelatedChannels.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackingAnalyticsAccountId = trackingAnalyticsAccountId.asInstanceOf[js.Any], unsubscribedTrailer = unsubscribedTrailer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultTab] (val x: Self) extends AnyVal {
    
    inline def setDefaultTab(value: String): Self = StObject.set(x, "defaultTab", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFeaturedChannelsTitle(value: String): Self = StObject.set(x, "featuredChannelsTitle", value.asInstanceOf[js.Any])
    
    inline def setFeaturedChannelsUrls(value: js.Array[String]): Self = StObject.set(x, "featuredChannelsUrls", value.asInstanceOf[js.Any])
    
    inline def setFeaturedChannelsUrlsVarargs(value: String*): Self = StObject.set(x, "featuredChannelsUrls", js.Array(value*))
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setModerateComments(value: Boolean): Self = StObject.set(x, "moderateComments", value.asInstanceOf[js.Any])
    
    inline def setShowBrowseView(value: Boolean): Self = StObject.set(x, "showBrowseView", value.asInstanceOf[js.Any])
    
    inline def setShowRelatedChannels(value: Boolean): Self = StObject.set(x, "showRelatedChannels", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrackingAnalyticsAccountId(value: String): Self = StObject.set(x, "trackingAnalyticsAccountId", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribedTrailer(value: String): Self = StObject.set(x, "unsubscribedTrailer", value.asInstanceOf[js.Any])
  }
}
