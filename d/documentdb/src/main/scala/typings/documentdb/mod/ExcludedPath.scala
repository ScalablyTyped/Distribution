package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedPath extends StObject {
  
  var Path: String
}
object ExcludedPath {
  
  @scala.inline
  def apply(Path: String): ExcludedPath = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedPath]
  }
  
  @scala.inline
  implicit class ExcludedPathMutableBuilder[Self <: ExcludedPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
