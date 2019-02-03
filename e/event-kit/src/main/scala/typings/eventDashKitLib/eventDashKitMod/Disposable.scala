package typings
package eventDashKitLib.eventDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-kit", "Disposable")
@js.native
/** Construct a Disposable. */
class Disposable () extends DisposableLike {
  def this(disposableAction: js.Function0[scala.Unit]) = this()
  /** A callback which will be called within dispose(). */
  var disposalAction: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var disposed: scala.Boolean = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

/* static members */
@JSImport("event-kit", "Disposable")
@js.native
object Disposable extends js.Object {
  /** Ensure that Object correctly implements the Disposable contract. */
  def isDisposable(`object`: js.Object): scala.Boolean = js.native
}

