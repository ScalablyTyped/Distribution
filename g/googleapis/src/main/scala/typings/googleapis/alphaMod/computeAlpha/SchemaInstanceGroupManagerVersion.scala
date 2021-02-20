package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagerVersion extends StObject {
  
  var instanceTemplate: js.UndefOr[String] = js.native
  
  /**
    * Name of the version. Unique among all versions in the scope of this
    * managed instance group.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Tag describing the version. Used to trigger rollout of a target version
    * even if instance_template remains unchanged. Deprecated in favor of
    * &#39;name&#39;.
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * Specifies the intended number of instances to be created from the
    * instanceTemplate. The final number of instances created from the template
    * will be equal to:   - If expressed as a fixed number, the minimum of
    * either targetSize.fixed or instanceGroupManager.targetSize is used.  - if
    * expressed as a percent, the targetSize would be (targetSize.percent/100 *
    * InstanceGroupManager.targetSize) If there is a remainder, the number is
    * rounded up.  If unset, this version will update any remaining instances
    * not updated by another version. Read Starting a canary update for more
    * information.
    */
  var targetSize: js.UndefOr[SchemaFixedOrPercent] = js.native
}
object SchemaInstanceGroupManagerVersion {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerVersion]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerVersionMutableBuilder[Self <: SchemaInstanceGroupManagerVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTargetSize(value: SchemaFixedOrPercent): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
