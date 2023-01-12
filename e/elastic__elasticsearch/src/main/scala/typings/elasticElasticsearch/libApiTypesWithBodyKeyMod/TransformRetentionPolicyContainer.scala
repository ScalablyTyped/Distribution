package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformRetentionPolicyContainer extends StObject {
  
  var time: js.UndefOr[TransformRetentionPolicy] = js.undefined
}
object TransformRetentionPolicyContainer {
  
  inline def apply(): TransformRetentionPolicyContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformRetentionPolicyContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformRetentionPolicyContainer] (val x: Self) extends AnyVal {
    
    inline def setTime(value: TransformRetentionPolicy): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
