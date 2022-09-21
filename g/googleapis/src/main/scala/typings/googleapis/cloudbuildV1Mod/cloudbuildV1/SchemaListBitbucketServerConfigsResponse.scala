package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBitbucketServerConfigsResponse extends StObject {
  
  /**
    * A list of BitbucketServerConfigs
    */
  var bitbucketServerConfigs: js.UndefOr[js.Array[SchemaBitbucketServerConfig]] = js.undefined
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBitbucketServerConfigsResponse {
  
  inline def apply(): SchemaListBitbucketServerConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBitbucketServerConfigsResponse]
  }
  
  extension [Self <: SchemaListBitbucketServerConfigsResponse](x: Self) {
    
    inline def setBitbucketServerConfigs(value: js.Array[SchemaBitbucketServerConfig]): Self = StObject.set(x, "bitbucketServerConfigs", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigsUndefined: Self = StObject.set(x, "bitbucketServerConfigs", js.undefined)
    
    inline def setBitbucketServerConfigsVarargs(value: SchemaBitbucketServerConfig*): Self = StObject.set(x, "bitbucketServerConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
