package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var maxHeight: Double
}
object ResizeOptions {
  
  inline def apply(maxHeight: Double): ResizeOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeOptions]
  }
  
  extension [Self <: ResizeOptions](x: Self) {
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
  }
}
