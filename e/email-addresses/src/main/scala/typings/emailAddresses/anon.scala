package typings.emailAddresses

import typings.emailAddresses.emailAddresses.ASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: ASTNode = js.native
    
    var comments: js.Array[ASTNode] = js.native
    
    var domain: ASTNode = js.native
    
    var local: ASTNode = js.native
    
    var name: ASTNode = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: ASTNode, comments: js.Array[ASTNode], domain: ASTNode, local: ASTNode, name: ASTNode): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: ASTNode): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments(value: js.Array[ASTNode]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsVarargs(value: ASTNode*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setDomain(value: ASTNode): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: ASTNode): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: ASTNode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: ASTNode = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: ASTNode): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: ASTNode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
