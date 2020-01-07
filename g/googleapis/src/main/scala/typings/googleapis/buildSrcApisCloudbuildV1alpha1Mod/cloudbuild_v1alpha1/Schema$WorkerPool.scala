package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a WorkerPool to run the builds.  Workers are machines
  * that Cloud Build uses to run your builds. By default, all workers run in a
  * project owned by Cloud Build. To have full control over the workers that
  * execute your builds -- such as enabling them to access private resources on
  * your private network -- you can request Cloud Build to run the workers in
  * your own project by creating a custom workers pool.
  */
@js.native
trait Schema$WorkerPool extends js.Object {
  /**
    * Output only. Time at which the request to create the `WorkerPool` was
    * received.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Time at which the request to delete the `WorkerPool` was
    * received.
    */
  var deleteTime: js.UndefOr[String] = js.native
  /**
    * User-defined name of the `WorkerPool`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The project ID of the GCP project in which the `WorkerPool` is created.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * List of regions to create the `WorkerPool`. Regions can&#39;t be empty.
    * If Cloud Build adds a new GCP region in the future, the existing
    * `WorkerPool` will not be enabled in the new region automatically; you
    * must add the new region to the `regions` field to enable the `WorkerPool`
    * in that region.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The service account used to manage the `WorkerPool`. The
    * service account must have the Compute Instance Admin (Beta) permission at
    * the project level.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * Output only. WorkerPool Status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. Time at which the request to update the `WorkerPool` was
    * received.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Configuration to be used for a creating workers in the `WorkerPool`.
    */
  var workerConfig: js.UndefOr[Schema$WorkerConfig] = js.native
  /**
    * Total number of workers to be created across all requested regions.
    */
  var workerCount: js.UndefOr[String] = js.native
}

object Schema$WorkerPool {
  @scala.inline
  def apply(
    createTime: String = null,
    deleteTime: String = null,
    name: String = null,
    projectId: String = null,
    regions: js.Array[String] = null,
    serviceAccountEmail: String = null,
    status: String = null,
    updateTime: String = null,
    workerConfig: Schema$WorkerConfig = null,
    workerCount: String = null
  ): Schema$WorkerPool = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deleteTime != null) __obj.updateDynamic("deleteTime")(deleteTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (workerConfig != null) __obj.updateDynamic("workerConfig")(workerConfig.asInstanceOf[js.Any])
    if (workerCount != null) __obj.updateDynamic("workerCount")(workerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerPool]
  }
}

