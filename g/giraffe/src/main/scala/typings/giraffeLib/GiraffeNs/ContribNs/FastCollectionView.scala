package typings
package giraffeLib.GiraffeNs.ContribNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib.FastCollectionView")
@js.native
class FastCollectionView[TModel /* <: giraffeLib.GiraffeNs.Model */] ()
  extends giraffeLib.GiraffeNs.View[TModel] {
  @JSName("collection")
  var collection_FastCollectionView: giraffeLib.GiraffeNs.Collection[TModel] = js.native
  var modelEl: js.Any = js.native
  var modelTemplate: js.Any = js.native
  var modelTemplateStrategy: java.lang.String = js.native
  var renderOnChange: scala.Boolean = js.native
  def addAll(): giraffeLib.GiraffeNs.View[TModel] = js.native
  def addOne(model: giraffeLib.GiraffeNs.Model): giraffeLib.GiraffeNs.View[TModel] = js.native
  def findElByIndex(index: scala.Double): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def findElByModel(model: giraffeLib.GiraffeNs.Model): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def findModelByEl(el: js.Any): giraffeLib.GiraffeNs.Model = js.native
  def modelSerialize(): js.Any = js.native
  def removeByIndex(index: scala.Double): giraffeLib.GiraffeNs.View[TModel] = js.native
  def removeOne(model: giraffeLib.GiraffeNs.Model): giraffeLib.GiraffeNs.View[TModel] = js.native
}

/* static members */
@JSGlobal("Giraffe.Contrib.FastCollectionView")
@js.native
object FastCollectionView extends js.Object {
  def getDefaults(ctx: js.Any): js.Any = js.native
}

