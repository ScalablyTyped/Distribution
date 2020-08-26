package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends js.Object {
  /**
    * The clusters to be created within the instance, mapped by desired cluster
    * ID, e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`. Fields
    * marked `OutputOnly` must be left blank. Currently, at most two clusters
    * can be specified.
    */
  var clusters: js.UndefOr[StringDictionary[SchemaCluster]] = js.native
  /**
    * The instance to create. Fields marked `OutputOnly` must be left blank.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  /**
    * The ID to be used when referring to the new instance within its project,
    * e.g., just `myinstance` rather than
    * `projects/myproject/instances/myinstance`.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The unique name of the project in which to create the new instance.
    * Values are of the form `projects/&lt;project&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaCreateInstanceRequest {
  @scala.inline
  def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  @scala.inline
  implicit class SchemaCreateInstanceRequestOps[Self <: SchemaCreateInstanceRequest] (val x: Self) extends AnyVal {
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
    def setClusters(value: StringDictionary[SchemaCluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    @scala.inline
    def setInstance(value: SchemaInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

