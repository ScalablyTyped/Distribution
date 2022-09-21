package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryPipeline extends StObject {
  
  /**
    * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Information around the state of the Delivery Pipeline.
    */
  var condition: js.UndefOr[SchemaPipelineCondition] = js.undefined
  
  /**
    * Output only. Time at which the pipeline was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the `DeliveryPipeline`. Max length is 255 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Name of the `DeliveryPipeline`. Format is projects/{project\}/ locations/{location\}/deliveryPipelines/a-z{0,62\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
    */
  var serialPipeline: js.UndefOr[SchemaSerialPipeline] = js.undefined
  
  /**
    * When suspended, no new releases or rollouts can be created, but in-progress ones will complete.
    */
  var suspended: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Unique identifier of the `DeliveryPipeline`.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Most recent time at which the pipeline was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryPipeline {
  
  inline def apply(): SchemaDeliveryPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryPipeline]
  }
  
  extension [Self <: SchemaDeliveryPipeline](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCondition(value: SchemaPipelineCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSerialPipeline(value: SchemaSerialPipeline): Self = StObject.set(x, "serialPipeline", value.asInstanceOf[js.Any])
    
    inline def setSerialPipelineUndefined: Self = StObject.set(x, "serialPipeline", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
