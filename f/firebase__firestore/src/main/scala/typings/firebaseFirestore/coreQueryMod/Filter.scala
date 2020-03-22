package typings.firebaseFirestore.coreQueryMod

import typings.firebaseFirestore.modelDocumentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "Filter")
@js.native
abstract class Filter () extends js.Object {
  def canonicalId(): String = js.native
  def isEqual(filter: Filter): Boolean = js.native
  def matches(doc: Document): Boolean = js.native
}

