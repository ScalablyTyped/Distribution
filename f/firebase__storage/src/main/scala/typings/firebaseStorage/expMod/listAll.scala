package typings.firebaseStorage.expMod

import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcReferenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "listAll")
@js.native
object listAll extends js.Object {
  
  def apply(ref: Reference): js.Promise[ListResult] = js.native
}
