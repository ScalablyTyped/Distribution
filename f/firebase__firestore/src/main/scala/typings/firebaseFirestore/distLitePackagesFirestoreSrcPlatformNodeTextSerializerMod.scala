package typings.firebaseFirestore

import typings.node.utilMod.TextDecoder
import typings.node.utilMod.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcPlatformNodeTextSerializerMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/platform/node/text_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newTextDecoder(): TextDecoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextDecoder")().asInstanceOf[TextDecoder]
  
  inline def newTextEncoder(): TextEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextEncoder")().asInstanceOf[TextEncoder]
}
