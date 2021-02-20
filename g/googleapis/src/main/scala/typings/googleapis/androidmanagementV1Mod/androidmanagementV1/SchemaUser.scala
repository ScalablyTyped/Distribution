package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A user belonging to an enterprise.
  */
@js.native
trait SchemaUser extends StObject {
  
  /**
    * A unique identifier you create for this user, such as user342 or
    * asset#44418. This field must be set when the user is created and
    * can&#39;t be updated. This field must not contain personally identifiable
    * information (PII). This identifier must be 1024 characters or less;
    * otherwise, the update policy request will fail.
    */
  var accountIdentifier: js.UndefOr[String] = js.native
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserMutableBuilder[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIdentifier(value: String): Self = StObject.set(x, "accountIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdentifierUndefined: Self = StObject.set(x, "accountIdentifier", js.undefined)
  }
}
