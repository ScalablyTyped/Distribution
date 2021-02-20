package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response indicating whether the credentials exist and are valid.
  */
@js.native
trait SchemaCheckValidCredsResponse extends StObject {
  
  /**
    * If set to `true`, the credentials exist and are valid.
    */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}
object SchemaCheckValidCredsResponse {
  
  @scala.inline
  def apply(): SchemaCheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckValidCredsResponse]
  }
  
  @scala.inline
  implicit class SchemaCheckValidCredsResponseMutableBuilder[Self <: SchemaCheckValidCredsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasValidCreds(value: Boolean): Self = StObject.set(x, "hasValidCreds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasValidCredsUndefined: Self = StObject.set(x, "hasValidCreds", js.undefined)
  }
}
