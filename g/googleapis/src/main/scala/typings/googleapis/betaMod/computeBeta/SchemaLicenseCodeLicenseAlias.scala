package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLicenseCodeLicenseAlias extends StObject {
  
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of license corresponding to this License Code.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaLicenseCodeLicenseAlias {
  
  @scala.inline
  def apply(): SchemaLicenseCodeLicenseAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseCodeLicenseAlias]
  }
  
  @scala.inline
  implicit class SchemaLicenseCodeLicenseAliasMutableBuilder[Self <: SchemaLicenseCodeLicenseAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
