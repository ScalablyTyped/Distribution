package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `AccessLevel` is a label that can be applied to requests to GCP
  * services, along with a list of requirements necessary for the label to be
  * applied.
  */
trait SchemaAccessLevel extends StObject {
  
  /**
    * A `BasicLevel` composed of `Conditions`.
    */
  var basic: js.UndefOr[SchemaBasicLevel] = js.undefined
  
  /**
    * Output only. Time the `AccessLevel` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the `AccessLevel` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for the Access Level. The `short_name` component
    * must begin with a letter and only include alphanumeric and &#39;_&#39;.
    * Format: `accessPolicies/{policy_id}/accessLevels/{short_name}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time the `AccessLevel` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaAccessLevel {
  
  @scala.inline
  def apply(): SchemaAccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessLevel]
  }
  
  @scala.inline
  implicit class SchemaAccessLevelMutableBuilder[Self <: SchemaAccessLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasic(value: SchemaBasicLevel): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
