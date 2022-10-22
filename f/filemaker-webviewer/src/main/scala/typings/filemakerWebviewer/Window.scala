package typings.filemakerWebviewer

import typings.filemakerWebviewer.anon.PerformScript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var FileMaker: js.UndefOr[PerformScript] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setFileMaker(value: PerformScript): Self = StObject.set(x, "FileMaker", value.asInstanceOf[js.Any])
    
    inline def setFileMakerUndefined: Self = StObject.set(x, "FileMaker", js.undefined)
  }
}
