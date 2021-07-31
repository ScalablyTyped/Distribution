package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInternalIpOwner extends StObject {
  
  /**
    * IP CIDR range being owned.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * URLs of the IP owners of the IP CIDR range.
    */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether this IP CIDR range is reserved for system use.
    */
  var systemOwned: js.UndefOr[Boolean] = js.undefined
}
object SchemaInternalIpOwner {
  
  @scala.inline
  def apply(): SchemaInternalIpOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalIpOwner]
  }
  
  @scala.inline
  implicit class SchemaInternalIpOwnerMutableBuilder[Self <: SchemaInternalIpOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setSystemOwned(value: Boolean): Self = StObject.set(x, "systemOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemOwnedUndefined: Self = StObject.set(x, "systemOwned", js.undefined)
  }
}
