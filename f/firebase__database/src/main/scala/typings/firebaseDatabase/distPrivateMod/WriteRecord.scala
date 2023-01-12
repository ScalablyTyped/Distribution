package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a single user-initiated write operation. May be the result of a set(), transaction(), or update() call. In
  * the case of a set() or transaction, snap wil be non-null.  In the case of an update(), children will be non-null.
  */
trait WriteRecord extends StObject {
  
  var children: js.UndefOr[StringDictionary[Node2] | Null] = js.undefined
  
  var path: Path
  
  var snap: js.UndefOr[Node2 | Null] = js.undefined
  
  var visible: Boolean
  
  var writeId: Double
}
object WriteRecord {
  
  inline def apply(path: Path, visible: Boolean, writeId: Double): WriteRecord = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], writeId = writeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteRecord] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: StringDictionary[Node2]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSnap(value: Node2): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapNull: Self = StObject.set(x, "snap", null)
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWriteId(value: Double): Self = StObject.set(x, "writeId", value.asInstanceOf[js.Any])
  }
}
