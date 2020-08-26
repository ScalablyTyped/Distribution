package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a location in the source code.
  */
@js.native
trait SchemaSourceLocation extends js.Object {
  /**
    * Column within a line. The first column in a line as the value `1`. Agents
    * that do not support setting breakpoints on specific columns ignore this
    * field.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * Line inside the file. The first line in the file has the value `1`.
    */
  var line: js.UndefOr[Double] = js.native
  /**
    * Path to the source file within the source context of the target binary.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaSourceLocation {
  @scala.inline
  def apply(): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceLocation]
  }
  @scala.inline
  implicit class SchemaSourceLocationOps[Self <: SchemaSourceLocation] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

