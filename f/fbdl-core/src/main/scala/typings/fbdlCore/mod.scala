package typings.fbdlCore

import typings.fbdlCore.anon.Angry
import typings.fbdlCore.anon.Avatar
import typings.fbdlCore.anon.Name
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fbdl-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Downloads facebook video
    */
  inline def download(url: String): js.Promise[Readable] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Readable]]
  
  /**
    * Fetches facebook video info
    */
  inline def getInfo(url: String): js.Promise[Response | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response | Null]]
  
  /**
    * Parses time in ms
    */
  inline def parseTime(duration: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTime")(duration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Validates facebook url
    */
  inline def validateURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Response extends StObject {
    
    var author: Name
    
    var comments: Double
    
    var description: String
    
    var duration: String
    
    var genre: String
    
    var height: Double
    
    var interactionCount: Double
    
    var keywords: js.Array[Any]
    
    var name: String
    
    var nsfw: Boolean
    
    var publishedAt: js.Date
    
    var publisher: Avatar
    
    var quality: String
    
    var rawVideo: String
    
    var reactions: Angry
    
    var shares: String
    
    var size: String
    
    var streamURL: String
    
    var thumbnail: String
    
    var title: String
    
    var uploadedAt: js.Date
    
    var url: String
    
    var views: String
    
    var width: Double
  }
  object Response {
    
    inline def apply(
      author: Name,
      comments: Double,
      description: String,
      duration: String,
      genre: String,
      height: Double,
      interactionCount: Double,
      keywords: js.Array[Any],
      name: String,
      nsfw: Boolean,
      publishedAt: js.Date,
      publisher: Avatar,
      quality: String,
      rawVideo: String,
      reactions: Angry,
      shares: String,
      size: String,
      streamURL: String,
      thumbnail: String,
      title: String,
      uploadedAt: js.Date,
      url: String,
      views: String,
      width: Double
    ): Response = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interactionCount = interactionCount.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nsfw = nsfw.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rawVideo = rawVideo.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], shares = shares.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], streamURL = streamURL.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uploadedAt = uploadedAt.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: Name): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInteractionCount(value: Double): Self = StObject.set(x, "interactionCount", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[Any]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: Any*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNsfw(value: Boolean): Self = StObject.set(x, "nsfw", value.asInstanceOf[js.Any])
      
      inline def setPublishedAt(value: js.Date): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
      
      inline def setPublisher(value: Avatar): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setRawVideo(value: String): Self = StObject.set(x, "rawVideo", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: Angry): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setShares(value: String): Self = StObject.set(x, "shares", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStreamURL(value: String): Self = StObject.set(x, "streamURL", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUploadedAt(value: js.Date): Self = StObject.set(x, "uploadedAt", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setViews(value: String): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
