package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The grouplicense resources for the enterprise.
  */
trait SchemaGroupLicensesListResponse extends StObject {
  
  /**
    * A group license for a product approved for use in the enterprise.
    */
  var groupLicense: js.UndefOr[js.Array[SchemaGroupLicense]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicensesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaGroupLicensesListResponse {
  
  @scala.inline
  def apply(): SchemaGroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicensesListResponse]
  }
  
  @scala.inline
  implicit class SchemaGroupLicensesListResponseMutableBuilder[Self <: SchemaGroupLicensesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupLicense(value: js.Array[SchemaGroupLicense]): Self = StObject.set(x, "groupLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupLicenseUndefined: Self = StObject.set(x, "groupLicense", js.undefined)
    
    @scala.inline
    def setGroupLicenseVarargs(value: SchemaGroupLicense*): Self = StObject.set(x, "groupLicense", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
