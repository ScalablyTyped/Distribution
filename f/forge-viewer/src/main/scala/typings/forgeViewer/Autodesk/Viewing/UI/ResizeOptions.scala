package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var maxHeight: Double
}
object ResizeOptions {
  
  @scala.inline
  def apply(maxHeight: Double): ResizeOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeOptions]
  }
  
  @scala.inline
  implicit class ResizeOptionsMutableBuilder[Self <: ResizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
  }
}
