package typings.domWebcodecs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTrackList
  extends StObject
     with /* index */ NumberDictionary[ImageTrack] {
  
  val length: Double
  
  val ready: js.Promise[Unit]
  
  val selectedIndex: Double
  
  val selectedTrack: ImageTrack | Null
}
object ImageTrackList {
  
  inline def apply(length: Double, ready: js.Promise[Unit], selectedIndex: Double): ImageTrackList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedTrack = null)
    __obj.asInstanceOf[ImageTrackList]
  }
  
  extension [Self <: ImageTrackList](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedTrack(value: ImageTrack): Self = StObject.set(x, "selectedTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectedTrackNull: Self = StObject.set(x, "selectedTrack", null)
  }
}
