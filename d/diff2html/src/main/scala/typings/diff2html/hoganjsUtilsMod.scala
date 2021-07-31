package typings.diff2html

import org.scalablytyped.runtime.StringDictionary
import typings.hoganJs.mod.Context
import typings.hoganJs.mod.Partials
import typings.hoganJs.mod.Template_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoganjsUtilsMod {
  
  @JSImport("diff2html/lib/hoganjs-utils", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with HoganJsUtils {
    def this(hasCompiledTemplatesRawTemplates: HoganJsUtilsConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("diff2html/lib/hoganjs-utils", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def compile(templateString: String): Template_ = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(templateString.asInstanceOf[js.Any]).asInstanceOf[Template_]
  }
  
  type CompiledTemplates = StringDictionary[Template_]
  
  @js.native
  trait HoganJsUtils extends StObject {
    
    var preCompiledTemplates: js.Any = js.native
    
    def render(namespace: String, view: String, params: Context): String = js.native
    def render(namespace: String, view: String, params: Context, partials: Unit, indent: String): String = js.native
    def render(namespace: String, view: String, params: Context, partials: Partials): String = js.native
    def render(namespace: String, view: String, params: Context, partials: Partials, indent: String): String = js.native
    
    def template(namespace: String, view: String): Template_ = js.native
    
    var templateKey: js.Any = js.native
  }
  
  trait HoganJsUtilsConfig extends StObject {
    
    var compiledTemplates: js.UndefOr[CompiledTemplates] = js.undefined
    
    var rawTemplates: js.UndefOr[RawTemplates] = js.undefined
  }
  object HoganJsUtilsConfig {
    
    @scala.inline
    def apply(): HoganJsUtilsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoganJsUtilsConfig]
    }
    
    @scala.inline
    implicit class HoganJsUtilsConfigMutableBuilder[Self <: HoganJsUtilsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiledTemplates(value: CompiledTemplates): Self = StObject.set(x, "compiledTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledTemplatesUndefined: Self = StObject.set(x, "compiledTemplates", js.undefined)
      
      @scala.inline
      def setRawTemplates(value: RawTemplates): Self = StObject.set(x, "rawTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTemplatesUndefined: Self = StObject.set(x, "rawTemplates", js.undefined)
    }
  }
  
  type RawTemplates = StringDictionary[String]
}
