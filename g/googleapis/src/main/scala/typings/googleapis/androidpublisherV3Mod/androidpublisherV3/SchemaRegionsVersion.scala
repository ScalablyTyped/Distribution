package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionsVersion extends StObject {
  
  /**
    * Required. A string representing version of the available regions being used for the specified resource. The current version is 2022/01.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionsVersion {
  
  inline def apply(): SchemaRegionsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionsVersion]
  }
  
  extension [Self <: SchemaRegionsVersion](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
