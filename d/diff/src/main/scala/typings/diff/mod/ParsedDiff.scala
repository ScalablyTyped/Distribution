package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedDiff extends StObject {
  
  var hunks: js.Array[Hunk]
  
  var index: js.UndefOr[String] = js.undefined
  
  var newFileName: js.UndefOr[String] = js.undefined
  
  var newHeader: js.UndefOr[String] = js.undefined
  
  var oldFileName: js.UndefOr[String] = js.undefined
  
  var oldHeader: js.UndefOr[String] = js.undefined
}
object ParsedDiff {
  
  inline def apply(hunks: js.Array[Hunk]): ParsedDiff = {
    val __obj = js.Dynamic.literal(hunks = hunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDiff]
  }
  
  extension [Self <: ParsedDiff](x: Self) {
    
    inline def setHunks(value: js.Array[Hunk]): Self = StObject.set(x, "hunks", value.asInstanceOf[js.Any])
    
    inline def setHunksVarargs(value: Hunk*): Self = StObject.set(x, "hunks", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNewFileName(value: String): Self = StObject.set(x, "newFileName", value.asInstanceOf[js.Any])
    
    inline def setNewFileNameUndefined: Self = StObject.set(x, "newFileName", js.undefined)
    
    inline def setNewHeader(value: String): Self = StObject.set(x, "newHeader", value.asInstanceOf[js.Any])
    
    inline def setNewHeaderUndefined: Self = StObject.set(x, "newHeader", js.undefined)
    
    inline def setOldFileName(value: String): Self = StObject.set(x, "oldFileName", value.asInstanceOf[js.Any])
    
    inline def setOldFileNameUndefined: Self = StObject.set(x, "oldFileName", js.undefined)
    
    inline def setOldHeader(value: String): Self = StObject.set(x, "oldHeader", value.asInstanceOf[js.Any])
    
    inline def setOldHeaderUndefined: Self = StObject.set(x, "oldHeader", js.undefined)
  }
}
