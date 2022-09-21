package typings.floatingUiCore

import typings.floatingUiCore.typesMod.ClientRectObject
import typings.floatingUiCore.typesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectToClientRectMod {
  
  @JSImport("@floating-ui/core/src/utils/rectToClientRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rectToClientRect(rect: Rect): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToClientRect")(rect.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
}
