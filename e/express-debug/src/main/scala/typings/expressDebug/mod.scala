package typings.expressDebug

import typings.express.mod.Application_
import typings.express.mod.Request_
import typings.expressDebug.anon.Depth
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Node.js middleware for serving a favicon.
    */
  @JSImport("express-debug", JSImport.Namespace)
  @js.native
  def apply(app: Application_): Unit = js.native
  @JSImport("express-debug", JSImport.Namespace)
  @js.native
  def apply(app: Application_, settings: Depth): Unit = js.native
  
  @js.native
  trait CustomPanel extends StObject {
    
    @JSName("finalize")
    var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
    
    var initialize: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
    
    var name: String = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    var post_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
    
    var pre_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
    
    def process(locals: js.Any): js.Any = js.native
    
    var standalone: js.UndefOr[Boolean] = js.native
    
    var template: String = js.native
  }
  object CustomPanel {
    
    @scala.inline
    def apply(name: String, process: js.Any => js.Any, template: String): CustomPanel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPanel]
    }
    
    @scala.inline
    implicit class CustomPanelMutableBuilder[Self <: CustomPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalize_(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = StObject.set(x, "finalize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      @scala.inline
      def setInitialize(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPost_render(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = StObject.set(x, "post_render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPost_renderUndefined: Self = StObject.set(x, "post_render", js.undefined)
      
      @scala.inline
      def setPre_render(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = StObject.set(x, "pre_render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPre_renderUndefined: Self = StObject.set(x, "pre_render", js.undefined)
      
      @scala.inline
      def setProcess(value: js.Any => js.Any): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
