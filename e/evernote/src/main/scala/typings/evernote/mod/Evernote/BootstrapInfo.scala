package typings.evernote.mod.Evernote

import typings.evernote.AnonProfiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure describes a collection of bootstrap profiles.
  * <dl>
  *    <dt>profiles:</dt>
  *        <dd>
  *        List of one or more bootstrap profiles, in descending
  *        preference order.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.BootstrapInfo")
@js.native
class BootstrapInfo () extends js.Object {
  def this(args: AnonProfiles) = this()
  var profiles: js.Array[BootstrapProfile] = js.native
}

