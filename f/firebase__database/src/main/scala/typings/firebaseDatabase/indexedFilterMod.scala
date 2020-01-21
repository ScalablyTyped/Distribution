package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/filter/IndexedFilter", JSImport.Namespace)
@js.native
object indexedFilterMod extends js.Object {
  @js.native
  class IndexedFilter protected () extends NodeFilter {
    def this(index_ : Index) = this()
    val index_ : js.Any = js.native
  }
  
}

