package typings.divaJs

import typings.divaJs.interfacesMod.Offset
import typings.divaJs.viewerCoreMod.default
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diva.js/handlers", JSImport.Namespace)
@js.native
object handlersMod extends js.Object {
  
  @js.native
  class DocumentHandler protected () extends ViewHandler {
    def this(viewerCore: default) = this()
    
    def onPinch(event: Event, coords: Offset, startDistance: Double, endDistance: Double): Unit = js.native
  }
  
  @js.native
  class GridHandler protected () extends ViewHandler {
    def this(viewerCore: default) = this()
    
    def onPinch(): Unit = js.native
  }
  
  @js.native
  trait ViewHandler extends js.Object {
    
    var _viewerCore: default = js.native
    
    def onDoubleClick(event: Event, coords: Offset): Unit = js.native
    
    def onViewDidLoad(): Unit = js.native
    
    def onViewDidUpdate(renderedPages: js.Array[Double]): Unit = js.native
    def onViewDidUpdate(renderedPages: js.Array[Double], targetPage: Double): Unit = js.native
    
    def onViewWillLoad(): Unit = js.native
  }
}
