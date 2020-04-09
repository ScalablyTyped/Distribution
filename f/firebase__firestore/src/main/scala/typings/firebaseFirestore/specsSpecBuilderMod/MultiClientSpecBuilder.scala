package typings.firebaseFirestore.specsSpecBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_builder", "MultiClientSpecBuilder")
@js.native
class MultiClientSpecBuilder () extends SpecBuilder {
  var activeClientIndex: js.Any = js.native
  var clientStates: js.Any = js.native
  def client(clientIndex: Double): MultiClientSpecBuilder = js.native
  /**
    * Take the primary lease, even if another client has already obtained the
    * lease.
    */
  def stealPrimaryLease(): this.type = js.native
}

