package typings.findCacheDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If `true`, the directory will be created synchronously before returning.
    * @default false
    */
  var create: js.UndefOr[Boolean] = js.native
  /**
    * Directory to start searching for a `package.json` from.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * An array of files that will be searched for a common parent directory.
    * This common parent directory will be used in lieu of the `cwd` option below.
    */
  var files: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Should be the same as your project name in `package.json`.
    */
  var name: String = js.native
  /**
    * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
    * @default false
    */
  var thunk: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(name: String): Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setThunk(value: Boolean): Self = this.set("thunk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThunk: Self = this.set("thunk", js.undefined)
  }
  
}

