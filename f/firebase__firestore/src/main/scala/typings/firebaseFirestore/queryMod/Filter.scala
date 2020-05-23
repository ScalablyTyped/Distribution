package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/query", "Filter")
@js.native
abstract class Filter () extends js.Object {
  def canonicalId(): String = js.native
  def isEqual(filter: Filter): Boolean = js.native
  def matches(doc: Document): Boolean = js.native
}

