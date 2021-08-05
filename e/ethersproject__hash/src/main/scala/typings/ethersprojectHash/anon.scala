package typings.ethersprojectHash

import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Domain extends StObject {
    
    var domain: TypedDataDomain
    
    var value: js.Any
  }
  object Domain {
    
    inline def apply(domain: TypedDataDomain, value: js.Any): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(value: TypedDataDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
