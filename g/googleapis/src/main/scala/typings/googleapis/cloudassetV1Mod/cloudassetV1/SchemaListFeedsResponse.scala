package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFeedsResponse extends StObject {
  
  /**
    * A list of feeds.
    */
  var feeds: js.UndefOr[js.Array[SchemaFeed]] = js.undefined
}
object SchemaListFeedsResponse {
  
  inline def apply(): SchemaListFeedsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFeedsResponse]
  }
  
  extension [Self <: SchemaListFeedsResponse](x: Self) {
    
    inline def setFeeds(value: js.Array[SchemaFeed]): Self = StObject.set(x, "feeds", value.asInstanceOf[js.Any])
    
    inline def setFeedsUndefined: Self = StObject.set(x, "feeds", js.undefined)
    
    inline def setFeedsVarargs(value: SchemaFeed*): Self = StObject.set(x, "feeds", js.Array(value*))
  }
}
