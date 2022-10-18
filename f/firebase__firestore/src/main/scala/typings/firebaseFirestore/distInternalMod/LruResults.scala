package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the results of a garbage collection run. `didRun` will be set to
  * `false` if collection was skipped (either it is disabled or the cache size
  * has not hit the threshold). If collection ran, the other fields will be
  * filled in with the details of the results.
  */
trait LruResults extends StObject {
  
  val didRun: Boolean
  
  val documentsRemoved: Double
  
  val sequenceNumbersCollected: Double
  
  val targetsRemoved: Double
}
object LruResults {
  
  inline def apply(
    didRun: Boolean,
    documentsRemoved: Double,
    sequenceNumbersCollected: Double,
    targetsRemoved: Double
  ): LruResults = {
    val __obj = js.Dynamic.literal(didRun = didRun.asInstanceOf[js.Any], documentsRemoved = documentsRemoved.asInstanceOf[js.Any], sequenceNumbersCollected = sequenceNumbersCollected.asInstanceOf[js.Any], targetsRemoved = targetsRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[LruResults]
  }
  
  extension [Self <: LruResults](x: Self) {
    
    inline def setDidRun(value: Boolean): Self = StObject.set(x, "didRun", value.asInstanceOf[js.Any])
    
    inline def setDocumentsRemoved(value: Double): Self = StObject.set(x, "documentsRemoved", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumbersCollected(value: Double): Self = StObject.set(x, "sequenceNumbersCollected", value.asInstanceOf[js.Any])
    
    inline def setTargetsRemoved(value: Double): Self = StObject.set(x, "targetsRemoved", value.asInstanceOf[js.Any])
  }
}
