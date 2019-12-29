package typings.dojo.dojox.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.app.controllers")
@js.native
object controllers extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/BorderLayout.html
    *
    *
    * @param app dojox/app application instance.
    * @param events {event : handler}
    */
  @js.native
  class BorderLayout protected () extends LayoutBase {
    def this(app: js.Any, events: js.Any) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/History.html
    *
    *
    */
  @js.native
  class History () extends Controller {
    /**
      * Current state
      *
      */
    var currentState: js.Object = js.native
    /**
      *
      * @param evt
      */
    def onDomNodeChange(evt: js.Any): Unit = js.native
    /**
      * Response to dojox/app "popstate" event.
      *
      * @param evt Transition options parameter
      */
    def onPopState(evt: js.Object): Unit = js.native
    /**
      * Response to dojox/app "startTransition" event.
      *
      * @param evt Transition options parameter
      */
    def onStartTransition(evt: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/HistoryHash.html
    *
    *
    * @param app dojox/app application instance.
    */
  @js.native
  class HistoryHash protected () extends Controller {
    def this(app: js.Any) = this()
    /**
      *
      * @param evt
      */
    def onDomNodeChange(evt: js.Any): Unit = js.native
    /**
      * Response to dojox/app "startTransition" event.
      *
      * @param evt transition options parameter
      */
    def onStartTransition(evt: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/Layout.html
    *
    *
    * @param app dojox/app application instance.
    * @param events {event : handler}
    */
  @js.native
  class Layout protected () extends LayoutBase {
    def this(app: js.Any, events: js.Any) = this()
    /**
      *
      * @param w
      */
    def resizeSelectedChildren(w: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/LayoutBase.html
    *
    *
    * @param app dojox/app application instance.
    * @param events {event : handler}
    */
  @js.native
  class LayoutBase protected () extends Controller {
    def this(app: js.Any, events: js.Any) = this()
    /**
      *
      * @param view
      */
    def hideView(view: js.Any): Unit = js.native
    /**
      * Response to dojox/app "app-initLayout" event.
      *
      * @param event {"view": view, "callback": function(){}};
      */
    def initLayout(event: js.Object): Unit = js.native
    /**
      * Response to dojox/app "app-layoutView" event.
      *
      * @param event {"parent":parent, "view":view, "removeView": boolean}
      */
    def layoutView(event: js.Object): Unit = js.native
    /**
      *
      */
    def onResize(): Unit = js.native
    /**
      *
      * @param view
      */
    def showView(view: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/Load.html
    *
    *
    * @param app dojox/app application instance.
    * @param events {event : handler}
    */
  @js.native
  class Load protected () extends Controller {
    def this(app: js.Any, events: js.Any) = this()
    /**
      * Create a view instance if not already loaded by calling createView. This is typically a
      * dojox/app/View.
      *
      * @param parent parent of the view.
      * @param childId view id need to be loaded.
      * @param subIds sub views' id of this view.
      * @param params
      */
    def createChild(parent: js.Object, childId: String, subIds: String, params: js.Any): js.Any = js.native
    /**
      * Create a dojox/app/View instance. Can be overridden to create different type of views.
      *
      * @param parent parent of this view.
      * @param id view id.
      * @param name view name.
      * @param mixin additional property to be mixed into the view (templateString, controller...)
      * @param params params of this view.
      * @param type the MID of the View. If not provided "dojox/app/View".
      */
    def createView(parent: js.Object, id: String, name: String, mixin: String, params: js.Object, `type`: String): js.Any = js.native
    /**
      *
      * @param event
      */
    def init(event: js.Any): Unit = js.native
    /**
      * Response to dojox/app "loadArray" event.
      *
      * @param event LoadArray event parameter. It should be like this: {"parent":parent, "viewId":viewId, "viewArray":viewArray, "callback":function(){...}}
      */
    def load(event: js.Object): js.Any = js.native
    /**
      * Load child and sub children views recursively.
      *
      * @param parent parent of this view.
      * @param childId view id need to be loaded.
      * @param subIds sub views' id of this view.
      * @param params params of this view.
      * @param loadEvent the event passed for the load of this view.
      */
    def loadChild(parent: js.Object, childId: String, subIds: String, params: js.Object, loadEvent: js.Object): js.Any = js.native
    /**
      * Response to dojox/app "app-load" event.
      *
      * @param loadEvent Load event parameter. It should be like this: {"parent":parent, "viewId":viewId, "callback":function(){...}}
      */
    def loadView(loadEvent: js.Object): js.Any = js.native
    /**
      * Proceed load queue by FIFO by default.
      * If load is in proceeding, add the next load to waiting queue.
      *
      * @param loadEvt LoadArray event parameter. It should be like this: {"parent":parent, "viewId":viewId, "viewArray":viewArray, "callback":function(){...}}
      */
    def proceedLoadView(loadEvt: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/controllers/Transition.html
    *
    *
    * @param app dojox/app application instance.
    * @param events {event : handler}
    */
  @js.native
  class Transition protected () extends Controller {
    def this(app: js.Any, events: js.Any) = this()
    /**
      *
      */
    var proceeding: Boolean = js.native
    /**
      *
      */
    var waitingQueue: js.Array[_] = js.native
    /**
      *
      * @param evt
      */
    def onDomNodeChange(evt: js.Any): Unit = js.native
    /**
      * Response to dojox/app "startTransition" event.
      *
      * @param evt transition options parameter
      */
    def onStartTransition(evt: js.Object): Unit = js.native
    /**
      * Proceed transition queue by FIFO by default.
      * If transition is in proceeding, add the next transition to waiting queue.
      *
      * @param transitionEvt "app-transition" event parameter. It should be like: {"viewId":viewId, "opts":opts}
      */
    def proceedTransition(transitionEvt: js.Object): Unit = js.native
    /**
      * Response to dojox/app "app-transition" event.
      *
      * @param event "app-transition" event parameter. It should be like: {"viewId": viewId, "opts": opts}
      */
    def transition(event: js.Object): Unit = js.native
  }
  
}

