package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents an enterprise admin who can manage the enterprise in the
  * managed Google Play store.
  */
trait SchemaAdministrator extends StObject {
  
  /**
    * The admin&#39;s email address.
    */
  var email: js.UndefOr[String] = js.undefined
}
object SchemaAdministrator {
  
  @scala.inline
  def apply(): SchemaAdministrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrator]
  }
  
  @scala.inline
  implicit class SchemaAdministratorMutableBuilder[Self <: SchemaAdministrator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
