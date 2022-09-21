package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPausedStateContext extends StObject {
  
  /**
    * Time at which the subscription will be automatically resumed.
    */
  var autoResumeTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPausedStateContext {
  
  inline def apply(): SchemaPausedStateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPausedStateContext]
  }
  
  extension [Self <: SchemaPausedStateContext](x: Self) {
    
    inline def setAutoResumeTime(value: String): Self = StObject.set(x, "autoResumeTime", value.asInstanceOf[js.Any])
    
    inline def setAutoResumeTimeNull: Self = StObject.set(x, "autoResumeTime", null)
    
    inline def setAutoResumeTimeUndefined: Self = StObject.set(x, "autoResumeTime", js.undefined)
  }
}
