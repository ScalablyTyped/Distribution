package typings.devextreme.mod.default

import typings.devextreme.anon.Container
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.Template_
import typings.devextreme.mod.DevExpress.core.dxTemplateOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("devextreme", "default.core.FunctionTemplate")
  @js.native
  open class FunctionTemplate ()
    extends StObject
       with typings.devextreme.mod.DevExpress.core.FunctionTemplate {
    
    /* CompleteClass */
    override def render(template: Container): DxElement_[HTMLElement] = js.native
  }
  
  @JSImport("devextreme", "default.core.Template")
  @js.native
  open class Template ()
    extends StObject
       with Template_ {
    def this(options: dxTemplateOptions) = this()
  }
  
  @JSImport("devextreme", "default.core.TemplateManager")
  @js.native
  open class TemplateManager ()
    extends StObject
       with typings.devextreme.mod.DevExpress.core.TemplateManager {
    
    /* CompleteClass */
    override def addDefaultTemplates(templates: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    var anonymousTemplateName: String = js.native
  }
}
