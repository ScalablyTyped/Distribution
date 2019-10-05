package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Secret extends js.Object {
  /** Cloud KMS key name to use to decrypt these envs. */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  /**
    * Map of environment variable name to its encrypted value.
    *
    * Secret environment variables must be unique across all of a build's
    * secrets, and must be used by at least one build step. Values can be at most
    * 1 KB in size. There can be at most ten secret values across all of a
    * build's secrets.
    */
  var secretEnv: js.UndefOr[Record[String, String]] = js.undefined
}

object Secret {
  @scala.inline
  def apply(kmsKeyName: String = null, secretEnv: Record[String, String] = null): Secret = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (secretEnv != null) __obj.updateDynamic("secretEnv")(secretEnv)
    __obj.asInstanceOf[Secret]
  }
}

