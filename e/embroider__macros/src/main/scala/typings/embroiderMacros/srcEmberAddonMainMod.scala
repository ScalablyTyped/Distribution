package typings.embroiderMacros

import typings.embroiderMacros.embroiderMacrosStrings.parent
import typings.embroiderMacros.embroiderMacrosStrings.self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEmberAddonMainMod {
  
  @JSImport("@embroider/macros/src/ember-addon-main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def included(parent: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("included")(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def installBabelPlugin(appOrAddonInstance: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installBabelPlugin")(appOrAddonInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@embroider/macros/src/ember-addon-main", "name")
  @js.native
  def name: String = js.native
  inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  inline def setupPreprocessorRegistry(`type`: parent | self, registry: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupPreprocessorRegistry")(`type`.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
