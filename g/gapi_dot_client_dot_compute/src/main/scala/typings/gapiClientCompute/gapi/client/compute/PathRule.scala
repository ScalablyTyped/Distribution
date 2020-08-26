package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathRule extends js.Object {
  /**
    * The list of path patterns to match. Each must start with / and the only place a &#42; is allowed is at the end following a /. The string fed to the path
    * matcher does not include any text after the first ? or #, and those chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /** The URL of the BackendService resource if this rule is matched. */
  var service: js.UndefOr[String] = js.native
}

object PathRule {
  @scala.inline
  def apply(): PathRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathRule]
  }
  @scala.inline
  implicit class PathRuleOps[Self <: PathRule] (val x: Self) extends AnyVal {
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
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

