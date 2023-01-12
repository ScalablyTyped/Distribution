package typings.emailAddresses

import typings.emailAddresses.emailAddresses.ASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: ASTNode
    
    var comments: js.Array[ASTNode]
    
    var domain: ASTNode
    
    var local: ASTNode
    
    var name: ASTNode | Null
  }
  object Address {
    
    inline def apply(address: ASTNode, comments: js.Array[ASTNode], domain: ASTNode, local: ASTNode): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = null)
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: ASTNode): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setComments(value: js.Array[ASTNode]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: ASTNode*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setDomain(value: ASTNode): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: ASTNode): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setName(value: ASTNode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
    }
  }
  
  trait Name extends StObject {
    
    var name: ASTNode
  }
  object Name {
    
    inline def apply(name: ASTNode): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: ASTNode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
