package typings.domHelpers

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsOwnerDocumentMod {
  
  @JSImport("dom-helpers/cjs/ownerDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Document]
  inline def default(node: Element): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
}
