package typings.giraffe

import typings.backbone.mod.Events
import typings.giraffe.Giraffe.App
import typings.giraffe.Giraffe.AppMap
import typings.giraffe.Giraffe.DefaultOptions
import typings.giraffe.Giraffe.GiraffeObject
import typings.giraffe.Giraffe.ViewMap
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Giraffe {
    
    @JSGlobal("Giraffe")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Giraffe.App")
    @js.native
    class App_ () extends App
    
    @JSGlobal("Giraffe.Collection")
    @js.native
    class Collection[TModel /* <: typings.giraffe.Giraffe.Model */] ()
      extends typings.giraffe.Giraffe.Collection[TModel]
    
    object Contrib {
      
      @JSGlobal("Giraffe.Contrib.CollectionView")
      @js.native
      class CollectionView[TModel /* <: typings.giraffe.Giraffe.Model */] ()
        extends typings.giraffe.Giraffe.Contrib.CollectionView[TModel]
      object CollectionView {
        
        /* static member */
        @JSGlobal("Giraffe.Contrib.CollectionView.getDefaults")
        @js.native
        def getDefaults(ctx: js.Any): js.Any = js.native
      }
      
      @JSGlobal("Giraffe.Contrib.Controller")
      @js.native
      class Controller ()
        extends typings.giraffe.Giraffe.Contrib.Controller
      
      @JSGlobal("Giraffe.Contrib.FastCollectionView")
      @js.native
      class FastCollectionView[TModel /* <: typings.giraffe.Giraffe.Model */] ()
        extends typings.giraffe.Giraffe.Contrib.FastCollectionView[TModel]
      object FastCollectionView {
        
        /* static member */
        @JSGlobal("Giraffe.Contrib.FastCollectionView.getDefaults")
        @js.native
        def getDefaults(ctx: js.Any): js.Any = js.native
      }
    }
    
    @JSGlobal("Giraffe.Model")
    @js.native
    class Model ()
      extends typings.giraffe.Giraffe.Model
    
    @JSGlobal("Giraffe.Router")
    @js.native
    class Router ()
      extends typings.giraffe.Giraffe.Router
    
    @JSGlobal("Giraffe.View")
    @js.native
    class View[TModel /* <: typings.giraffe.Giraffe.Model */] ()
      extends typings.giraffe.Giraffe.View[TModel]
    object View {
      
      /* static member */
      @JSGlobal("Giraffe.View.detachByElement")
      @js.native
      def detachByElement(el: js.Any): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
      @JSGlobal("Giraffe.View.detachByElement")
      @js.native
      def detachByElement(el: js.Any, preserve: Boolean): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.getByCid")
      @js.native
      def getByCid(cid: String): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.getClosestView")
      @js.native
      def getClosestView[TModel](el: js.Any): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.removeDocumentEvents")
      @js.native
      def removeDocumentEvents(): js.Any = js.native
      @JSGlobal("Giraffe.View.removeDocumentEvents")
      @js.native
      def removeDocumentEvents(prefix: String): js.Any = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.setDocumentEventPrefix")
      @js.native
      def setDocumentEventPrefix(): js.Any = js.native
      @JSGlobal("Giraffe.View.setDocumentEventPrefix")
      @js.native
      def setDocumentEventPrefix(prefix: String): js.Any = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.setDocumentEvents")
      @js.native
      def setDocumentEvents(events: js.Array[String]): js.Array[String] = js.native
      @JSGlobal("Giraffe.View.setDocumentEvents")
      @js.native
      def setDocumentEvents(events: js.Array[String], prefix: String): js.Array[String] = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.setTemplateStrategy")
      @js.native
      def setTemplateStrategy(strategy: js.Any): js.Any = js.native
      @JSGlobal("Giraffe.View.setTemplateStrategy")
      @js.native
      def setTemplateStrategy(strategy: js.Any, instance: js.Any): js.Any = js.native
      
      /* static member */
      @JSGlobal("Giraffe.View.to$El")
      @js.native
      def toEl(el: js.Any): JQuery[HTMLElement] = js.native
      @JSGlobal("Giraffe.View.to$El")
      @js.native
      def toEl(el: js.Any, parent: js.UndefOr[scala.Nothing], allowParentMatch: Boolean): JQuery[HTMLElement] = js.native
      @JSGlobal("Giraffe.View.to$El")
      @js.native
      def toEl(el: js.Any, parent: js.Any): JQuery[HTMLElement] = js.native
      @JSGlobal("Giraffe.View.to$El")
      @js.native
      def toEl(el: js.Any, parent: js.Any, allowParentMatch: Boolean): JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("Giraffe.app")
    @js.native
    def app: App = js.native
    @scala.inline
    def app_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.apps")
    @js.native
    def apps: AppMap = js.native
    @scala.inline
    def apps_=(x: AppMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.bindAppEvents")
    @js.native
    def bindAppEvents(instance: GiraffeObject): GiraffeObject = js.native
    
    @JSGlobal("Giraffe.bindDataEvents")
    @js.native
    def bindDataEvents(instance: GiraffeObject): GiraffeObject = js.native
    
    @JSGlobal("Giraffe.bindEvent")
    @js.native
    def bindEvent(context: Events, target: Events, event: js.Any, callback: js.Function): js.Any = js.native
    
    @JSGlobal("Giraffe.bindEventMap")
    @js.native
    def bindEventMap(context: Events, target: Events, eventMap: js.Any): js.Any = js.native
    
    @JSGlobal("Giraffe.configure")
    @js.native
    def configure(instance: js.Any): js.Any = js.native
    @JSGlobal("Giraffe.configure")
    @js.native
    def configure(instance: js.Any, options: js.Any): js.Any = js.native
    
    @JSGlobal("Giraffe.defaultOptions")
    @js.native
    def defaultOptions: DefaultOptions = js.native
    @scala.inline
    def defaultOptions_=(x: DefaultOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.dispose")
    @js.native
    def dispose(instance: GiraffeObject, args: js.Any*): GiraffeObject = js.native
    
    @JSGlobal("Giraffe.disposeThis")
    @js.native
    def disposeThis(args: js.Any*): GiraffeObject = js.native
    
    @JSGlobal("Giraffe.unbindEvent")
    @js.native
    def unbindEvent(context: Events, target: Events, event: js.Any, callback: js.Function): js.Any = js.native
    
    @JSGlobal("Giraffe.unbindEventMap")
    @js.native
    def unbindEventMap(context: Events, target: Events, eventMap: js.Any): js.Any = js.native
    
    @JSGlobal("Giraffe.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.views")
    @js.native
    def views: ViewMap[typings.giraffe.Giraffe.Model] = js.native
    @scala.inline
    def views_=(x: ViewMap[typings.giraffe.Giraffe.Model]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.wrapFn")
    @js.native
    def wrapFn(obj: js.Any, name: String, before: js.Function, after: js.Function): js.Any = js.native
  }
}
