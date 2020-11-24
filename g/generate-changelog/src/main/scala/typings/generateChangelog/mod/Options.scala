package typings.generateChangelog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** allow unkown commit types */
  var allowUnknown: js.UndefOr[Boolean] = js.native
  
  /** exclude listed commit types (e.g. `['chore', 'style', 'refactor']`) */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /** whether it should be a major changelog */
  var major: js.UndefOr[Boolean] = js.native
  
  /** whether it should be a minor changelog */
  var minor: js.UndefOr[Boolean] = js.native
  
  /** whether it should be a patch changelog */
  var patch: js.UndefOr[Boolean] = js.native
  
  /** repo URL that will be used when linking commits */
  var repoUrl: js.UndefOr[String] = js.native
  
  /** generate from specific tag or range (e.g. `v1.2.3` or `v1.2.3..v1.2.4`)' */
  var tag: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown(value: Boolean): Self = this.set("allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnknown: Self = this.set("allowUnknown", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setMajor(value: Boolean): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    
    @scala.inline
    def setMinor(value: Boolean): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    
    @scala.inline
    def setPatch(value: Boolean): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setRepoUrl(value: String): Self = this.set("repoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoUrl: Self = this.set("repoUrl", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
