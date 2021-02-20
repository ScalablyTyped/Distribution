package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.GenerateConsistencyToken
  */
@js.native
trait SchemaGenerateConsistencyTokenResponse extends StObject {
  
  /**
    * The generated consistency token.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}
object SchemaGenerateConsistencyTokenResponse {
  
  @scala.inline
  def apply(): SchemaGenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConsistencyTokenResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateConsistencyTokenResponseMutableBuilder[Self <: SchemaGenerateConsistencyTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
