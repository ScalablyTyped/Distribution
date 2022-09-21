package typings.firebaseFirestore

import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformRnDomMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/rn/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocument(): Document | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[Document | Null]
  
  inline def getWindow(): Window | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[Window | Null]
}
