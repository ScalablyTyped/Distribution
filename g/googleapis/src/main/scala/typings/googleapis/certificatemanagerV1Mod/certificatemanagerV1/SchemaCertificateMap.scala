package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateMap extends StObject {
  
  /**
    * Output only. The creation timestamp of a Certificate Map.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more paragraphs of text description of a certificate map.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of GCLB targets which use this Certificate Map.
    */
  var gclbTargets: js.UndefOr[js.Array[SchemaGclbTarget]] = js.undefined
  
  /**
    * Set of labels associated with a Certificate Map.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A user-defined name of the Certificate Map. Certificate Map names must be unique globally and match pattern `projects/x/locations/x/certificateMaps/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The update timestamp of a Certificate Map.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateMap {
  
  inline def apply(): SchemaCertificateMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateMap]
  }
  
  extension [Self <: SchemaCertificateMap](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGclbTargets(value: js.Array[SchemaGclbTarget]): Self = StObject.set(x, "gclbTargets", value.asInstanceOf[js.Any])
    
    inline def setGclbTargetsUndefined: Self = StObject.set(x, "gclbTargets", js.undefined)
    
    inline def setGclbTargetsVarargs(value: SchemaGclbTarget*): Self = StObject.set(x, "gclbTargets", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
