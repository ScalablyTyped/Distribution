package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.atFirebaseFirestoreStrings.`multi-client`
import typings.atFirebaseFirestore.distTestUnitSpecsSpecUnderscoreBuilderMod.SpecBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/describe_spec", JSImport.Namespace)
@js.native
object distTestUnitSpecsDescribeUnderscoreSpecMod extends js.Object {
  val MULTI_CLIENT_TAG: `multi-client` = js.native
  def describeSpec(name: String, tags: js.Array[String], builder: js.Function0[Unit]): Unit = js.native
  def setSpecJSONHandler(writer: js.Function1[/* json */ String, Unit]): Unit = js.native
  def specTest(name: String, tags: js.Array[String], builder: js.Function0[SpecBuilder]): Unit = js.native
  def specTest(name: String, tags: js.Array[String], comment: String, builder: js.Function0[SpecBuilder]): Unit = js.native
}

