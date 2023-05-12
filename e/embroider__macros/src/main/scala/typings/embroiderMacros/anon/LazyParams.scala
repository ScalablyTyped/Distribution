package typings.embroiderMacros.anon

import typings.embroiderMacros.srcGlimmerAstTransformMod.FirstTransformParams
import typings.embroiderMacros.srcMacrosConfigMod.MacrosConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazyParams extends StObject {
  
  var lazyParams: FirstTransformParams
  
  var plugins: js.Array[js.Function]
  
  def setConfig(config: MacrosConfig): Unit
}
object LazyParams {
  
  inline def apply(lazyParams: FirstTransformParams, plugins: js.Array[js.Function], setConfig: MacrosConfig => Unit): LazyParams = {
    val __obj = js.Dynamic.literal(lazyParams = lazyParams.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1(setConfig))
    __obj.asInstanceOf[LazyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LazyParams] (val x: Self) extends AnyVal {
    
    inline def setLazyParams(value: FirstTransformParams): Self = StObject.set(x, "lazyParams", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[js.Function]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: js.Function*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setSetConfig(value: MacrosConfig => Unit): Self = StObject.set(x, "setConfig", js.Any.fromFunction1(value))
  }
}
