package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludedPath extends StObject {
  
  var Indexes: js.Array[Index] = js.native
  
  /** Path to be indexed */
  var Path: String = js.native
}
object IncludedPath {
  
  @scala.inline
  def apply(Indexes: js.Array[Index], Path: String): IncludedPath = {
    val __obj = js.Dynamic.literal(Indexes = Indexes.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedPath]
  }
  
  @scala.inline
  implicit class IncludedPathMutableBuilder[Self <: IncludedPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexes(value: js.Array[Index]): Self = StObject.set(x, "Indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesVarargs(value: Index*): Self = StObject.set(x, "Indexes", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
