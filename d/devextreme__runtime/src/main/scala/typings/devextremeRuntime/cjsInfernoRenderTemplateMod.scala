package typings.devextremeRuntime

import typings.devextremeRuntime.anon.HTMLElementgetindexnumber
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoRenderTemplateMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno/render_template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasTemplate(name: String, properties: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def renderTemplate(template: String, props: IProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: String, props: IProps, _component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IProps extends StObject {
    
    var container: HTMLElementgetindexnumber
    
    var index: Double
    
    var item: HTMLElementgetindexnumber | Any
  }
  object IProps {
    
    inline def apply(container: HTMLElementgetindexnumber, index: Double, item: HTMLElementgetindexnumber | Any): IProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProps]
    }
    
    extension [Self <: IProps](x: Self) {
      
      inline def setContainer(value: HTMLElementgetindexnumber): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: HTMLElementgetindexnumber | Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
