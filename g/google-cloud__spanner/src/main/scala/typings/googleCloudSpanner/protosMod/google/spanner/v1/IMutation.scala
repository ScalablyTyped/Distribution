package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.spanner.v1.Mutation.IDelete
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Mutation.IWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Mutation. */
trait IMutation extends StObject {
  
  /** Mutation delete */
  var delete: js.UndefOr[IDelete | Null] = js.undefined
  
  /** Mutation insert */
  var insert: js.UndefOr[IWrite | Null] = js.undefined
  
  /** Mutation insertOrUpdate */
  var insertOrUpdate: js.UndefOr[IWrite | Null] = js.undefined
  
  /** Mutation replace */
  var replace: js.UndefOr[IWrite | Null] = js.undefined
  
  /** Mutation update */
  var update: js.UndefOr[IWrite | Null] = js.undefined
}
object IMutation {
  
  inline def apply(): IMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMutation]
  }
  
  extension [Self <: IMutation](x: Self) {
    
    inline def setDelete(value: IDelete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: IWrite): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertNull: Self = StObject.set(x, "insert", null)
    
    inline def setInsertOrUpdate(value: IWrite): Self = StObject.set(x, "insertOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setInsertOrUpdateNull: Self = StObject.set(x, "insertOrUpdate", null)
    
    inline def setInsertOrUpdateUndefined: Self = StObject.set(x, "insertOrUpdate", js.undefined)
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setReplace(value: IWrite): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceNull: Self = StObject.set(x, "replace", null)
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setUpdate(value: IWrite): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
