package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryContext extends StObject {
  
  val _path: Path
  
  val _queryIdentifier: String
  
  val _queryObject: js.Object
  
  val _queryParams: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _QueryParams */ Any
  
  val _repo: Repo
}
object QueryContext {
  
  inline def apply(
    _path: Path,
    _queryIdentifier: String,
    _queryObject: js.Object,
    _queryParams: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _QueryParams */ Any,
    _repo: Repo
  ): QueryContext = {
    val __obj = js.Dynamic.literal(_path = _path.asInstanceOf[js.Any], _queryIdentifier = _queryIdentifier.asInstanceOf[js.Any], _queryObject = _queryObject.asInstanceOf[js.Any], _queryParams = _queryParams.asInstanceOf[js.Any], _repo = _repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryContext] (val x: Self) extends AnyVal {
    
    inline def set_path(value: Path): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_queryIdentifier(value: String): Self = StObject.set(x, "_queryIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_queryObject(value: js.Object): Self = StObject.set(x, "_queryObject", value.asInstanceOf[js.Any])
    
    inline def set_queryParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _QueryParams */ Any
    ): Self = StObject.set(x, "_queryParams", value.asInstanceOf[js.Any])
    
    inline def set_repo(value: Repo): Self = StObject.set(x, "_repo", value.asInstanceOf[js.Any])
  }
}
