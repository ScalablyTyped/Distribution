package typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile resource.
  */
@js.native
trait SchemaProfile extends js.Object {
  /**
    * Deployment this profile corresponds to.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
  /**
    * Duration of the profiling session. Input (for the offline mode) or output
    * (for the online mode). The field represents requested profiling duration.
    * It may slightly differ from the effective profiling duration, which is
    * recorded in the profile data, in case the profiling can&#39;t be stopped
    * immediately (e.g. in case stopping the profiling is handled
    * asynchronously).
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Input only. Labels associated to this specific profile. These labels will
    * get merged with the deployment labels for the final data set.  See
    * documentation on deployment labels for validation rules and limits.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Opaque, server-assigned, unique ID for this profile.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Input only. Profile bytes, as a gzip compressed serialized proto, the
    * format is
    * https://github.com/google/pprof/blob/master/proto/profile.proto.
    */
  var profileBytes: js.UndefOr[String] = js.native
  /**
    * Type of profile. For offline mode, this must be specified when creating
    * the profile. For online mode it is assigned and returned by the server.
    */
  var profileType: js.UndefOr[String] = js.native
}

object SchemaProfile {
  @scala.inline
  def apply(
    deployment: SchemaDeployment = null,
    duration: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    profileBytes: String = null,
    profileType: String = null
  ): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profileBytes != null) __obj.updateDynamic("profileBytes")(profileBytes.asInstanceOf[js.Any])
    if (profileType != null) __obj.updateDynamic("profileType")(profileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfile]
  }
}

