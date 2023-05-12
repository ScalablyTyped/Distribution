package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceOfConfig extends StObject {
  
  def sourceOfConfig(config: js.Object): Root
  @JSName("sourceOfConfig")
  var sourceOfConfig_Original: typings.embroiderMacros.srcMacrosConfigMod.SourceOfConfig
}
object SourceOfConfig {
  
  inline def apply(sourceOfConfig: /* config */ js.Object => Root): SourceOfConfig = {
    val __obj = js.Dynamic.literal(sourceOfConfig = js.Any.fromFunction1(sourceOfConfig))
    __obj.asInstanceOf[SourceOfConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceOfConfig] (val x: Self) extends AnyVal {
    
    inline def setSourceOfConfig(value: /* config */ js.Object => Root): Self = StObject.set(x, "sourceOfConfig", js.Any.fromFunction1(value))
  }
}
