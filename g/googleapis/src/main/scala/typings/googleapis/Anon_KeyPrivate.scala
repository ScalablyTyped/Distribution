package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyPrivate extends js.Object {
  var `private`: js.UndefOr[StringDictionary[String]] = js.native
  var shared: js.UndefOr[StringDictionary[String]] = js.native
}

object Anon_KeyPrivate {
  @scala.inline
  def apply(`private`: StringDictionary[String] = null, shared: StringDictionary[String] = null): Anon_KeyPrivate = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyPrivate]
  }
}

