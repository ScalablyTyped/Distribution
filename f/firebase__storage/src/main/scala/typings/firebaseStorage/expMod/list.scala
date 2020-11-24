package typings.firebaseStorage.expMod

import typings.firebaseStorage.srcListMod.ListOptions
import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcReferenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "list")
@js.native
object list extends js.Object {
  
  def apply(ref: Reference): js.Promise[ListResult] = js.native
  def apply(ref: Reference, options: ListOptions): js.Promise[ListResult] = js.native
}
