package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModification extends StObject {
  
  /**
    * Create a new column family with the specified schema, or fail if one already exists with the given ID.
    */
  var create: js.UndefOr[SchemaColumnFamily] = js.undefined
  
  /**
    * Drop (delete) the column family with the given ID, or fail if no such family exists.
    */
  var drop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The ID of the column family to be modified.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Update an existing column family to the specified schema, or fail if no column family exists with the given ID.
    */
  var update: js.UndefOr[SchemaColumnFamily] = js.undefined
}
object SchemaModification {
  
  inline def apply(): SchemaModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModification]
  }
  
  extension [Self <: SchemaModification](x: Self) {
    
    inline def setCreate(value: SchemaColumnFamily): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropNull: Self = StObject.set(x, "drop", null)
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUpdate(value: SchemaColumnFamily): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
