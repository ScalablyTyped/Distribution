package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of package names.
  */
@js.native
trait SchemaPackageNameList extends js.Object {
  /**
    * A list of package names.
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPackageNameList {
  @scala.inline
  def apply(): SchemaPackageNameList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageNameList]
  }
  @scala.inline
  implicit class SchemaPackageNameListOps[Self <: SchemaPackageNameList] (val x: Self) extends AnyVal {
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
    def setPackageNamesVarargs(value: String*): Self = this.set("packageNames", js.Array(value :_*))
    @scala.inline
    def setPackageNames(value: js.Array[String]): Self = this.set("packageNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageNames: Self = this.set("packageNames", js.undefined)
  }
  
}

