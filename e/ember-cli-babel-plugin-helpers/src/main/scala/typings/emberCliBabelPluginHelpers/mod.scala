package typings.emberCliBabelPluginHelpers

import typings.emberCliBabelPluginHelpers.anon.Babel
import typings.emberCliBabelPluginHelpers.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ember-cli-babel-plugin-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addPlugin(config: js.Array[BabelPluginConfig], plugin: BabelPluginConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addPlugin(config: js.Array[BabelPluginConfig], plugin: BabelPluginConfig, options: AddPluginOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addPlugin(config: ConfigurationTarget, plugin: BabelPluginConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addPlugin(config: ConfigurationTarget, plugin: BabelPluginConfig, options: AddPluginOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def findPlugin(config: js.Array[BabelPluginConfig], plugin: String): js.UndefOr[BabelPluginConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[BabelPluginConfig]]
  @scala.inline
  def findPlugin(config: ConfigurationTarget, plugin: String): js.UndefOr[BabelPluginConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[BabelPluginConfig]]
  
  @scala.inline
  def hasPlugin(config: js.Array[BabelPluginConfig], plugin: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasPlugin(config: ConfigurationTarget, plugin: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AddPluginOptions extends StObject {
    
    /**
      * Any plugins that the given one must appear *after* in the plugins array.
      */
    var after: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Any plugins that the given one must appear *before* in the plugins array.
      */
    var before: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AddPluginOptions {
    
    @scala.inline
    def apply(): AddPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddPluginOptions]
    }
    
    @scala.inline
    implicit class AddPluginOptionsMutableBuilder[Self <: AddPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
    }
  }
  
  type BabelPlugin = String | Name
  
  type BabelPluginConfig = BabelPlugin | (js.Tuple3[BabelPlugin, js.UndefOr[js.Any], js.UndefOr[js.Any]])
  
  trait ConfigurationTarget extends StObject {
    
    var options: js.UndefOr[Babel] = js.undefined
  }
  object ConfigurationTarget {
    
    @scala.inline
    def apply(): ConfigurationTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationTarget]
    }
    
    @scala.inline
    implicit class ConfigurationTargetMutableBuilder[Self <: ConfigurationTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Babel): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
