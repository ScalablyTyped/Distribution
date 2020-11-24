package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Instance Template resource. (== resource_for beta.instanceTemplates ==)
  * (== resource_for v1.instanceTemplates ==)
  */
@js.native
trait SchemaInstanceTemplate extends js.Object {
  
  /**
    * [Output Only] The creation timestamp for this instance template in
    * RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A unique identifier for this instance template. The server
    * defines this identifier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The resource type, which is always compute#instanceTemplate
    * for instance templates.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The instance properties for this instance template.
    */
  var properties: js.UndefOr[SchemaInstanceProperties] = js.native
  
  /**
    * [Output Only] The URL for this instance template. The server defines this
    * URL.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The source instance used to create the template. You can provide this as
    * a partial or full URL to the resource. For example, the following are
    * valid values:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String] = js.native
  
  /**
    * The source instance params to use to create this instance template.
    */
  var sourceInstanceParams: js.UndefOr[SchemaSourceInstanceParams] = js.native
}
object SchemaInstanceTemplate {
  
  @scala.inline
  def apply(): SchemaInstanceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceTemplate]
  }
  
  @scala.inline
  implicit class SchemaInstanceTemplateOps[Self <: SchemaInstanceTemplate] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProperties(value: SchemaInstanceProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSourceInstance(value: String): Self = this.set("sourceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstance: Self = this.set("sourceInstance", js.undefined)
    
    @scala.inline
    def setSourceInstanceParams(value: SchemaSourceInstanceParams): Self = this.set("sourceInstanceParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstanceParams: Self = this.set("sourceInstanceParams", js.undefined)
  }
}
