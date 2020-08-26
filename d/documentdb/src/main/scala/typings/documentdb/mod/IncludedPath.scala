package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludedPath extends js.Object {
  var Indexes: js.Array[Index] = js.native
  /** Path to be indexed */
  var Path: String = js.native
}

object IncludedPath {
  @scala.inline
  def apply(Indexes: js.Array[Index], Path: String): IncludedPath = {
    val __obj = js.Dynamic.literal(Indexes = Indexes.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedPath]
  }
  @scala.inline
  implicit class IncludedPathOps[Self <: IncludedPath] (val x: Self) extends AnyVal {
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
    def setIndexesVarargs(value: Index*): Self = this.set("Indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[Index]): Self = this.set("Indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
  }
  
}

