package typings.firebaseStorage.expMod

import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcReferenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "getMetadata")
@js.native
object getMetadata extends js.Object {
  
  def apply(ref: Reference): js.Promise[Metadata] = js.native
}
