package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreIndex extends StObject {
  
  /** Auto-generated primary key (does not apply to secondary indexes) */
  val autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  /** True if and only if keyPath is an array (https://dexie.org/docs/Compound-Index) */
  val compound: js.UndefOr[Boolean] = js.undefined
  
  /** Extract (using keyPath) a key from given value (object). Null for outbound primary keys */
  val extractKey: (js.Function1[/* value */ Any, Any]) | Null
  
  /** True if this index represents the primary key */
  val isPrimaryKey: js.UndefOr[Boolean] = js.undefined
  
  /** keyPath, null for primary key, string for single-property indexes, Array<string> for compound indexes */
  val keyPath: Null | String | js.Array[String]
  
  /** Whether index is multiEntry. */
  val multiEntry: js.UndefOr[Boolean] = js.undefined
  
  /** Name of the index, or null for primary key */
  val name: String | Null
  
  /** True if this index represents the primary key and is not inbound (https://dexie.org/docs/inbound) */
  val outbound: js.UndefOr[Boolean] = js.undefined
  
  /** Whether index is unique. Also true if index is primary key. */
  val unique: js.UndefOr[Boolean] = js.undefined
}
object DBCoreIndex {
  
  inline def apply(): DBCoreIndex = {
    val __obj = js.Dynamic.literal(extractKey = null, keyPath = null, name = null)
    __obj.asInstanceOf[DBCoreIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBCoreIndex] (val x: Self) extends AnyVal {
    
    inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
    
    inline def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
    
    inline def setExtractKey(value: /* value */ Any => Any): Self = StObject.set(x, "extractKey", js.Any.fromFunction1(value))
    
    inline def setExtractKeyNull: Self = StObject.set(x, "extractKey", null)
    
    inline def setIsPrimaryKey(value: Boolean): Self = StObject.set(x, "isPrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryKeyUndefined: Self = StObject.set(x, "isPrimaryKey", js.undefined)
    
    inline def setKeyPath(value: String | js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathNull: Self = StObject.set(x, "keyPath", null)
    
    inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
    
    inline def setMultiEntry(value: Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    inline def setMultiEntryUndefined: Self = StObject.set(x, "multiEntry", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setOutbound(value: Boolean): Self = StObject.set(x, "outbound", value.asInstanceOf[js.Any])
    
    inline def setOutboundUndefined: Self = StObject.set(x, "outbound", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
