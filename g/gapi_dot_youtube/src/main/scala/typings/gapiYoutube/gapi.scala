package typings.gapiYoutube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.anon.AutoLevels
import typings.gapiYoutube.anon.ChannelType
import typings.gapiYoutube.anon.Chart
import typings.gapiYoutube.anon.ForChannelId
import typings.gapiYoutube.anon.ForUsername
import typings.gapiYoutube.anon.Hl
import typings.gapiYoutube.anon.Home
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.IdOnBehalfOfContentOwner
import typings.gapiYoutube.anon.MaxResults
import typings.gapiYoutube.anon.Mine
import typings.gapiYoutube.anon.OnBehalfOfContentOwner
import typings.gapiYoutube.anon.OnBehalfOfContentOwnerRating
import typings.gapiYoutube.anon.Part
import typings.gapiYoutube.anon.PartRequestBody
import typings.gapiYoutube.anon.RequestBody
import typings.gapiYoutube.anon.VideoId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object youtube {
      
      @js.native
      trait activities extends StObject {
        
        /**
          * Posts a bulletin for a specific channel.
          */
        def insert(`object`: Part): HttpRequest[GoogleApiYouTubeActivityResource] = js.native
        
        /**
          * Returns a list of channel activity events that match the request criteria.
          */
        def list(`object`: Home): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]] = js.native
      }
      object activities {
        
        @scala.inline
        def apply(
          insert: Part => HttpRequest[GoogleApiYouTubeActivityResource],
          list: Home => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
        ): activities = {
          val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[activities]
        }
        
        @scala.inline
        implicit class activitiesMutableBuilder[Self <: activities] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInsert(value: Part => HttpRequest[GoogleApiYouTubeActivityResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
          
          @scala.inline
          def setList(value: Home => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait channelBanners extends StObject {
        
        /**
          * Uploads a channel banner to YouTube.
          */
        def insert(`object`: OnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeChannelBannerResource] = js.native
      }
      object channelBanners {
        
        @scala.inline
        def apply(insert: OnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): channelBanners = {
          val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
          __obj.asInstanceOf[channelBanners]
        }
        
        @scala.inline
        implicit class channelBannersMutableBuilder[Self <: channelBanners] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInsert(value: OnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait channels extends StObject {
        
        /**
          * Returns a collection of zero or more channel resources that match the request criteria.
          */
        def list(`object`: ForUsername): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]] = js.native
        
        /**
          * Updates a channel's metadata.
          */
        def update(`object`: RequestBody): HttpRequest[GoogleApiYouTubeChannelResource] = js.native
      }
      object channels {
        
        @scala.inline
        def apply(
          list: ForUsername => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]],
          update: RequestBody => HttpRequest[GoogleApiYouTubeChannelResource]
        ): channels = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
          __obj.asInstanceOf[channels]
        }
        
        @scala.inline
        implicit class channelsMutableBuilder[Self <: channels] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: ForUsername => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
          
          @scala.inline
          def setUpdate(value: RequestBody => HttpRequest[GoogleApiYouTubeChannelResource]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait guideCategories extends StObject {
        
        /**
          * Returns a list of categories that can be associated with YouTube channels.
          */
        def list(`object`: Hl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]] = js.native
      }
      object guideCategories {
        
        @scala.inline
        def apply(list: Hl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]): guideCategories = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[guideCategories]
        }
        
        @scala.inline
        implicit class guideCategoriesMutableBuilder[Self <: guideCategories] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: Hl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait playlistItems extends StObject {
        
        /**
          * Deletes a playlist item.
          */
        def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
        
        /**
          * Adds a resource to a playlist.
          */
        def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
        
        /**
          * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
          */
        def list(`object`: MaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]] = js.native
        
        /**
          * Modifies a playlist item. For example, you could update the item's position in the playlist.
          */
        def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
      }
      object playlistItems {
        
        @scala.inline
        def apply(
          delete: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource],
          insert: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource],
          list: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]],
          update: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]
        ): playlistItems = {
          val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
          __obj.asInstanceOf[playlistItems]
        }
        
        @scala.inline
        implicit class playlistItemsMutableBuilder[Self <: playlistItems] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelete(value: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInsert(value: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
          
          @scala.inline
          def setList(
            value: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
          ): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
          
          @scala.inline
          def setUpdate(value: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait playlists extends StObject {
        
        /**
          * Deletes a playlist.
          */
        def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
        
        /**
          * Creates a playlist.
          */
        def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
        
        /**
          * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
          */
        def list(`object`: Mine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]] = js.native
        
        /**
          * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
          */
        def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
      }
      object playlists {
        
        @scala.inline
        def apply(
          delete: Id => HttpRequest[GoogleApiYouTubePlaylistResource],
          insert: Part => HttpRequest[GoogleApiYouTubePlaylistResource],
          list: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
          update: Part => HttpRequest[GoogleApiYouTubePlaylistResource]
        ): playlists = {
          val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
          __obj.asInstanceOf[playlists]
        }
        
        @scala.inline
        implicit class playlistsMutableBuilder[Self <: playlists] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelete(value: Id => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInsert(value: Part => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
          
          @scala.inline
          def setList(value: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
          
          @scala.inline
          def setUpdate(value: Part => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait search extends StObject {
        
        /**
          * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
          */
        def list(`object`: ChannelType): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]] = js.native
      }
      object search {
        
        @scala.inline
        def apply(list: ChannelType => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]): search = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[search]
        }
        
        @scala.inline
        implicit class searchMutableBuilder[Self <: search] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: ChannelType => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait subscriptions extends StObject {
        
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
        implicit class subscriptionsMutableBuilder[Self <: subscriptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelete(value: Id => HttpRequest[GoogleApiYouTubeSubscriptionResource]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInsert(value: PartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
          
          @scala.inline
          def setList(
            value: ForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
          ): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait thumbnails extends StObject {
        
        /**
          * Uploads a custom video thumbnail to YouTube and sets it for a video.
          */
        def set(`object`: VideoId): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]] = js.native
      }
      object thumbnails {
        
        @scala.inline
        def apply(set: VideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): thumbnails = {
          val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
          __obj.asInstanceOf[thumbnails]
        }
        
        @scala.inline
        implicit class thumbnailsMutableBuilder[Self <: thumbnails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSet(value: VideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait videoCategories extends StObject {
        
        /**
          * Returns a list of categories that can be associated with YouTube videos.
          */
        def list(`object`: Hl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]] = js.native
      }
      object videoCategories {
        
        @scala.inline
        def apply(list: Hl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]): videoCategories = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[videoCategories]
        }
        
        @scala.inline
        implicit class videoCategoriesMutableBuilder[Self <: videoCategories] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: Hl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait videos extends StObject {
        
        /**
          * Deletes a YouTube video.
          */
        def delete(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
        
        /**
          * Get user ratings for videos.
          */
        def getRating(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse] = js.native
        
        /**
          * Uploads a video to YouTube and optionally sets the video's metadata.
          */
        def insert(`object`: AutoLevels): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
        
        /**
          * Returns a list of videos that match the API request parameters.
          */
        def list(`object`: Chart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]] = js.native
        
        /**
          * Like, dislike, or remove rating from a video.
          */
        def rate(`object`: OnBehalfOfContentOwnerRating): HttpRequest[_] = js.native
        
        /**
          * Updates a video's metadata.
          */
        def update(`object`: RequestBody): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
      }
      object videos {
        
        @scala.inline
        def apply(
          delete: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource],
          getRating: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse],
          insert: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource],
          list: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]],
          rate: OnBehalfOfContentOwnerRating => HttpRequest[_],
          update: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]
        ): videos = {
          val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
          __obj.asInstanceOf[videos]
        }
        
        @scala.inline
        implicit class videosMutableBuilder[Self <: videos] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelete(value: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetRating(value: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]): Self = StObject.set(x, "getRating", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInsert(value: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
          
          @scala.inline
          def setList(value: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
          
          @scala.inline
          def setRate(value: OnBehalfOfContentOwnerRating => HttpRequest[_]): Self = StObject.set(x, "rate", js.Any.fromFunction1(value))
          
          @scala.inline
          def setUpdate(value: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
