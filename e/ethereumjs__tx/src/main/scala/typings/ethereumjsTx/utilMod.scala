package typings.ethereumjsTx

import typings.ethereumjsCommon.mod.Common
import typings.ethereumjsTx.typesMod.AccessList
import typings.ethereumjsTx.typesMod.AccessListBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@ethereumjs/tx/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethereumjs/tx/dist/util", "AccessLists")
  @js.native
  open class AccessLists () extends StObject
  /* static members */
  object AccessLists {
    
    @JSImport("@ethereumjs/tx/dist/util", "AccessLists")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAccessListData(accessList: AccessList | AccessListBuffer): typings.ethereumjsTx.anon.AccessList = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessListData")(accessList.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsTx.anon.AccessList]
    
    inline def getAccessListJSON(accessList: AccessListBuffer): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessListJSON")(accessList.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def getDataFeeEIP2930(accessList: AccessListBuffer, common: Common): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataFeeEIP2930")(accessList.asInstanceOf[js.Any], common.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def verifyAccessList(accessList: AccessListBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyAccessList")(accessList.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def checkMaxInitCodeSize(common: Common, length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxInitCodeSize")(common.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
