package typings.ethers.typesEthersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "Result")
@js.native
open class Result protected ()
  extends typings.ethers.typesAbiMod.Result {
  /**
    *  @private
    */
  def this(args: Any*) = this()
}
/* static members */
object Result {
  
  @JSImport("ethers/types/ethers", "Result")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Creates a new [[Result]] for %%items%% with each entry
    *  also accessible by its corresponding name in %%keys%%.
    */
  inline def fromItems(items: js.Array[Any]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = ^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiCodersAbstractCoderMod.Result]
  inline def fromItems(items: js.Array[Any], keys: js.Array[Null | String]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = (^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiCodersAbstractCoderMod.Result]
}
