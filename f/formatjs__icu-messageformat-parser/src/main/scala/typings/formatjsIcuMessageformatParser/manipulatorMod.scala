package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manipulatorMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/manipulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hoistSelectors(ast: js.Array[MessageFormatElement]): js.Array[MessageFormatElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("hoistSelectors")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Array[MessageFormatElement]]
}
