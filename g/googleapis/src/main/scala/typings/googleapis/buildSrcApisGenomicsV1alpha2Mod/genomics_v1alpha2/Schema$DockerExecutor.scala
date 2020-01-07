package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Docker execuctor specification.
  */
@js.native
trait Schema$DockerExecutor extends js.Object {
  /**
    * Required. The command or newline delimited script to run. The command
    * string will be executed within a bash shell.  If the command exits with a
    * non-zero exit code, output parameter de-localization will be skipped and
    * the pipeline operation&#39;s `error` field will be populated.  Maximum
    * command string length is 16384.
    */
  var cmd: js.UndefOr[String] = js.native
  /**
    * Required. Image name from either Docker Hub or Google Container Registry.
    * Users that run pipelines must have READ access to the image.
    */
  var imageName: js.UndefOr[String] = js.native
}

object Schema$DockerExecutor {
  @scala.inline
  def apply(cmd: String = null, imageName: String = null): Schema$DockerExecutor = {
    val __obj = js.Dynamic.literal()
    if (cmd != null) __obj.updateDynamic("cmd")(cmd.asInstanceOf[js.Any])
    if (imageName != null) __obj.updateDynamic("imageName")(imageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DockerExecutor]
  }
}

