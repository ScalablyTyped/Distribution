package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptTypeProfile extends js.Object {
  /**
    * Type profile entries for parameters and return values of the functions in the script.
    */
  var entries: js.Array[TypeProfileEntry] = js.native
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId = js.native
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
}

object ScriptTypeProfile {
  @scala.inline
  def apply(entries: js.Array[TypeProfileEntry], scriptId: ScriptId, url: String): ScriptTypeProfile = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTypeProfile]
  }
  @scala.inline
  implicit class ScriptTypeProfileOps[Self <: ScriptTypeProfile] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: TypeProfileEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[TypeProfileEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

