package typings.domHelpers

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsActiveElementMod {
  
  @JSImport("dom-helpers/cjs/activeElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Element | Null]
  inline def default(doc: Document): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(doc.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
}
