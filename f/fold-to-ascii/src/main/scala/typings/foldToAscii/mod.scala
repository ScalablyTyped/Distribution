package typings.foldToAscii

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fold-to-ascii", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def foldMaintaining(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMaintaining")().asInstanceOf[String]
  inline def foldMaintaining(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMaintaining")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def foldReplacing(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")().asInstanceOf[String]
  inline def foldReplacing(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def foldReplacing(str: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")(str.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldReplacing(str: Unit, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldReplacing")(str.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
}
