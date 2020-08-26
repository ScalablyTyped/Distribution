package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of the parameters to use when creating the instance
  * template from a source instance.
  */
@js.native
trait SchemaSourceInstanceParams extends js.Object {
  /**
    * Attached disks configuration. If not provided, defaults are applied: For
    * boot disk and any other R/W disks, new custom images will be created from
    * each disk. For read-only disks, they will be attached in read-only mode.
    * Local SSD disks will be created as blank volumes.
    */
  var diskConfigs: js.UndefOr[js.Array[SchemaDiskInstantiationConfig]] = js.native
}

object SchemaSourceInstanceParams {
  @scala.inline
  def apply(): SchemaSourceInstanceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceInstanceParams]
  }
  @scala.inline
  implicit class SchemaSourceInstanceParamsOps[Self <: SchemaSourceInstanceParams] (val x: Self) extends AnyVal {
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
    def setDiskConfigsVarargs(value: SchemaDiskInstantiationConfig*): Self = this.set("diskConfigs", js.Array(value :_*))
    @scala.inline
    def setDiskConfigs(value: js.Array[SchemaDiskInstantiationConfig]): Self = this.set("diskConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskConfigs: Self = this.set("diskConfigs", js.undefined)
  }
  
}

