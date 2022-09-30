package typings.firebaseFirestore.internalMod

import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import typings.firebaseFirestore.firebaseFirestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the index state as it relates to a particular target. */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreInts.`0`
  - typings.firebaseFirestore.firebaseFirestoreInts.`1`
  - typings.firebaseFirestore.firebaseFirestoreInts.`2`
*/
trait IndexType extends StObject
object IndexType {
  
  /**
    * Indicates that a "full index" could be found for serving the target. A full
    * index is one which has a segment for every filter/orderBy in the target.
    */
  inline def FULL: `2` = 2.asInstanceOf[`2`]
  
  /** Indicates that no index could be found for serving the target. */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Indicates that only a "partial index" could be found for serving the
    * target. A partial index is one which does not have a segment for every
    * filter/orderBy in the target.
    */
  inline def PARTIAL: `1` = 1.asInstanceOf[`1`]
}
