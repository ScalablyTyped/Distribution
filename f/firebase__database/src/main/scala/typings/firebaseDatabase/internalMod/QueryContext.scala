package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryContext extends StObject {
  
  val _path: Path
  
  val _queryIdentifier: String
  
  val _queryObject: js.Object
  
  val _queryParams: QueryParams
  
  val _repo: Repo
}
object QueryContext {
  
  inline def apply(
    _path: Path,
    _queryIdentifier: String,
    _queryObject: js.Object,
    _queryParams: QueryParams,
    _repo: Repo
  ): QueryContext = {
    val __obj = js.Dynamic.literal(_path = _path.asInstanceOf[js.Any], _queryIdentifier = _queryIdentifier.asInstanceOf[js.Any], _queryObject = _queryObject.asInstanceOf[js.Any], _queryParams = _queryParams.asInstanceOf[js.Any], _repo = _repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
  
  extension [Self <: QueryContext](x: Self) {
    
    inline def set_path(value: Path): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_queryIdentifier(value: String): Self = StObject.set(x, "_queryIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_queryObject(value: js.Object): Self = StObject.set(x, "_queryObject", value.asInstanceOf[js.Any])
    
    inline def set_queryParams(value: QueryParams): Self = StObject.set(x, "_queryParams", value.asInstanceOf[js.Any])
    
    inline def set_repo(value: Repo): Self = StObject.set(x, "_repo", value.asInstanceOf[js.Any])
  }
}
