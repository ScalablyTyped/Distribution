package typings.dot

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dot", "compile")
  @js.native
  def compile(tmpl: String): RenderFunction = js.native
  @JSImport("dot", "compile")
  @js.native
  def compile(tmpl: String, `def`: js.Object): RenderFunction = js.native
  
  @JSImport("dot", "template")
  @js.native
  def template(tmpl: String): RenderFunction = js.native
  @JSImport("dot", "template")
  @js.native
  def template(tmpl: String, c: js.UndefOr[scala.Nothing], `def`: js.Object): RenderFunction = js.native
  @JSImport("dot", "template")
  @js.native
  def template(tmpl: String, c: TemplateSettings_): RenderFunction = js.native
  @JSImport("dot", "template")
  @js.native
  def template(tmpl: String, c: TemplateSettings_, `def`: js.Object): RenderFunction = js.native
  
  @JSImport("dot", "templateSettings")
  @js.native
  def templateSettings: TemplateSettings_ = js.native
  @scala.inline
  def templateSettings_=(x: TemplateSettings_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templateSettings")(x.asInstanceOf[js.Any])
  
  @JSImport("dot", "version")
  @js.native
  val version: String = js.native
  
  type RenderFunction = js.Function1[/* repeated */ js.Any, String]
  
  @js.native
  trait TemplateSettings_ extends StObject {
    
    var append: Boolean = js.native
    
    var conditional: RegExp = js.native
    
    var define: RegExp = js.native
    
    var defineParams: RegExp = js.native
    
    var encode: RegExp = js.native
    
    var evaluate: RegExp = js.native
    
    var interpolate: RegExp = js.native
    
    var iterate: RegExp = js.native
    
    var selfcontained: Boolean = js.native
    
    var strip: Boolean = js.native
    
    var use: RegExp = js.native
    
    var useParams: RegExp = js.native
    
    var varname: String = js.native
  }
  object TemplateSettings_ {
    
    @scala.inline
    def apply(
      append: Boolean,
      conditional: RegExp,
      define: RegExp,
      defineParams: RegExp,
      encode: RegExp,
      evaluate: RegExp,
      interpolate: RegExp,
      iterate: RegExp,
      selfcontained: Boolean,
      strip: Boolean,
      use: RegExp,
      useParams: RegExp,
      varname: String
    ): TemplateSettings_ = {
      val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], define = define.asInstanceOf[js.Any], defineParams = defineParams.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], iterate = iterate.asInstanceOf[js.Any], selfcontained = selfcontained.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], useParams = useParams.asInstanceOf[js.Any], varname = varname.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateSettings_]
    }
    
    @scala.inline
    implicit class TemplateSettings_MutableBuilder[Self <: TemplateSettings_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditional(value: RegExp): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefine(value: RegExp): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefineParams(value: RegExp): Self = StObject.set(x, "defineParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncode(value: RegExp): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluate(value: RegExp): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolate(value: RegExp): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterate(value: RegExp): Self = StObject.set(x, "iterate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfcontained(value: Boolean): Self = StObject.set(x, "selfcontained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse(value: RegExp): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseParams(value: RegExp): Self = StObject.set(x, "useParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarname(value: String): Self = StObject.set(x, "varname", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait String extends StObject {
      
      def encodeHTML(): java.lang.String = js.native
    }
    object String {
      
      @scala.inline
      def apply(encodeHTML: () => java.lang.String): typings.dot.mod.global.String = {
        val __obj = js.Dynamic.literal(encodeHTML = js.Any.fromFunction0(encodeHTML))
        __obj.asInstanceOf[typings.dot.mod.global.String]
      }
      
      @scala.inline
      implicit class StringMutableBuilder[Self <: typings.dot.mod.global.String] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEncodeHTML(value: () => java.lang.String): Self = StObject.set(x, "encodeHTML", js.Any.fromFunction0(value))
      }
    }
  }
}
