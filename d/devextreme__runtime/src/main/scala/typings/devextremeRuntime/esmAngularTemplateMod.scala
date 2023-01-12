package typings.devextremeRuntime

import typings.devextremeRuntime.anon.HTMLElementgetindexnumber
import typings.devextremeRuntime.anon.HTMLElementgetindexnumberATTRIBUTENODE
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAngularTemplateMod {
  
  @JSImport("@devextreme/runtime/esm/angular/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasTemplate(name: String, props: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasTemplate(name: String, props: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def renderTemplate(template: Any, model: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: Any, model: IModel, component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IModel extends StObject {
    
    var container: HTMLElementgetindexnumberATTRIBUTENODE
    
    var index: Double
    
    var item: HTMLElementgetindexnumber | Any
  }
  object IModel {
    
    inline def apply(
      container: HTMLElementgetindexnumberATTRIBUTENODE,
      index: Double,
      item: HTMLElementgetindexnumber | Any
    ): IModel = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElementgetindexnumberATTRIBUTENODE): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: HTMLElementgetindexnumber | Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
