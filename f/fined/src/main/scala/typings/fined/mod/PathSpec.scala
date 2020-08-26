package typings.fined.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathSpec extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[String | js.Array[String] | (StringDictionary[String | Null])] = js.native
  var findUp: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
}

object PathSpec {
  @scala.inline
  def apply(): PathSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathSpec]
  }
  @scala.inline
  implicit class PathSpecOps[Self <: PathSpec] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: String | js.Array[String] | (StringDictionary[String | Null])): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFindUp(value: Boolean): Self = this.set("findUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindUp: Self = this.set("findUp", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

