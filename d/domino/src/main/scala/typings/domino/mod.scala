package typings.domino

import typings.std.DOMImplementation
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domino", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDOMImplementation(): DOMImplementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMImplementation")().asInstanceOf[DOMImplementation]
  
  inline def createDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("createDocument")().asInstanceOf[Document]
  inline def createDocument(html: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("createDocument")(html.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def createDocument(html: String, force: Boolean): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocument")(html.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def createDocument(html: Unit, force: Boolean): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocument")(html.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def createWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("createWindow")().asInstanceOf[Window]
  inline def createWindow(html: String): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("createWindow")(html.asInstanceOf[js.Any]).asInstanceOf[Window]
  inline def createWindow(html: String, address: String): Window = (^.asInstanceOf[js.Dynamic].applyDynamic("createWindow")(html.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[Window]
  inline def createWindow(html: Unit, address: String): Window = (^.asInstanceOf[js.Dynamic].applyDynamic("createWindow")(html.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[Window]
}
