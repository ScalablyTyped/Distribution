package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volumes mounted within the app container. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaVolume extends js.Object {
  /**
    * Unique name for the volume.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Volume size in gigabytes.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  /**
    * Underlying volume type, e.g. &#39;tmpfs&#39;.
    */
  var volumeType: js.UndefOr[String] = js.native
}

object SchemaVolume {
  @scala.inline
  def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  @scala.inline
  implicit class SchemaVolumeOps[Self <: SchemaVolume] (val x: Self) extends AnyVal {
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
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSizeGb(value: Double): Self = this.set("sizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeGb: Self = this.set("sizeGb", js.undefined)
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("volumeType", js.undefined)
  }
  
}

