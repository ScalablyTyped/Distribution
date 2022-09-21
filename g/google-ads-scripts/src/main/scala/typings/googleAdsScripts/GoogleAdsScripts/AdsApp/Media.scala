package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Google Ads media object. */
trait Media extends StObject {
  
  /** Returns a MediaDimensions instance for the media object if it is an image or video. */
  def getDimensions(): MediaDimensions
  
  /** Returns the type of this entity as a String, in this case, "Media". */
  def getEntityType(): String
  
  /** Returns the size of the media file in bytes. */
  def getFileSize(): Double
  
  /** Returns the ID of the media object. */
  def getId(): Double
  
  /** Returns a MIME type identifier for the media object. */
  def getMimeType(): String
  
  /** Returns the name of the media object, or null if the media was created without a name. */
  def getName(): String
  
  /** Returns the media object's reference ID key. */
  def getReferenceId(): String
  
  /** Returns the URL where the original media was downloaded from, or null if the media was not obtained via download. */
  def getSourceUrl(): String
  
  /** Returns the media object's type. */
  def getType(): String
  
  /** Returns a MediaUrls instance for the media object if it is an image. */
  def getUrls(): MediaUrls
  
  /** Returns the YouTube video ID if this media is a YouTube video, or null otherwise. */
  def getYouTubeVideoId(): String | Null
}
object Media {
  
  inline def apply(
    getDimensions: () => MediaDimensions,
    getEntityType: () => String,
    getFileSize: () => Double,
    getId: () => Double,
    getMimeType: () => String,
    getName: () => String,
    getReferenceId: () => String,
    getSourceUrl: () => String,
    getType: () => String,
    getUrls: () => MediaUrls,
    getYouTubeVideoId: () => String | Null
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = js.Any.fromFunction0(getDimensions), getEntityType = js.Any.fromFunction0(getEntityType), getFileSize = js.Any.fromFunction0(getFileSize), getId = js.Any.fromFunction0(getId), getMimeType = js.Any.fromFunction0(getMimeType), getName = js.Any.fromFunction0(getName), getReferenceId = js.Any.fromFunction0(getReferenceId), getSourceUrl = js.Any.fromFunction0(getSourceUrl), getType = js.Any.fromFunction0(getType), getUrls = js.Any.fromFunction0(getUrls), getYouTubeVideoId = js.Any.fromFunction0(getYouTubeVideoId))
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setGetDimensions(value: () => MediaDimensions): Self = StObject.set(x, "getDimensions", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetFileSize(value: () => Double): Self = StObject.set(x, "getFileSize", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetMimeType(value: () => String): Self = StObject.set(x, "getMimeType", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetReferenceId(value: () => String): Self = StObject.set(x, "getReferenceId", js.Any.fromFunction0(value))
    
    inline def setGetSourceUrl(value: () => String): Self = StObject.set(x, "getSourceUrl", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetUrls(value: () => MediaUrls): Self = StObject.set(x, "getUrls", js.Any.fromFunction0(value))
    
    inline def setGetYouTubeVideoId(value: () => String | Null): Self = StObject.set(x, "getYouTubeVideoId", js.Any.fromFunction0(value))
  }
}
