package typings.giraffe.GiraffeNs.ContribNs

import typings.giraffe.GiraffeNs.Collection
import typings.giraffe.GiraffeNs.Model
import typings.giraffe.GiraffeNs.View
import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib.FastCollectionView")
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
@JSGlobal("Giraffe.Contrib.FastCollectionView")
@js.native
object FastCollectionView extends js.Object {
  def getDefaults(ctx: js.Any): js.Any = js.native
}

