package typings.ethereumjsTx

import typings.ethereumjsTx.typesMod.AccessListBuffer
import typings.ethereumjsTx.typesMod.AccessListBufferItem
import typings.ethereumjsTx.typesMod.AccessListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessList extends StObject {
    
    var AccessListJSON: typings.ethereumjsTx.typesMod.AccessList
    
    var accessList: AccessListBuffer
  }
  object AccessList {
    
    inline def apply(AccessListJSON: typings.ethereumjsTx.typesMod.AccessList, accessList: AccessListBuffer): AccessList = {
      val __obj = js.Dynamic.literal(AccessListJSON = AccessListJSON.asInstanceOf[js.Any], accessList = accessList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessList]
    }
    
    extension [Self <: AccessList](x: Self) {
      
      inline def setAccessList(value: AccessListBuffer): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListJSON(value: typings.ethereumjsTx.typesMod.AccessList): Self = StObject.set(x, "AccessListJSON", value.asInstanceOf[js.Any])
      
      inline def setAccessListJSONVarargs(value: AccessListItem*): Self = StObject.set(x, "AccessListJSON", js.Array(value*))
      
      inline def setAccessListVarargs(value: AccessListBufferItem*): Self = StObject.set(x, "accessList", js.Array(value*))
    }
  }
  
  trait Hardfork extends StObject {
    
    var hardfork: String | typings.ethereumjsCommon.enumsMod.Hardfork
    
    var value: js.BigInt
  }
  object Hardfork {
    
    inline def apply(hardfork: String | typings.ethereumjsCommon.enumsMod.Hardfork, value: js.BigInt): Hardfork = {
      val __obj = js.Dynamic.literal(hardfork = hardfork.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hardfork]
    }
    
    extension [Self <: Hardfork](x: Self) {
      
      inline def setHardfork(value: String | typings.ethereumjsCommon.enumsMod.Hardfork): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
