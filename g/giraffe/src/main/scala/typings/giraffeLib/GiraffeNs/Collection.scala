package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Collection")
@js.native
class Collection[TModel /* <: Model */] ()
  extends backboneLib.backboneMod.Collection[TModel]
     with GiraffeObject {
  /* CompleteClass */
  override var app: App = js.native
  //model: typeof TModel;
  var model: giraffeLib.Anon_TModel[TModel] = js.native
}

