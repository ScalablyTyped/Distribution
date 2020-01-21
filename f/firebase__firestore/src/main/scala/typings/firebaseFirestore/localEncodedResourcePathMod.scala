package typings.firebaseFirestore

import typings.firebaseFirestore.modelPathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/encoded_resource_path", JSImport.Namespace)
@js.native
object localEncodedResourcePathMod extends js.Object {
  def decode(path: EncodedResourcePath): ResourcePath = js.native
  def encode(path: ResourcePath): EncodedResourcePath = js.native
  def prefixSuccessor(path: EncodedResourcePath): EncodedResourcePath = js.native
  type EncodedResourcePath = String
}

