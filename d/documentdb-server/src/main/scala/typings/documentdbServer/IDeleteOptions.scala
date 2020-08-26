package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a delete operation. */
@js.native
trait IDeleteOptions extends js.Object {
  /**
    * The entity tag associated with the resource.
    * This is matched with the persisted resource before deletion.
    */
  var etag: js.UndefOr[String] = js.native
}

object IDeleteOptions {
  @scala.inline
  def apply(): IDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteOptions]
  }
  @scala.inline
  implicit class IDeleteOptionsOps[Self <: IDeleteOptions] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
  }
  
}

