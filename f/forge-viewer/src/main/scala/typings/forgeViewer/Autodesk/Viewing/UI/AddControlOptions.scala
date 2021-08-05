package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddControlOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var index: js.UndefOr[js.Object] = js.undefined
}
object AddControlOptions {
  
  inline def apply(): AddControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddControlOptions]
  }
  
  extension [Self <: AddControlOptions](x: Self) {
    
    inline def setIndex(value: js.Object): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
