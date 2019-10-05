package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure describes a collection of bootstrap settings.
  * <dl>
  *    <dt>name:</dt>
  *        <dd>
  *        The unique name of the profile, which is guaranteed to remain consistent across
  *        calls to getBootstrapInfo.
  *        </dd>
  *    <dt>settings:</dt>
  *        <dd>
  *        The settings for this profile.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.BootstrapProfile")
@js.native
class BootstrapProfile () extends js.Object {
  def this(args: Anon_Name) = this()
  var name: String = js.native
  var settings: BootstrapSettings = js.native
}

