package typings.ethSigUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdditionalProperties extends StObject {
    
    var additionalProperties: Items
    
    var `type`: String
  }
  object AdditionalProperties {
    
    inline def apply(additionalProperties: Items, `type`: String): AdditionalProperties = {
      val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdditionalProperties]
    }
    
    extension [Self <: AdditionalProperties](x: Self) {
      
      inline def setAdditionalProperties(value: Items): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChainId extends StObject {
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var verifyingContract: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ChainId {
    
    inline def apply(): ChainId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChainId]
    }
    
    extension [Self <: ChainId](x: Self) {
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVerifyingContract(value: String): Self = StObject.set(x, "verifyingContract", value.asInstanceOf[js.Any])
      
      inline def setVerifyingContractUndefined: Self = StObject.set(x, "verifyingContract", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Domain extends StObject {
    
    var domain: Type
    
    var message: Type
    
    var primaryType: Type
    
    var types: AdditionalProperties
  }
  object Domain {
    
    inline def apply(domain: Type, message: Type, primaryType: Type, types: AdditionalProperties): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(value: Type): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Type): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPrimaryType(value: Type): Self = StObject.set(x, "primaryType", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: AdditionalProperties): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var items: Properties
    
    var `type`: String
  }
  object Items {
    
    inline def apply(items: Properties, `type`: String): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: Properties): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: Type
    
    var `type`: Type
  }
  object Name {
    
    inline def apply(name: Type, `type`: Type): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Type): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<eth-sig-util.eth-sig-util/dist.EIP712TypedData> */
  trait PartialEIP712TypedData extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object PartialEIP712TypedData {
    
    inline def apply(): PartialEIP712TypedData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEIP712TypedData]
    }
    
    extension [Self <: PartialEIP712TypedData](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Properties extends StObject {
    
    var properties: Name
    
    var required: js.Array[String]
    
    var `type`: String
  }
  object Properties {
    
    inline def apply(properties: Name, required: js.Array[String], `type`: String): Properties = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    extension [Self <: Properties](x: Self) {
      
      inline def setProperties(value: Name): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
  }
  object Type {
    
    inline def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
