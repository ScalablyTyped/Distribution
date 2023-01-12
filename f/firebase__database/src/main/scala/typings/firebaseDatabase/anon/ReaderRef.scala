package typings.firebaseDatabase.anon

import typings.firebaseDatabase.distNodeEsmSrcApiReferenceMod.DatabaseReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderRef extends StObject {
  
  var readerRef: DatabaseReference
  
  var writerRef: DatabaseReference
}
object ReaderRef {
  
  inline def apply(readerRef: DatabaseReference, writerRef: DatabaseReference): ReaderRef = {
    val __obj = js.Dynamic.literal(readerRef = readerRef.asInstanceOf[js.Any], writerRef = writerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaderRef] (val x: Self) extends AnyVal {
    
    inline def setReaderRef(value: DatabaseReference): Self = StObject.set(x, "readerRef", value.asInstanceOf[js.Any])
    
    inline def setWriterRef(value: DatabaseReference): Self = StObject.set(x, "writerRef", value.asInstanceOf[js.Any])
  }
}
