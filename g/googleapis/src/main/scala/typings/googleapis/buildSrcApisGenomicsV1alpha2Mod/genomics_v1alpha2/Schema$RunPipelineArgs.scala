package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pipeline run arguments.
  */
@js.native
trait Schema$RunPipelineArgs extends js.Object {
  /**
    * This field is deprecated. Use `labels` instead. Client-specified pipeline
    * operation identifier.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * Pipeline input arguments; keys are defined in the pipeline documentation.
    * All input parameters that do not have default values  must be specified.
    * If parameters with defaults are specified here, the defaults will be
    * overridden.
    */
  var inputs: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * How long to keep the VM up after a failure (for example docker command
    * failed, copying input or output files failed, etc). While the VM is up,
    * one can ssh into the VM to debug. Default is 0; maximum allowed value is
    * 1 day.
    */
  var keepVmAliveOnFailureDuration: js.UndefOr[String] = js.native
  /**
    * Labels to apply to this pipeline run. Labels will also be applied to
    * compute resources (VM, disks) created by this pipeline run. When listing
    * operations, operations can filtered by labels. Label keys may not be
    * empty; label values may be empty. Non-empty labels must be 1-63
    * characters long, and comply with [RFC1035]
    * (https://www.ietf.org/rfc/rfc1035.txt). Specifically, the name must be
    * 1-63 characters long and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a
    * lowercase letter, and all following characters must be a dash, lowercase
    * letter, or digit, except the last character, which cannot be a dash.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. Logging options. Used by the service to communicate results to
    * the user.
    */
  var logging: js.UndefOr[Schema$LoggingOptions] = js.native
  /**
    * Pipeline output arguments; keys are defined in the pipeline
    * documentation.  All output parameters of without default values must be
    * specified.  If parameters with defaults are specified here, the defaults
    * will be overridden.
    */
  var outputs: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. The project in which to run the pipeline. The caller must have
    * WRITER access to all Google Cloud services and resources (e.g. Google
    * Compute Engine) will be used.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Specifies resource requirements/overrides for the pipeline run.
    */
  var resources: js.UndefOr[Schema$PipelineResources] = js.native
  /**
    * The Google Cloud Service Account that will be used to access data and
    * services. By default, the compute service account associated with
    * `projectId` is used.
    */
  var serviceAccount: js.UndefOr[Schema$ServiceAccount] = js.native
}

object Schema$RunPipelineArgs {
  @scala.inline
  def apply(
    clientId: String = null,
    inputs: StringDictionary[String] = null,
    keepVmAliveOnFailureDuration: String = null,
    labels: StringDictionary[String] = null,
    logging: Schema$LoggingOptions = null,
    outputs: StringDictionary[String] = null,
    projectId: String = null,
    resources: Schema$PipelineResources = null,
    serviceAccount: Schema$ServiceAccount = null
  ): Schema$RunPipelineArgs = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (keepVmAliveOnFailureDuration != null) __obj.updateDynamic("keepVmAliveOnFailureDuration")(keepVmAliveOnFailureDuration.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunPipelineArgs]
  }
}

