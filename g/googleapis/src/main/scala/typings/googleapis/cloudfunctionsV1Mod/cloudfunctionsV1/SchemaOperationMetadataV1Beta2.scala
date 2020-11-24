package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing an Operation
  */
@js.native
trait SchemaOperationMetadataV1Beta2 extends js.Object {
  
  /**
    * The original request that started the operation.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Type of operation.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The last update timestamp of the operation.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Version id of the function created or updated by an API call. This field
    * is only populated for Create and Update operations.
    */
  var versionId: js.UndefOr[String] = js.native
}
object SchemaOperationMetadataV1Beta2 {
  
  @scala.inline
  def apply(): SchemaOperationMetadataV1Beta2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1Beta2]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataV1Beta2Ops[Self <: SchemaOperationMetadataV1Beta2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(value: StringDictionary[js.Any]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
