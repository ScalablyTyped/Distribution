package typings.firebaseFirestore

import typings.firebaseFirestore.pathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/encoded_resource_path", JSImport.Namespace)
@js.native
object encodedResourcePathMod extends js.Object {
  def decodeResourcePath(path: EncodedResourcePath): ResourcePath = js.native
  def encodeResourcePath(path: ResourcePath): EncodedResourcePath = js.native
  def prefixSuccessor(path: EncodedResourcePath): EncodedResourcePath = js.native
  type EncodedResourcePath = String
}

