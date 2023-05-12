package typings.firebaseFirestore.distLiteFirestoreSrcMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src", "_DocumentKey")
@js.native
open class DocumentKey protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.DocumentKey {
  def this(path: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath) = this()
}
/* static members */
object DocumentKey {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src", "_DocumentKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def comparator(
    k1: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey,
    k2: typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def empty(): typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey]
  
  inline def fromName(name: String): typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey]
  
  inline def fromPath(path: String): typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey]
  
  /**
    * Creates and returns a new document key with the given segments.
    *
    * @param segments - The segments of the path to the document
    * @returns A new instance of DocumentKey
    */
  inline def fromSegments(segments: js.Array[String]): typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey]
  
  inline def isDocumentKey(path: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentKey")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
