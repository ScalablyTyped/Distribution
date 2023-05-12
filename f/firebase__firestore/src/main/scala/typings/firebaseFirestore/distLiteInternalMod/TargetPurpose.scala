package typings.firebaseFirestore.distLiteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeExistenceFilterMismatch
import typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeExistenceFilterMismatchBloom
import typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeLimboResolution
import typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeListen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration of the different purposes we have for targets. */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeListen
  - typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeExistenceFilterMismatch
  - typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeExistenceFilterMismatchBloom
  - typings.firebaseFirestore.firebaseFirestoreStrings.TargetPurposeLimboResolution
*/
trait TargetPurpose extends StObject
object TargetPurpose {
  
  /**
    * The query target was used to refill a query after an existence filter
    * mismatch.
    */
  inline def ExistenceFilterMismatch: TargetPurposeExistenceFilterMismatch = "TargetPurposeExistenceFilterMismatch".asInstanceOf[TargetPurposeExistenceFilterMismatch]
  
  /**
    * The query target was used if the query is the result of a false positive in
    * the bloom filter.
    */
  inline def ExistenceFilterMismatchBloom: TargetPurposeExistenceFilterMismatchBloom = "TargetPurposeExistenceFilterMismatchBloom".asInstanceOf[TargetPurposeExistenceFilterMismatchBloom]
  
  /** The query target was used to resolve a limbo document. */
  inline def LimboResolution: TargetPurposeLimboResolution = "TargetPurposeLimboResolution".asInstanceOf[TargetPurposeLimboResolution]
  
  /** A regular, normal query target. */
  inline def Listen: TargetPurposeListen = "TargetPurposeListen".asInstanceOf[TargetPurposeListen]
}
