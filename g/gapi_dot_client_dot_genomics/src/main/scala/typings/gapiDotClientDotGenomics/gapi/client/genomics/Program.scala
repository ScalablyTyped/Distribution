package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends js.Object {
  /** The command line used to run this program. */
  var commandLine: js.UndefOr[String] = js.undefined
  /**
    * The user specified locally unique ID of the program. Used along with
    * `prevProgramId` to define an ordering between programs.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The display name of the program. This is typically the colloquial name of
    * the tool used, for example 'bwa' or 'picard'.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The ID of the program run before this one. */
  var prevProgramId: js.UndefOr[String] = js.undefined
  /** The version of the program run. */
  var version: js.UndefOr[String] = js.undefined
}

object Program {
  @scala.inline
  def apply(
    commandLine: String = null,
    id: String = null,
    name: String = null,
    prevProgramId: String = null,
    version: String = null
  ): Program = {
    val __obj = js.Dynamic.literal()
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prevProgramId != null) __obj.updateDynamic("prevProgramId")(prevProgramId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

