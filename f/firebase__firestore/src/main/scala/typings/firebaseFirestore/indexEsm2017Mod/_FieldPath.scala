package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dot-separated path for navigating sub-objects within a document.
  * @internal
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_FieldPath")
@js.native
open class _FieldPath ()
  extends StObject
     with ot
object _FieldPath {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "_FieldPath")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def emptyPath(): ot = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[ot]
  
  /**
    * Parses a field string from the given server-formatted string.
    *
    * - Splitting the empty string is not allowed (for now at least).
    * - Empty segments within the string (e.g. if there are two consecutive
    *   separators) are not allowed.
    *
    * TODO(b/37244157): we should make this more strict. Right now, it allows
    * non-identifier path components, even if they aren't escaped.
    */ /* static member */
  inline def fromServerFormat(t: Any): ot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromServerFormat")(t.asInstanceOf[js.Any]).asInstanceOf[ot]
  
  /**
    * Returns true if the string could be used as a segment in a field path
    * without escaping.
    */ /* static member */
  inline def isValidIdentifier(t: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * The field designating the key of a document.
    */ /* static member */
  inline def keyField(): ot = ^.asInstanceOf[js.Dynamic].applyDynamic("keyField")().asInstanceOf[ot]
}
