package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoPath extends StObject {
  
  var data: js.UndefOr[js.Array[String]] = js.undefined
  
  var home: String
  
  var logs: String
  
  var repo: js.Array[String]
}
object NodesInfoNodeInfoPath {
  
  inline def apply(home: String, logs: String, repo: js.Array[String]): NodesInfoNodeInfoPath = {
    val __obj = js.Dynamic.literal(home = home.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoPath] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHome(value: String): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
    
    inline def setLogs(value: String): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: js.Array[String]): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoVarargs(value: String*): Self = StObject.set(x, "repo", js.Array(value*))
  }
}
