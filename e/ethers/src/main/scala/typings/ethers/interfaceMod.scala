package typings.ethers

import org.scalablytyped.runtime.StringDictionary
import typings.ethers.typesMod.DeployDescription
import typings.ethers.typesMod.EventDescription
import typings.ethers.typesMod.EventFragment
import typings.ethers.typesMod.FunctionDescription
import typings.ethers.typesMod.FunctionFragment
import typings.ethers.typesMod.LogDescription
import typings.ethers.typesMod.ParamType
import typings.ethers.typesMod.TransactionDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  @js.native
  class Interface protected () extends js.Object {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
    val abi: js.Array[EventFragment | FunctionFragment] = js.native
    val deployFunction: DeployDescription = js.native
    val events: StringDictionary[EventDescription] = js.native
    val functions: StringDictionary[FunctionDescription] = js.native
    def parseLog(log: AnonDataTopics): LogDescription = js.native
    def parseTransaction(tx: AnonData): TransactionDescription = js.native
  }
  
}

