package typings.ethereumjsCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genesisStatesMod {
  
  @JSImport("ethereumjs-common/dist/genesisStates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def genesisStateById(id: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genesisStateById")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def genesisStateByName(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genesisStateByName")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
}
