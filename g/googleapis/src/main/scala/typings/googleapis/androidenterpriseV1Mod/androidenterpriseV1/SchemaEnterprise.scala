package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Enterprises resource represents the binding between an EMM and a
  * specific organization. That binding can be instantiated in one of two
  * different ways using this API as follows:  - For Google managed domain
  * customers, the process involves using Enterprises.enroll and
  * Enterprises.setAccount (in conjunction with artifacts obtained from the
  * Admin console and the Google API Console) and submitted to the EMM through
  * a more-or-less manual process.  - For managed Google Play Accounts
  * customers, the process involves using Enterprises.generateSignupUrl and
  * Enterprises.completeSignup in conjunction with the managed Google Play
  * sign-up UI (Google-provided mechanism) to create the binding without manual
  * steps. As an EMM, you can support either or both approaches in your EMM
  * console. See Create an Enterprise for details.
  */
trait SchemaEnterprise extends StObject {
  
  /**
    * Admins of the enterprise. This is only supported for enterprises created
    * via the EMM-initiated flow.
    */
  var administrator: js.UndefOr[js.Array[SchemaAdministrator]] = js.undefined
  
  /**
    * The unique ID for the enterprise.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterprise&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the enterprise, for example, &quot;Example, Inc&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The enterprise&#39;s primary domain, such as &quot;example.com&quot;.
    */
  var primaryDomain: js.UndefOr[String] = js.undefined
}
object SchemaEnterprise {
  
  @scala.inline
  def apply(): SchemaEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprise]
  }
  
  @scala.inline
  implicit class SchemaEnterpriseMutableBuilder[Self <: SchemaEnterprise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrator(value: js.Array[SchemaAdministrator]): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    @scala.inline
    def setAdministratorVarargs(value: SchemaAdministrator*): Self = StObject.set(x, "administrator", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrimaryDomain(value: String): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryDomainUndefined: Self = StObject.set(x, "primaryDomain", js.undefined)
  }
}
