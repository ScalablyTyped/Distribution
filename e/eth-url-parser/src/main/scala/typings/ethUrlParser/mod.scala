package typings.ethUrlParser

import typings.ethUrlParser.ethUrlParserStrings.ethereum
import typings.ethUrlParser.ethUrlParserStrings.pay
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-url-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(input: BuildInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(url: String): ParseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[ParseOutput]
  
  trait BuildInput extends StObject {
    
    var chain_id: js.UndefOr[(/* template literal string: ${number} */ String) | Null] = js.undefined
    
    var function_name: js.UndefOr[String | Null] = js.undefined
    
    var parameters: js.UndefOr[(Record[String, String]) | Null] = js.undefined
    
    var prefix: js.UndefOr[pay | Null] = js.undefined
    
    var target_address: String
  }
  object BuildInput {
    
    inline def apply(target_address: String): BuildInput = {
      val __obj = js.Dynamic.literal(target_address = target_address.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildInput] (val x: Self) extends AnyVal {
      
      inline def setChain_id(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
      
      inline def setChain_idNull: Self = StObject.set(x, "chain_id", null)
      
      inline def setChain_idUndefined: Self = StObject.set(x, "chain_id", js.undefined)
      
      inline def setFunction_name(value: String): Self = StObject.set(x, "function_name", value.asInstanceOf[js.Any])
      
      inline def setFunction_nameNull: Self = StObject.set(x, "function_name", null)
      
      inline def setFunction_nameUndefined: Self = StObject.set(x, "function_name", js.undefined)
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersNull: Self = StObject.set(x, "parameters", null)
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPrefix(value: pay): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTarget_address(value: String): Self = StObject.set(x, "target_address", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOutput extends StObject {
    
    var chain_id: js.UndefOr[/* template literal string: ${number} */ String] = js.undefined
    
    var function_name: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[Record[String, String]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var scheme: ethereum
    
    var target_address: String
  }
  object ParseOutput {
    
    inline def apply(target_address: String): ParseOutput = {
      val __obj = js.Dynamic.literal(scheme = "ethereum", target_address = target_address.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOutput] (val x: Self) extends AnyVal {
      
      inline def setChain_id(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
      
      inline def setChain_idUndefined: Self = StObject.set(x, "chain_id", js.undefined)
      
      inline def setFunction_name(value: String): Self = StObject.set(x, "function_name", value.asInstanceOf[js.Any])
      
      inline def setFunction_nameUndefined: Self = StObject.set(x, "function_name", js.undefined)
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setScheme(value: ethereum): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setTarget_address(value: String): Self = StObject.set(x, "target_address", value.asInstanceOf[js.Any])
    }
  }
}
