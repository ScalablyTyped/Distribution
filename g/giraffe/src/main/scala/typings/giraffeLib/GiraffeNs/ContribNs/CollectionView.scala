package typings
package giraffeLib.GiraffeNs.ContribNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib.CollectionView")
@js.native
class CollectionView[TModel /* <: giraffeLib.GiraffeNs.Model */] ()
  extends giraffeLib.GiraffeNs.View[TModel] {
  @JSName("collection")
  var collection_CollectionView: giraffeLib.GiraffeNs.Collection[TModel] = js.native
  var modelView: giraffeLib.GiraffeNs.View[TModel] = js.native
  var modelViewArgs: js.Array[_] = js.native
  var modelViewEl: js.Any = js.native
  var renderOnChange: scala.Boolean = js.native
  def addOne(model: giraffeLib.GiraffeNs.Model): giraffeLib.GiraffeNs.View[TModel] = js.native
  def findByModel(model: giraffeLib.GiraffeNs.Model): giraffeLib.GiraffeNs.View[TModel] = js.native
  def removeOne(model: giraffeLib.GiraffeNs.Model): giraffeLib.GiraffeNs.View[TModel] = js.native
}

/* static members */
@JSGlobal("Giraffe.Contrib.CollectionView")
@js.native
object CollectionView extends js.Object {
  def getDefaults(ctx: js.Any): js.Any = js.native
}

