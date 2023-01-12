package typings.dot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(tmpl: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(tmpl.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
  inline def compile(tmpl: String, `def`: js.Object): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(tmpl.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
  
  inline def template(tmpl: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
  inline def template(tmpl: String, c: Unit, `def`: js.Object): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], c.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
  inline def template(tmpl: String, c: TemplateSettings_): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
  inline def template(tmpl: String, c: TemplateSettings_, `def`: js.Object): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], c.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
  
  @JSImport("dot", "templateSettings")
  @js.native
  def templateSettings: TemplateSettings_ = js.native
  inline def templateSettings_=(x: TemplateSettings_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templateSettings")(x.asInstanceOf[js.Any])
  
  @JSImport("dot", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait RenderFunction extends StObject {
    
    def apply(args: Any*): String = js.native
  }
  
  trait TemplateSettings_ extends StObject {
    
    var append: Boolean
    
    var conditional: js.RegExp
    
    var define: js.RegExp
    
    var defineParams: js.RegExp
    
    var encode: js.RegExp
    
    var evaluate: js.RegExp
    
    var interpolate: js.RegExp
    
    var iterate: js.RegExp
    
    var selfcontained: Boolean
    
    var strip: Boolean
    
    var use: js.RegExp
    
    var useParams: js.RegExp
    
    var varname: String
  }
  object TemplateSettings_ {
    
    inline def apply(
      append: Boolean,
      conditional: js.RegExp,
      define: js.RegExp,
      defineParams: js.RegExp,
      encode: js.RegExp,
      evaluate: js.RegExp,
      interpolate: js.RegExp,
      iterate: js.RegExp,
      selfcontained: Boolean,
      strip: Boolean,
      use: js.RegExp,
      useParams: js.RegExp,
      varname: String
    ): TemplateSettings_ = {
      val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], define = define.asInstanceOf[js.Any], defineParams = defineParams.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], iterate = iterate.asInstanceOf[js.Any], selfcontained = selfcontained.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], useParams = useParams.asInstanceOf[js.Any], varname = varname.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateSettings_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateSettings_] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setConditional(value: js.RegExp): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
      
      inline def setDefine(value: js.RegExp): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
      
      inline def setDefineParams(value: js.RegExp): Self = StObject.set(x, "defineParams", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: js.RegExp): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEvaluate(value: js.RegExp): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      inline def setInterpolate(value: js.RegExp): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setIterate(value: js.RegExp): Self = StObject.set(x, "iterate", value.asInstanceOf[js.Any])
      
      inline def setSelfcontained(value: Boolean): Self = StObject.set(x, "selfcontained", value.asInstanceOf[js.Any])
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setUse(value: js.RegExp): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseParams(value: js.RegExp): Self = StObject.set(x, "useParams", value.asInstanceOf[js.Any])
      
      inline def setVarname(value: String): Self = StObject.set(x, "varname", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait String extends StObject {
      
      def encodeHTML(): java.lang.String
    }
    object String {
      
      inline def apply(encodeHTML: () => java.lang.String): typings.dot.mod.global.String = {
        val __obj = js.Dynamic.literal(encodeHTML = js.Any.fromFunction0(encodeHTML))
        __obj.asInstanceOf[typings.dot.mod.global.String]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.dot.mod.global.String] (val x: Self) extends AnyVal {
        
        inline def setEncodeHTML(value: () => java.lang.String): Self = StObject.set(x, "encodeHTML", js.Any.fromFunction0(value))
      }
    }
  }
}
