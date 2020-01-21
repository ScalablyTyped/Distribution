package typings.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_test_runner", "runSpec")
@js.native
object runSpec extends js.Object {
  def apply(
    name: String,
    tags: js.Array[String],
    usePersistence: Boolean,
    config: SpecConfig,
    steps: js.Array[SpecStep]
  ): js.Promise[Unit] = js.native
}

