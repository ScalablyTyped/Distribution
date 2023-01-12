package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  def getDimensions(): MediaDimensions
  
  def getFileSize(): Double
  
  def getId(): Double
  
  def getMimeType(): String
  
  def getName(): String
  
  def getReferenceId(): String
  
  def getSourceUrl(): String
  
  def getType(): MediaType
  
  def getUrls(): MediaUrls
  
  def getYouTubeVideoId(): String | Unit
}
object Media {
  
  inline def apply(
    getDimensions: () => MediaDimensions,
    getFileSize: () => Double,
    getId: () => Double,
    getMimeType: () => String,
    getName: () => String,
    getReferenceId: () => String,
    getSourceUrl: () => String,
    getType: () => MediaType,
    getUrls: () => MediaUrls,
    getYouTubeVideoId: () => String | Unit
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = js.Any.fromFunction0(getDimensions), getFileSize = js.Any.fromFunction0(getFileSize), getId = js.Any.fromFunction0(getId), getMimeType = js.Any.fromFunction0(getMimeType), getName = js.Any.fromFunction0(getName), getReferenceId = js.Any.fromFunction0(getReferenceId), getSourceUrl = js.Any.fromFunction0(getSourceUrl), getType = js.Any.fromFunction0(getType), getUrls = js.Any.fromFunction0(getUrls), getYouTubeVideoId = js.Any.fromFunction0(getYouTubeVideoId))
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    inline def setGetDimensions(value: () => MediaDimensions): Self = StObject.set(x, "getDimensions", js.Any.fromFunction0(value))
    
    inline def setGetFileSize(value: () => Double): Self = StObject.set(x, "getFileSize", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetMimeType(value: () => String): Self = StObject.set(x, "getMimeType", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetReferenceId(value: () => String): Self = StObject.set(x, "getReferenceId", js.Any.fromFunction0(value))
    
    inline def setGetSourceUrl(value: () => String): Self = StObject.set(x, "getSourceUrl", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => MediaType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetUrls(value: () => MediaUrls): Self = StObject.set(x, "getUrls", js.Any.fromFunction0(value))
    
    inline def setGetYouTubeVideoId(value: () => String | Unit): Self = StObject.set(x, "getYouTubeVideoId", js.Any.fromFunction0(value))
  }
}
