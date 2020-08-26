package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Program extends js.Object {
  /** The command line used to run this program. */
  var commandLine: js.UndefOr[String] = js.native
  /**
    * The user specified locally unique ID of the program. Used along with
    * `prevProgramId` to define an ordering between programs.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The display name of the program. This is typically the colloquial name of
    * the tool used, for example 'bwa' or 'picard'.
    */
  var name: js.UndefOr[String] = js.native
  /** The ID of the program run before this one. */
  var prevProgramId: js.UndefOr[String] = js.native
  /** The version of the program run. */
  var version: js.UndefOr[String] = js.native
}

object Program {
  @scala.inline
  def apply(): Program = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Program]
  }
  @scala.inline
  implicit class ProgramOps[Self <: Program] (val x: Self) extends AnyVal {
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
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandLine: Self = this.set("commandLine", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrevProgramId(value: String): Self = this.set("prevProgramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProgramId: Self = this.set("prevProgramId", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

