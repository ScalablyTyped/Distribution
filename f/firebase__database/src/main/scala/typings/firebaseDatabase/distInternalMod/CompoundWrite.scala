package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class holds a collection of writes that can be applied to nodes in unison. It abstracts away the logic with
  * dealing with priority writes and multiple nested writes. At any given path there is only allowed to be one write
  * modifying that path. Any write to an existing path or shadowing an existing path will modify that existing write
  * to reflect the write added.
  */
trait CompoundWrite extends StObject {
  
  var writeTree_ : ImmutableTree[Node2]
}
object CompoundWrite {
  
  inline def apply(writeTree_ : ImmutableTree[Node2]): CompoundWrite = {
    val __obj = js.Dynamic.literal(writeTree_ = writeTree_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundWrite]
  }
  
  extension [Self <: CompoundWrite](x: Self) {
    
    inline def setWriteTree_(value: ImmutableTree[Node2]): Self = StObject.set(x, "writeTree_", value.asInstanceOf[js.Any])
  }
}
