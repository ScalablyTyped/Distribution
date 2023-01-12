package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Shared Excluded Placement. */
trait SharedExcludedPlacement extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "SharedExcludedPlacement". */
  def getEntityType(): String
  
  /** Returns the ExcludedPlacementList this placement is in. */
  def getExcludedPlacementList(): ExcludedPlacementList
  
  /** Returns the URL of the excluded placement. */
  def getUrl(): String
  
  /** Removes the shared excluded placement. */
  def remove(): Unit
}
object SharedExcludedPlacement {
  
  inline def apply(
    getEntityType: () => String,
    getExcludedPlacementList: () => ExcludedPlacementList,
    getUrl: () => String,
    remove: () => Unit
  ): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getExcludedPlacementList = js.Any.fromFunction0(getExcludedPlacementList), getUrl = js.Any.fromFunction0(getUrl), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedExcludedPlacement] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetExcludedPlacementList(value: () => ExcludedPlacementList): Self = StObject.set(x, "getExcludedPlacementList", js.Any.fromFunction0(value))
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
