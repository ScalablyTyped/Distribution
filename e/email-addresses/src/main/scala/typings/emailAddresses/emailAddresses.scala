package typings.emailAddresses

import typings.emailAddresses.anon.Address
import typings.emailAddresses.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailAddresses {
  
  trait ASTNode extends StObject {
    
    var children: js.Array[ASTNode]
    
    var name: String
    
    var semantic: String
    
    var tokens: String
  }
  object ASTNode {
    
    inline def apply(children: js.Array[ASTNode], name: String, semantic: String, tokens: String): ASTNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    extension [Self <: ASTNode](x: Self) {
      
      inline def setChildren(value: js.Array[ASTNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ASTNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: String): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var input: String
    
    var oneResult: js.UndefOr[Boolean] = js.undefined
    
    var partial: js.UndefOr[Boolean] = js.undefined
    
    var rejectTLD: js.UndefOr[Boolean] = js.undefined
    
    var rfc6532: js.UndefOr[Boolean] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var startAt: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(input: String): Options = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOneResult(value: Boolean): Self = StObject.set(x, "oneResult", value.asInstanceOf[js.Any])
      
      inline def setOneResultUndefined: Self = StObject.set(x, "oneResult", js.undefined)
      
      inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      inline def setRejectTLD(value: Boolean): Self = StObject.set(x, "rejectTLD", value.asInstanceOf[js.Any])
      
      inline def setRejectTLDUndefined: Self = StObject.set(x, "rejectTLD", js.undefined)
      
      inline def setRfc6532(value: Boolean): Self = StObject.set(x, "rfc6532", value.asInstanceOf[js.Any])
      
      inline def setRfc6532Undefined: Self = StObject.set(x, "rfc6532", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait ParsedGroup extends StObject {
    
    var addresses: js.Array[ParsedMailbox]
    
    var name: String
    
    var node: js.UndefOr[ASTNode] = js.undefined
    
    var parts: Name
    
    var `type`: String
  }
  object ParsedGroup {
    
    inline def apply(addresses: js.Array[ParsedMailbox], name: String, parts: Name, `type`: String): ParsedGroup = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedGroup]
    }
    
    extension [Self <: ParsedGroup](x: Self) {
      
      inline def setAddresses(value: js.Array[ParsedMailbox]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: ParsedMailbox*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ASTNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setParts(value: Name): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedMailbox extends StObject {
    
    var address: String
    
    var domain: String
    
    var local: String
    
    var name: String
    
    var node: js.UndefOr[ASTNode] = js.undefined
    
    var parts: Address
    
    var `type`: String
  }
  object ParsedMailbox {
    
    inline def apply(address: String, domain: String, local: String, name: String, parts: Address, `type`: String): ParsedMailbox = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedMailbox]
    }
    
    extension [Self <: ParsedMailbox](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ASTNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setParts(value: Address): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedResult extends StObject {
    
    var addresses: js.Array[ParsedMailbox | ParsedGroup]
    
    var ast: ASTNode
  }
  object ParsedResult {
    
    inline def apply(addresses: js.Array[ParsedMailbox | ParsedGroup], ast: ASTNode): ParsedResult = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedResult]
    }
    
    extension [Self <: ParsedResult](x: Self) {
      
      inline def setAddresses(value: js.Array[ParsedMailbox | ParsedGroup]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: (ParsedMailbox | ParsedGroup)*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      inline def setAst(value: ASTNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    }
  }
}
