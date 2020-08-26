package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Push contains filter properties for matching GitHub git pushes.
  */
@js.native
trait SchemaPushFilter extends js.Object {
  /**
    * Regexes of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * Regexes of tags to match.  The syntax of the regular expressions accepted
    * is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaPushFilter {
  @scala.inline
  def apply(): SchemaPushFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushFilter]
  }
  @scala.inline
  implicit class SchemaPushFilterOps[Self <: SchemaPushFilter] (val x: Self) extends AnyVal {
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

