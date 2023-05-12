package typings.firebaseFirestore.distFirestoreSrcIndexDotnodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/index.node", "_FieldPath")
@js.native
open class _FieldPath ()
  extends typings.firebaseFirestore.distFirestoreSrcApiMod._FieldPath
/* static members */
object _FieldPath {
  
  @JSImport("@firebase/firestore/dist/firestore/src/index.node", "_FieldPath")
  @js.native
  val ^ : js.Any = js.native
  
  inline def emptyPath(): typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath]
  
  /**
    * Parses a field string from the given server-formatted string.
    *
    * - Splitting the empty string is not allowed (for now at least).
    * - Empty segments within the string (e.g. if there are two consecutive
    *   separators) are not allowed.
    *
    * TODO(b/37244157): we should make this more strict. Right now, it allows
    * non-identifier path components, even if they aren't escaped.
    */
  inline def fromServerFormat(path: String): typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromServerFormat")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath]
  
  /**
    * Returns true if the string could be used as a segment in a field path
    * without escaping.
    */
  @JSImport("@firebase/firestore/dist/firestore/src/index.node", "_FieldPath.isValidIdentifier")
  @js.native
  def isValidIdentifier: Any = js.native
  inline def isValidIdentifier_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidIdentifier")(x.asInstanceOf[js.Any])
  
  /**
    * The field designating the key of a document.
    */
  inline def keyField(): typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("keyField")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath]
}
