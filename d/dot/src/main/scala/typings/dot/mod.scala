package typings.dot

import typings.std.RegExp
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
    
    def apply(args: js.Any*): String = js.native
  }
  
  trait TemplateSettings_ extends StObject {
    
    var append: Boolean
    
    var conditional: RegExp
    
    var define: RegExp
    
    var defineParams: RegExp
    
    var encode: RegExp
    
    var evaluate: RegExp
    
    var interpolate: RegExp
    
    var iterate: RegExp
    
    var selfcontained: Boolean
    
    var strip: Boolean
    
    var use: RegExp
    
    var useParams: RegExp
    
    var varname: String
  }
  object TemplateSettings_ {
    
    inline def apply(
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
    
    extension [Self <: TemplateSettings_](x: Self) {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setConditional(value: RegExp): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
      
      inline def setDefine(value: RegExp): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
      
      inline def setDefineParams(value: RegExp): Self = StObject.set(x, "defineParams", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: RegExp): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEvaluate(value: RegExp): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      inline def setInterpolate(value: RegExp): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setIterate(value: RegExp): Self = StObject.set(x, "iterate", value.asInstanceOf[js.Any])
      
      inline def setSelfcontained(value: Boolean): Self = StObject.set(x, "selfcontained", value.asInstanceOf[js.Any])
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setUse(value: RegExp): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseParams(value: RegExp): Self = StObject.set(x, "useParams", value.asInstanceOf[js.Any])
      
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
      
      extension [Self <: typings.dot.mod.global.String](x: Self) {
        
        inline def setEncodeHTML(value: () => java.lang.String): Self = StObject.set(x, "encodeHTML", js.Any.fromFunction0(value))
      }
    }
  }
}
