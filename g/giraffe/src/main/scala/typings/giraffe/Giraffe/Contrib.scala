package typings.giraffe.Giraffe

import typings.backbone.backboneMod.Events
import typings.backbone.backboneMod.EventsMixin
import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib")
@js.native
object Contrib extends js.Object {
  @js.native
  class CollectionView[TModel /* <: Model */] () extends View[TModel] {
    @JSName("collection")
    var collection_CollectionView: Collection[TModel] = js.native
    var modelView: View[TModel] = js.native
    var modelViewArgs: js.Array[_] = js.native
    var modelViewEl: js.Any = js.native
    var renderOnChange: Boolean = js.native
    def addOne(model: Model): View[TModel] = js.native
    def findByModel(model: Model): View[TModel] = js.native
    def removeOne(model: Model): View[TModel] = js.native
  }
  
  @js.native
  class Controller ()
    extends EventsMixin
       with GiraffeObject
       with Events {
    /* CompleteClass */
    override var app: App = js.native
    /**
      * Faulty overgeneralization of Backbone.Events.on, for historical
      * reasons.
      */
    def on(eventName: js.Any): this.type = js.native
    def on(eventName: js.Any, callback: js.Any): this.type = js.native
    def on(eventName: js.Any, callback: js.Any, context: js.Any): this.type = js.native
  }
  
  @js.native
  class FastCollectionView[TModel /* <: Model */] () extends View[TModel] {
    @JSName("collection")
    var collection_FastCollectionView: Collection[TModel] = js.native
    var modelEl: js.Any = js.native
    var modelTemplate: js.Any = js.native
    var modelTemplateStrategy: String = js.native
    var renderOnChange: Boolean = js.native
    def addAll(): View[TModel] = js.native
    def addOne(model: Model): View[TModel] = js.native
    def findElByIndex(index: Double): JQuery[HTMLElement] = js.native
    def findElByModel(model: Model): JQuery[HTMLElement] = js.native
    def findModelByEl(el: js.Any): Model = js.native
    def modelSerialize(): js.Any = js.native
    def removeByIndex(index: Double): View[TModel] = js.native
    def removeOne(model: Model): View[TModel] = js.native
  }
  
  /* static members */
  @js.native
  object CollectionView extends js.Object {
    def getDefaults(ctx: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FastCollectionView extends js.Object {
    def getDefaults(ctx: js.Any): js.Any = js.native
  }
  
}

