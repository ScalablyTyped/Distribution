package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A create, update, or delete of a particular column family.
  */
trait SchemaModification extends StObject {
  
  /**
    * Create a new column family with the specified schema, or fail if one
    * already exists with the given ID.
    */
  var create: js.UndefOr[SchemaColumnFamily] = js.undefined
  
  /**
    * Drop (delete) the column family with the given ID, or fail if no such
    * family exists.
    */
  var drop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the column family to be modified.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Update an existing column family to the specified schema, or fail if no
    * column family exists with the given ID.
    */
  var update: js.UndefOr[SchemaColumnFamily] = js.undefined
}
object SchemaModification {
  
  @scala.inline
  def apply(): SchemaModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModification]
  }
  
  @scala.inline
  implicit class SchemaModificationMutableBuilder[Self <: SchemaModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: SchemaColumnFamily): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setUpdate(value: SchemaColumnFamily): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
