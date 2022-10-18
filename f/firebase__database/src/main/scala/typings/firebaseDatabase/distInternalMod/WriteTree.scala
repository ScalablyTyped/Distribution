package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WriteTree tracks all pending user-initiated writes and has methods to calculate the result of merging them
  * with underlying server data (to create "event cache" data).  Pending writes are added with addOverwrite()
  * and addMerge(), and removed with removeWrite().
  */
trait WriteTree extends StObject {
  
  /**
    * A list of all pending writes, regardless of visibility and shadowed-ness.  Used to calculate arbitrary
    * sets of the changed data, such as hidden writes (from transactions) or changes with certain writes excluded (also
    * used by transactions).
    */
  var allWrites: js.Array[WriteRecord]
  
  var lastWriteId: Double
  
  /**
    * A tree tracking the result of applying all visible writes.  This does not include transactions with
    * applyLocally=false or writes that are completely shadowed by other writes.
    */
  var visibleWrites: CompoundWrite
}
object WriteTree {
  
  inline def apply(allWrites: js.Array[WriteRecord], lastWriteId: Double, visibleWrites: CompoundWrite): WriteTree = {
    val __obj = js.Dynamic.literal(allWrites = allWrites.asInstanceOf[js.Any], lastWriteId = lastWriteId.asInstanceOf[js.Any], visibleWrites = visibleWrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTree]
  }
  
  extension [Self <: WriteTree](x: Self) {
    
    inline def setAllWrites(value: js.Array[WriteRecord]): Self = StObject.set(x, "allWrites", value.asInstanceOf[js.Any])
    
    inline def setAllWritesVarargs(value: WriteRecord*): Self = StObject.set(x, "allWrites", js.Array(value*))
    
    inline def setLastWriteId(value: Double): Self = StObject.set(x, "lastWriteId", value.asInstanceOf[js.Any])
    
    inline def setVisibleWrites(value: CompoundWrite): Self = StObject.set(x, "visibleWrites", value.asInstanceOf[js.Any])
  }
}
