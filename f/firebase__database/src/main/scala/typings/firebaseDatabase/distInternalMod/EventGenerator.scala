package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EventGenerator is used to convert "raw" changes (Change) as computed by the
  * CacheDiffer into actual events (Event) that can be raised.  See generateEventsForChanges()
  * for details.
  *
  */
trait EventGenerator extends StObject {
  
  var index_ : Index
  
  var query_ : QueryContext
}
object EventGenerator {
  
  inline def apply(index_ : Index, query_ : QueryContext): EventGenerator = {
    val __obj = js.Dynamic.literal(index_ = index_.asInstanceOf[js.Any], query_ = query_.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventGenerator]
  }
  
  extension [Self <: EventGenerator](x: Self) {
    
    inline def setIndex_(value: Index): Self = StObject.set(x, "index_", value.asInstanceOf[js.Any])
    
    inline def setQuery_(value: QueryContext): Self = StObject.set(x, "query_", value.asInstanceOf[js.Any])
  }
}
