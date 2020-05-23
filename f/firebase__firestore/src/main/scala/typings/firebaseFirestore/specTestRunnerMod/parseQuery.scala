package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_runner", "parseQuery")
@js.native
object parseQuery extends js.Object {
  def apply(querySpec: String): Query = js.native
  def apply(querySpec: SpecQuery): Query = js.native
}

