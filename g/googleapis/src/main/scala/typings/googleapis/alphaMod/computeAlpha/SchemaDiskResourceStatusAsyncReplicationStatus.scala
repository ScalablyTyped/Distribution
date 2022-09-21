package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskResourceStatusAsyncReplicationStatus extends StObject {
  
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiskResourceStatusAsyncReplicationStatus {
  
  inline def apply(): SchemaDiskResourceStatusAsyncReplicationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskResourceStatusAsyncReplicationStatus]
  }
  
  extension [Self <: SchemaDiskResourceStatusAsyncReplicationStatus](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
