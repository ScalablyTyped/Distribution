package typings.firebaseDatabase.completeChildSourceMod

import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.viewCacheMod.ViewCache
import typings.firebaseDatabase.writeTreeMod.WriteTreeRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "WriteTreeCompleteChildSource")
@js.native
class WriteTreeCompleteChildSource protected () extends CompleteChildSource {
  /**
    * @param {!WriteTreeRef} writes_
    * @param {!ViewCache} viewCache_
    * @param {?Node} optCompleteServerCache_
    */
  def this(writes_ : WriteTreeRef, viewCache_ : ViewCache) = this()
  def this(writes_ : WriteTreeRef, viewCache_ : ViewCache, optCompleteServerCache_ : Node) = this()
  
  var optCompleteServerCache_ : js.Any = js.native
  
  var viewCache_ : js.Any = js.native
  
  var writes_ : js.Any = js.native
}
