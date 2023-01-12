package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads asset. An asset can be an image, text, or video. Assets are deduplicated within a given customer account, so assets may be shared between different ads. */
trait Asset extends StObject {
  
  /** Returns image dimension info if this asset is an image, or null otherwise. */
  def getDimensions(): Dimensions | Null
  
  /** Returns the type of this entity as a String, in this case, "Asset". */
  def getEntityType(): String
  
  /** Returns the ID of the asset. */
  def getId(): Double
  
  /** Returns the image URL if this asset is an image, or null otherwise. */
  def getImageUrl(): String | Null
  
  /** Returns the name of the asset object, or null if the asset was created without a name. */
  def getName(): String | Null
  
  /** Returns asset text if this is a text asset, or null otherwise. */
  def getText(): String | Null
  
  /** Returns the asset object's type. */
  def getType(): String
  
  /** Returns the YouTube video ID if this asset is a YouTube video, or null otherwise. */
  def getYouTubeVideoId(): String | Null
}
object Asset {
  
  inline def apply(
    getDimensions: () => Dimensions | Null,
    getEntityType: () => String,
    getId: () => Double,
    getImageUrl: () => String | Null,
    getName: () => String | Null,
    getText: () => String | Null,
    getType: () => String,
    getYouTubeVideoId: () => String | Null
  ): Asset = {
    val __obj = js.Dynamic.literal(getDimensions = js.Any.fromFunction0(getDimensions), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getImageUrl = js.Any.fromFunction0(getImageUrl), getName = js.Any.fromFunction0(getName), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getYouTubeVideoId = js.Any.fromFunction0(getYouTubeVideoId))
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    inline def setGetDimensions(value: () => Dimensions | Null): Self = StObject.set(x, "getDimensions", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetImageUrl(value: () => String | Null): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String | Null): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String | Null): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetYouTubeVideoId(value: () => String | Null): Self = StObject.set(x, "getYouTubeVideoId", js.Any.fromFunction0(value))
  }
}
