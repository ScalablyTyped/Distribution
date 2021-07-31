package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedExcludedPlacement
  extends StObject
     with AdWordsEntity {
  
  def getExcludedPlacementList(): ExcludedPlacementList
  
  def getUrl(): String
  
  def remove(): Unit
}
object SharedExcludedPlacement {
  
  @scala.inline
  def apply(getExcludedPlacementList: () => ExcludedPlacementList, getUrl: () => String, remove: () => Unit): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getExcludedPlacementList = js.Any.fromFunction0(getExcludedPlacementList), getUrl = js.Any.fromFunction0(getUrl), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
  
  @scala.inline
  implicit class SharedExcludedPlacementMutableBuilder[Self <: SharedExcludedPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExcludedPlacementList(value: () => ExcludedPlacementList): Self = StObject.set(x, "getExcludedPlacementList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
