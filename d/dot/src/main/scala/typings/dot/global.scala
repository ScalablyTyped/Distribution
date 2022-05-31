package typings.dot

import typings.dot.mod.RenderFunction
import typings.dot.mod.TemplateSettings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object doT {
    
    @JSGlobal("doT")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compile(tmpl: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(tmpl.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
    inline def compile(tmpl: String, `def`: js.Object): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(tmpl.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    
    inline def template(tmpl: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
    inline def template(tmpl: String, c: Unit, `def`: js.Object): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], c.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    inline def template(tmpl: String, c: TemplateSettings_): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    inline def template(tmpl: String, c: TemplateSettings_, `def`: js.Object): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], c.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    
    @JSGlobal("doT.templateSettings")
    @js.native
    def templateSettings: TemplateSettings_ = js.native
    inline def templateSettings_=(x: TemplateSettings_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templateSettings")(x.asInstanceOf[js.Any])
    
    @JSGlobal("doT.version")
    @js.native
    val version: String = js.native
  }
}
