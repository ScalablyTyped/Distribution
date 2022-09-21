package typings.devextremeRuntime

import typings.angularCore.mod.ElementRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSlotEmptyMod {
  
  @JSImport("@devextreme/runtime/cjs/angular/is-slot-empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSlotEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotEmpty")().asInstanceOf[Boolean]
  inline def isSlotEmpty(slot: ElementRef[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotEmpty")(slot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
