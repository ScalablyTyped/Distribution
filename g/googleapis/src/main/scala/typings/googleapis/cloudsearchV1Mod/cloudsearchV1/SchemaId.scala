package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaId extends StObject {
  
  /**
    * The User account in which the DirEntry was originally created. If name_space==GAIA, then it's the gaia_id of the user this id is referring to.
    */
  var creatorUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The local identifier for the DirEntry (local to the creator's account). local_id + app_name is guaranteed to be unique within the creator account, but not across all User accounts. The string is case sensitive. Ignore if name_space==GAIA. NB For name_space==COSMO, all local_id's should be defined in google3/java/com/google/storage/cosmo/server/api/SpecialObjectIds.java as they have a special predefined meaning. See cosmo.client.CosmoIdFactory.createObjectId(long,String) for IMPORTANT recommendations when generating IDs.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name space in which this id is unique (typically the application that created it). Values should be drawn from the above enum, but for experimentation, use values greater than 1000.
    */
  var nameSpace: js.UndefOr[Double | Null] = js.undefined
}
object SchemaId {
  
  inline def apply(): SchemaId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaId]
  }
  
  extension [Self <: SchemaId](x: Self) {
    
    inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdNull: Self = StObject.set(x, "creatorUserId", null)
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setNameSpace(value: Double): Self = StObject.set(x, "nameSpace", value.asInstanceOf[js.Any])
    
    inline def setNameSpaceNull: Self = StObject.set(x, "nameSpace", null)
    
    inline def setNameSpaceUndefined: Self = StObject.set(x, "nameSpace", js.undefined)
  }
}
