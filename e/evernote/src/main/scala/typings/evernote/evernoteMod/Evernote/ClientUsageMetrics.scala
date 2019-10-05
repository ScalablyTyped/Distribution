package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Sessions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is passed from clients to the Evernote service when they wish
  * to relay coarse-grained usage metrics to the service to help improve
  * products.
  *
  * <dl>
  *    <dt>sessions</dt>
  *    <dd>
  *        This field contains a count of the number of usage "sessions" that have
  *        occurred with this client which have not previously been reported to
  *        the service.
  *        A "session" is defined as one of the 96 fifteen-minute intervals of the
  *        day when someone used Evernote's interface at least once.
  *        So if a user interacts with an Evernote client at 12:18, 12:24, and 12:36,
  *        and then the client synchronizes at 12:39, it would report that there were
  *        two previously-unreported sessions (one session for the 12:15-12:30 time
  *        period, and one for the 12:30-12:45 period).
  *        If the user used Evernote again at 12:41 and synchronized at 12:43, it
  *        would not report any new sessions, because the 12:30-12:45 session had
  *        already been reported.
  *    </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.ClientUsageMetrics")
@js.native
class ClientUsageMetrics () extends js.Object {
  def this(args: Anon_Sessions) = this()
  var sessions: Double = js.native
}

