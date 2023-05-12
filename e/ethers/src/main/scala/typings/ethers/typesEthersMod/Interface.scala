package typings.ethers.typesEthersMod

import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "Interface")
@js.native
open class Interface protected ()
  extends typings.ethers.typesAbiMod.Interface {
  /**
    *  Create a new Interface for the %%fragments%%.
    */
  def this(fragments: InterfaceAbi) = this()
}
/* static members */
object Interface {
  
  @JSImport("ethers/types/ethers", "Interface")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(value: typings.ethers.typesAbiInterfaceMod.Interface): typings.ethers.typesAbiInterfaceMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiInterfaceMod.Interface]
  /**
    *  Creates a new [[Interface]] from the ABI %%value%%.
    *
    *  The %%value%% may be provided as an existing [[Interface]] object,
    *  a JSON-encoded ABI or any Human-Readable ABI format.
    */
  inline def from(value: InterfaceAbi): typings.ethers.typesAbiInterfaceMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiInterfaceMod.Interface]
}
