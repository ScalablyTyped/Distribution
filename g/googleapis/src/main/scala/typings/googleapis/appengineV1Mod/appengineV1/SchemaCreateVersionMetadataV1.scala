package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1.CreateVersionRequest.
  */
@js.native
trait SchemaCreateVersionMetadataV1 extends js.Object {
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}

object SchemaCreateVersionMetadataV1 {
  @scala.inline
  def apply(): SchemaCreateVersionMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1]
  }
  @scala.inline
  implicit class SchemaCreateVersionMetadataV1Ops[Self <: SchemaCreateVersionMetadataV1] (val x: Self) extends AnyVal {
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
    def setCloudBuildId(value: String): Self = this.set("cloudBuildId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudBuildId: Self = this.set("cloudBuildId", js.undefined)
  }
  
}

