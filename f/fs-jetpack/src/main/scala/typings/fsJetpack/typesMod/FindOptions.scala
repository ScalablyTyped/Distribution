package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOptions extends StObject {
  
  var directories: js.UndefOr[Boolean] = js.undefined
  
  var files: js.UndefOr[Boolean] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var matching: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object FindOptions {
  
  inline def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  extension [Self <: FindOptions](x: Self) {
    
    inline def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setMatching(value: String | js.Array[String]): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
    
    inline def setMatchingUndefined: Self = StObject.set(x, "matching", js.undefined)
    
    inline def setMatchingVarargs(value: String*): Self = StObject.set(x, "matching", js.Array(value :_*))
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
