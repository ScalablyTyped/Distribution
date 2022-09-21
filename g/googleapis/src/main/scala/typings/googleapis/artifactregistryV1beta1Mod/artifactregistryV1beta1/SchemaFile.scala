package typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFile extends StObject {
  
  /**
    * The time when the File was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hashes of the file content.
    */
  var hashes: js.UndefOr[js.Array[SchemaHash]] = js.undefined
  
  /**
    * The name of the file, for example: "projects/p1/locations/us-central1/repositories/repo1/files/a%2Fb%2Fc.txt". If the file ID part contains slashes, they are escaped.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Package or Version that owns this file, if any.
    */
  var owner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the File in bytes.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the File was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFile {
  
  inline def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  extension [Self <: SchemaFile](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setHashes(value: js.Array[SchemaHash]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setHashesVarargs(value: SchemaHash*): Self = StObject.set(x, "hashes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
