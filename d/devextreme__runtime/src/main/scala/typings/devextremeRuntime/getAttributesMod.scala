package typings.devextremeRuntime

import typings.angularCore.mod.ElementRef
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAttributesMod {
  
  @JSImport("@devextreme/runtime/cjs/angular/get-attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAttributes(element: ElementRef[HTMLElement]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributes")(element.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
}
