package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the configuration for a replica in a cluster.
  */
@js.native
trait Schema$GoogleCloudMlV1__ReplicaConfig extends js.Object {
  /**
    * Represents the type and number of accelerators used by the replica.
    * [Learn about restrictions on accelerator configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    */
  var acceleratorConfig: js.UndefOr[Schema$GoogleCloudMlV1__AcceleratorConfig] = js.native
  /**
    * The Docker image to run on the replica. This image must be in Container
    * Registry. Learn more about [configuring custom
    * containers](/ml-engine/docs/distributed-training-containers).
    */
  var imageUri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__ReplicaConfig {
  @scala.inline
  def apply(acceleratorConfig: Schema$GoogleCloudMlV1__AcceleratorConfig = null, imageUri: String = null): Schema$GoogleCloudMlV1__ReplicaConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorConfig != null) __obj.updateDynamic("acceleratorConfig")(acceleratorConfig.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__ReplicaConfig]
  }
}

