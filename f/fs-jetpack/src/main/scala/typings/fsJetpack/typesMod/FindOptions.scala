package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOptions extends StObject {
  
  var directories: js.UndefOr[Boolean] = js.native
  
  var files: js.UndefOr[Boolean] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var matching: js.UndefOr[String | js.Array[String]] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  @scala.inline
  implicit class FindOptionsMutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setMatching(value: String | js.Array[String]): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingUndefined: Self = StObject.set(x, "matching", js.undefined)
    
    @scala.inline
    def setMatchingVarargs(value: String*): Self = StObject.set(x, "matching", js.Array(value :_*))
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
