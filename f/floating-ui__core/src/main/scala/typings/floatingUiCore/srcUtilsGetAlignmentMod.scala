package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetAlignmentMod {
  
  @JSImport("@floating-ui/core/src/utils/getAlignment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlignment[T /* <: String */](placement: T): Alignment = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignment")(placement.asInstanceOf[js.Any]).asInstanceOf[Alignment]
}
