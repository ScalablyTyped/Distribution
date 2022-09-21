package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTagApiSpecRevisionRequest extends StObject {
  
  /**
    * Required. The tag to apply. The tag should be at most 40 characters, and match `a-z{3,39\}`.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaTagApiSpecRevisionRequest {
  
  inline def apply(): SchemaTagApiSpecRevisionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagApiSpecRevisionRequest]
  }
  
  extension [Self <: SchemaTagApiSpecRevisionRequest](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
