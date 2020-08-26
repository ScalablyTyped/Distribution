package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseFlags extends js.Object {
  /**
    * The name of the flag. These flags are passed at instance startup, so include both MySQL server options and MySQL system variables. Flags should be
    * specified with underscores, not hyphens. For more information, see Configuring MySQL Flags in the Google Cloud SQL documentation, as well as the
    * official MySQL documentation for server options and system variables.
    */
  var name: js.UndefOr[String] = js.native
  /** The value of the flag. Booleans should be set to on for true and off for false. This field must be omitted if the flag doesn't take a value. */
  var value: js.UndefOr[String] = js.native
}

object DatabaseFlags {
  @scala.inline
  def apply(): DatabaseFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseFlags]
  }
  @scala.inline
  implicit class DatabaseFlagsOps[Self <: DatabaseFlags] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

