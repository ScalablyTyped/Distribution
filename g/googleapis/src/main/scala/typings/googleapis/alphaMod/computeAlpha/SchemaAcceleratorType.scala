package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Accelerator Type resource. (== resource_for beta.acceleratorTypes ==)
  * (== resource_for v1.acceleratorTypes ==)
  */
@js.native
trait SchemaAcceleratorType extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The deprecation status associated with this accelerator
    * type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The type of the resource. Always compute#acceleratorType
    * for accelerator types.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Maximum accelerator cards allowed per instance.
    */
  var maximumCardsPerInstance: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for this resource&#39;s resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The name of the zone where the accelerator type resides,
    * such as us-central1-a. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaAcceleratorType {
  
  @scala.inline
  def apply(): SchemaAcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorType]
  }
  
  @scala.inline
  implicit class SchemaAcceleratorTypeMutableBuilder[Self <: SchemaAcceleratorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeprecated(value: SchemaDeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaximumCardsPerInstance(value: Double): Self = StObject.set(x, "maximumCardsPerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumCardsPerInstanceUndefined: Self = StObject.set(x, "maximumCardsPerInstance", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
