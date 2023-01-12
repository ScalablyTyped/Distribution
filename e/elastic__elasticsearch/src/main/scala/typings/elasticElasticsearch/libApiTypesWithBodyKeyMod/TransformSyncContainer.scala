package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformSyncContainer extends StObject {
  
  var time: js.UndefOr[TransformTimeSync] = js.undefined
}
object TransformSyncContainer {
  
  inline def apply(): TransformSyncContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformSyncContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformSyncContainer] (val x: Self) extends AnyVal {
    
    inline def setTime(value: TransformTimeSync): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
