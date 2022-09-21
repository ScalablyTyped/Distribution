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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Giraffe {
    
    @JSGlobal("Giraffe")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Giraffe.App")
    @js.native
    open class App_ () extends App
    
    @JSGlobal("Giraffe.Collection")
    @js.native
    open class Collection[TModel /* <: typings.giraffe.Giraffe.Model */] ()
      extends typings.giraffe.Giraffe.Collection[TModel]
    
    object Contrib {
      
      @JSGlobal("Giraffe.Contrib.CollectionView")
      @js.native
      open class CollectionView[TModel /* <: typings.giraffe.Giraffe.Model */] ()
        extends typings.giraffe.Giraffe.Contrib.CollectionView[TModel]
      object CollectionView {
        
        @JSGlobal("Giraffe.Contrib.CollectionView")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def getDefaults(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
      }
      
      @JSGlobal("Giraffe.Contrib.Controller")
      @js.native
      open class Controller ()
        extends typings.giraffe.Giraffe.Contrib.Controller {
        
        /* CompleteClass */
        var app: App = js.native
      }
      
      @JSGlobal("Giraffe.Contrib.FastCollectionView")
      @js.native
      open class FastCollectionView[TModel /* <: typings.giraffe.Giraffe.Model */] ()
        extends typings.giraffe.Giraffe.Contrib.FastCollectionView[TModel]
      object FastCollectionView {
        
        @JSGlobal("Giraffe.Contrib.FastCollectionView")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def getDefaults(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
      }
    }
    
    @JSGlobal("Giraffe.Model")
    @js.native
    open class Model ()
      extends typings.giraffe.Giraffe.Model
    
    @JSGlobal("Giraffe.Router")
    @js.native
    open class Router ()
      extends typings.giraffe.Giraffe.Router
    
    @JSGlobal("Giraffe.View")
    @js.native
    open class View[TModel /* <: typings.giraffe.Giraffe.Model */] ()
      extends typings.giraffe.Giraffe.View[TModel]
    object View {
      
      @JSGlobal("Giraffe.View")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def detachByElement(el: Any): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("detachByElement")(el.asInstanceOf[js.Any]).asInstanceOf[typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model]]
      inline def detachByElement(el: Any, preserve: Boolean): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = (^.asInstanceOf[js.Dynamic].applyDynamic("detachByElement")(el.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model]]
      
      /* static member */
      inline def getByCid(cid: String): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByCid")(cid.asInstanceOf[js.Any]).asInstanceOf[typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model]]
      
      /* static member */
      inline def getClosestView[TModel](el: Any): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClosestView")(el.asInstanceOf[js.Any]).asInstanceOf[typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model]]
      
      /* static member */
      inline def removeDocumentEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDocumentEvents")().asInstanceOf[Any]
      inline def removeDocumentEvents(prefix: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDocumentEvents")(prefix.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /* static member */
      inline def setDocumentEventPrefix(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocumentEventPrefix")().asInstanceOf[Any]
      inline def setDocumentEventPrefix(prefix: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocumentEventPrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /* static member */
      inline def setDocumentEvents(events: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocumentEvents")(events.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
      inline def setDocumentEvents(events: js.Array[String], prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDocumentEvents")(events.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      
      /* static member */
      inline def setTemplateStrategy(strategy: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateStrategy")(strategy.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def setTemplateStrategy(strategy: Any, instance: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateStrategy")(strategy.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /* static member */
      inline def toEl(el: Any): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("to$El")(el.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]
      inline def toEl(el: Any, parent: Any): JQuery[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("to$El")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[JQuery[HTMLElement]]
      inline def toEl(el: Any, parent: Any, allowParentMatch: Boolean): JQuery[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("to$El")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], allowParentMatch.asInstanceOf[js.Any])).asInstanceOf[JQuery[HTMLElement]]
      inline def toEl(el: Any, parent: Unit, allowParentMatch: Boolean): JQuery[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("to$El")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], allowParentMatch.asInstanceOf[js.Any])).asInstanceOf[JQuery[HTMLElement]]
    }
    
    @JSGlobal("Giraffe.app")
    @js.native
    def app: App = js.native
    inline def app_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.apps")
    @js.native
    def apps: AppMap = js.native
    inline def apps_=(x: AppMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apps")(x.asInstanceOf[js.Any])
    
    inline def bindAppEvents(instance: GiraffeObject): GiraffeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAppEvents")(instance.asInstanceOf[js.Any]).asInstanceOf[GiraffeObject]
    
    inline def bindDataEvents(instance: GiraffeObject): GiraffeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("bindDataEvents")(instance.asInstanceOf[js.Any]).asInstanceOf[GiraffeObject]
    
    inline def bindEvent(context: Events, target: Events, event: Any, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bindEvent")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def bindEventMap(context: Events, target: Events, eventMap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bindEventMap")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def configure(instance: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(instance.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def configure(instance: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(instance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSGlobal("Giraffe.defaultOptions")
    @js.native
    def defaultOptions: DefaultOptions = js.native
    inline def defaultOptions_=(x: DefaultOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    inline def dispose(instance: GiraffeObject, args: Any*): GiraffeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(List(instance.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[GiraffeObject]
    
    inline def disposeThis(args: Any*): GiraffeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeThis")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[GiraffeObject]
    
    inline def unbindEvent(context: Events, target: Events, event: Any, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbindEvent")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def unbindEventMap(context: Events, target: Events, eventMap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbindEventMap")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSGlobal("Giraffe.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Giraffe.views")
    @js.native
    def views: ViewMap[typings.giraffe.Giraffe.Model] = js.native
    inline def views_=(x: ViewMap[typings.giraffe.Giraffe.Model]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
    
    inline def wrapFn(obj: Any, name: String, before: js.Function, after: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapFn")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
