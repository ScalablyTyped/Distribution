package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratedIds extends js.Object {
  /** The IDs generated for the requesting user in the specified space. */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "drive#generatedIds". */
  var kind: js.UndefOr[String] = js.native
  /** The type of file that can be created with these IDs. */
  var space: js.UndefOr[String] = js.native
}

object GeneratedIds {
  @scala.inline
  def apply(): GeneratedIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedIds]
  }
  @scala.inline
  implicit class GeneratedIdsOps[Self <: GeneratedIds] (val x: Self) extends AnyVal {
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
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSpace(value: String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
  
}

