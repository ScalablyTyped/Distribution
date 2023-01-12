package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeProcessInfo extends StObject {
  
  var id: long
  
  var mlockall: Boolean
  
  var refresh_interval_in_millis: DurationValue[UnitMillis]
}
object NodesInfoNodeProcessInfo {
  
  inline def apply(id: long, mlockall: Boolean, refresh_interval_in_millis: DurationValue[UnitMillis]): NodesInfoNodeProcessInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mlockall = mlockall.asInstanceOf[js.Any], refresh_interval_in_millis = refresh_interval_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeProcessInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeProcessInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: long): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMlockall(value: Boolean): Self = StObject.set(x, "mlockall", value.asInstanceOf[js.Any])
    
    inline def setRefresh_interval_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "refresh_interval_in_millis", value.asInstanceOf[js.Any])
  }
}
