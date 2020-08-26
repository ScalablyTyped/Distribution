package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapReference extends js.Object {
  var urlMap: js.UndefOr[String] = js.native
}

object SchemaUrlMapReference {
  @scala.inline
  def apply(): SchemaUrlMapReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapReference]
  }
  @scala.inline
  implicit class SchemaUrlMapReferenceOps[Self <: SchemaUrlMapReference] (val x: Self) extends AnyVal {
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
    def setUrlMap(value: String): Self = this.set("urlMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlMap: Self = this.set("urlMap", js.undefined)
  }
  
}

