package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores the information that the controller will fetch from the server in
  * order to run. Should only be used by VMs created by the Pipelines Service
  * and not by end users.
  */
@js.native
trait Schema$ControllerConfig extends js.Object {
  var cmd: js.UndefOr[String] = js.native
  var disks: js.UndefOr[StringDictionary[String]] = js.native
  var gcsLogPath: js.UndefOr[String] = js.native
  var gcsSinks: js.UndefOr[StringDictionary[Schema$RepeatedString]] = js.native
  var gcsSources: js.UndefOr[StringDictionary[Schema$RepeatedString]] = js.native
  var image: js.UndefOr[String] = js.native
  var machineType: js.UndefOr[String] = js.native
  var vars: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$ControllerConfig {
  @scala.inline
  def apply(
    cmd: String = null,
    disks: StringDictionary[String] = null,
    gcsLogPath: String = null,
    gcsSinks: StringDictionary[Schema$RepeatedString] = null,
    gcsSources: StringDictionary[Schema$RepeatedString] = null,
    image: String = null,
    machineType: String = null,
    vars: StringDictionary[String] = null
  ): Schema$ControllerConfig = {
    val __obj = js.Dynamic.literal()
    if (cmd != null) __obj.updateDynamic("cmd")(cmd.asInstanceOf[js.Any])
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (gcsLogPath != null) __obj.updateDynamic("gcsLogPath")(gcsLogPath.asInstanceOf[js.Any])
    if (gcsSinks != null) __obj.updateDynamic("gcsSinks")(gcsSinks.asInstanceOf[js.Any])
    if (gcsSources != null) __obj.updateDynamic("gcsSources")(gcsSources.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ControllerConfig]
  }
}

