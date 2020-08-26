package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceSolutionKey extends js.Object {
  /**
    * The conference solution type. If a client encounters an unfamiliar or
    * empty type, it should still be able to display the entry points. However,
    * it should disallow modifications. The possible values are:   -
    * &quot;eventHangout&quot; for Hangouts for consumers
    * (http://hangouts.google.com) - &quot;eventNamedHangout&quot; for classic
    * Hangouts for G Suite users (http://hangouts.google.com) -
    * &quot;hangoutsMeet&quot; for Hangouts Meet (http://meet.google.com)
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaConferenceSolutionKey {
  @scala.inline
  def apply(): SchemaConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceSolutionKey]
  }
  @scala.inline
  implicit class SchemaConferenceSolutionKeyOps[Self <: SchemaConferenceSolutionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

