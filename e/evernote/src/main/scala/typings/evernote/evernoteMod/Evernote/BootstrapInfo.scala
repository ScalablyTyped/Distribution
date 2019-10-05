package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Profiles
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
  def this(args: Anon_Profiles) = this()
  var profiles: js.Array[BootstrapProfile] = js.native
}

