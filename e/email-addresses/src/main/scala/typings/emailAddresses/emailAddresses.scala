package typings.emailAddresses

import typings.emailAddresses.anon.Address
import typings.emailAddresses.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailAddresses {
  
  @js.native
  trait ASTNode extends StObject {
    
    var children: js.Array[ASTNode] = js.native
    
    var name: String = js.native
    
    var semantic: String = js.native
    
    var tokens: String = js.native
  }
  object ASTNode {
    
    @scala.inline
    def apply(children: js.Array[ASTNode], name: String, semantic: String, tokens: String): ASTNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    @scala.inline
    implicit class ASTNodeMutableBuilder[Self <: ASTNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ASTNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ASTNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: String): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var input: String = js.native
    
    var oneResult: js.UndefOr[Boolean] = js.native
    
    var partial: js.UndefOr[Boolean] = js.native
    
    var rejectTLD: js.UndefOr[Boolean] = js.native
    
    var rfc6532: js.UndefOr[Boolean] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var startAt: js.UndefOr[String] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(input: String): Options = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneResult(value: Boolean): Self = StObject.set(x, "oneResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneResultUndefined: Self = StObject.set(x, "oneResult", js.undefined)
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      @scala.inline
      def setRejectTLD(value: Boolean): Self = StObject.set(x, "rejectTLD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectTLDUndefined: Self = StObject.set(x, "rejectTLD", js.undefined)
      
      @scala.inline
      def setRfc6532(value: Boolean): Self = StObject.set(x, "rfc6532", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRfc6532Undefined: Self = StObject.set(x, "rfc6532", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait ParsedGroup extends StObject {
    
    var addresses: js.Array[ParsedMailbox] = js.native
    
    var name: String = js.native
    
    var node: js.UndefOr[ASTNode] = js.native
    
    var parts: Name = js.native
    
    var `type`: String = js.native
  }
  object ParsedGroup {
    
    @scala.inline
    def apply(addresses: js.Array[ParsedMailbox], name: String, parts: Name, `type`: String): ParsedGroup = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedGroup]
    }
    
    @scala.inline
    implicit class ParsedGroupMutableBuilder[Self <: ParsedGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[ParsedMailbox]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: ParsedMailbox*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ASTNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setParts(value: Name): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedMailbox extends StObject {
    
    var address: String = js.native
    
    var domain: String = js.native
    
    var local: String = js.native
    
    var name: String = js.native
    
    var node: js.UndefOr[ASTNode] = js.native
    
    var parts: Address = js.native
    
    var `type`: String = js.native
  }
  object ParsedMailbox {
    
    @scala.inline
    def apply(address: String, domain: String, local: String, name: String, parts: Address, `type`: String): ParsedMailbox = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedMailbox]
    }
    
    @scala.inline
    implicit class ParsedMailboxMutableBuilder[Self <: ParsedMailbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ASTNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setParts(value: Address): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedResult extends StObject {
    
    var addresses: js.Array[ParsedMailbox | ParsedGroup] = js.native
    
    var ast: ASTNode = js.native
  }
  object ParsedResult {
    
    @scala.inline
    def apply(addresses: js.Array[ParsedMailbox | ParsedGroup], ast: ASTNode): ParsedResult = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedResult]
    }
    
    @scala.inline
    implicit class ParsedResultMutableBuilder[Self <: ParsedResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[ParsedMailbox | ParsedGroup]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: (ParsedMailbox | ParsedGroup)*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setAst(value: ASTNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    }
  }
}
