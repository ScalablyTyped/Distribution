package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A compliance rule condition which is satisfied if the Android Framework API
  * level on the device doesn&#39;t meet a minimum requirement. There can only
  * be one rule with this type of condition per policy.
  */
@js.native
trait SchemaApiLevelCondition extends StObject {
  
  /**
    * The minimum desired Android Framework API level. If the device
    * doesn&#39;t meet the minimum requirement, this condition is satisfied.
    * Must be greater than zero.
    */
  var minApiLevel: js.UndefOr[Double] = js.native
}
object SchemaApiLevelCondition {
  
  @scala.inline
  def apply(): SchemaApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiLevelCondition]
  }
  
  @scala.inline
  implicit class SchemaApiLevelConditionMutableBuilder[Self <: SchemaApiLevelCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinApiLevel(value: Double): Self = StObject.set(x, "minApiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinApiLevelUndefined: Self = StObject.set(x, "minApiLevel", js.undefined)
  }
}
