package typings.firebaseFirestore.listenSequenceMod

import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/listen_sequence", "ListenSequence")
@js.native
class ListenSequence protected () extends js.Object {
  def this(previousValue: ListenSequenceNumber) = this()
  def this(previousValue: ListenSequenceNumber, sequenceNumberSyncer: SequenceNumberSyncer) = this()
  var previousValue: js.Any = js.native
  var setPreviousValue: js.Any = js.native
  var writeNewSequenceNumber: js.UndefOr[js.Any] = js.native
  def next(): ListenSequenceNumber = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/core/listen_sequence", "ListenSequence")
@js.native
object ListenSequence extends js.Object {
  val INVALID: ListenSequenceNumber = js.native
}

