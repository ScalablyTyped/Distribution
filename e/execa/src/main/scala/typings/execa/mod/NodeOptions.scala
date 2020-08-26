package typings.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOptions[EncodingType] extends Options[EncodingType] {
  /**
  		List of [CLI options](https://nodejs.org/api/cli.html#cli_options) passed to the Node.js executable.
  		@default process.execArgv
  		*/
  val nodeOptions: js.UndefOr[js.Array[String]] = js.native
  /**
  		The Node.js executable to use.
  		@default process.execPath
  		*/
  val nodePath: js.UndefOr[String] = js.native
}

object NodeOptions {
  @scala.inline
  def apply[EncodingType](): NodeOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions[EncodingType]]
  }
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions[_], EncodingType] (val x: Self with NodeOptions[EncodingType]) extends AnyVal {
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
    def setNodeOptionsVarargs(value: String*): Self = this.set("nodeOptions", js.Array(value :_*))
    @scala.inline
    def setNodeOptions(value: js.Array[String]): Self = this.set("nodeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeOptions: Self = this.set("nodeOptions", js.undefined)
    @scala.inline
    def setNodePath(value: String): Self = this.set("nodePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePath: Self = this.set("nodePath", js.undefined)
  }
  
}

