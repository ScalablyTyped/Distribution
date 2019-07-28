package typings.giraffe.GiraffeNs.ContribNs

import typings.giraffe.GiraffeNs.Collection
import typings.giraffe.GiraffeNs.Model
import typings.giraffe.GiraffeNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib.CollectionView")
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

/* static members */
@JSGlobal("Giraffe.Contrib.CollectionView")
@js.native
object CollectionView extends js.Object {
  def getDefaults(ctx: js.Any): js.Any = js.native
}

