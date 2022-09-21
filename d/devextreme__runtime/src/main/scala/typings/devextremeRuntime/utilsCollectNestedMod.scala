package typings.devextremeRuntime

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCollectNestedMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks/utils/collect-nested", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectChildren(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__collectChildren")().asInstanceOf[Record[String, Any]]
}
