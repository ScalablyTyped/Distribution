package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceReference extends js.Object {
  /**
    * The URL for a specific instance.
    */
  var instance: js.UndefOr[String] = js.native
}

object SchemaInstanceReference {
  @scala.inline
  def apply(): SchemaInstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceReference]
  }
  @scala.inline
  implicit class SchemaInstanceReferenceOps[Self <: SchemaInstanceReference] (val x: Self) extends AnyVal {
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
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
  }
  
}

