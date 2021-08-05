package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetReference extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
}
object SchemaTargetReference {
  
  inline def apply(): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetReference]
  }
  
  extension [Self <: SchemaTargetReference](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
