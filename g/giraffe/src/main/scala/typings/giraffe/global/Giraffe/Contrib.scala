package typings.giraffe.global.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib")
@js.native
object Contrib extends js.Object {
  @js.native
  class CollectionView[TModel /* <: typings.giraffe.Giraffe.Model */] ()
    extends typings.giraffe.Giraffe.Contrib.CollectionView[TModel]
  
  @js.native
  class Controller ()
    extends typings.giraffe.Giraffe.Contrib.Controller
  
  @js.native
  class FastCollectionView[TModel /* <: typings.giraffe.Giraffe.Model */] ()
    extends typings.giraffe.Giraffe.Contrib.FastCollectionView[TModel]
  
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

