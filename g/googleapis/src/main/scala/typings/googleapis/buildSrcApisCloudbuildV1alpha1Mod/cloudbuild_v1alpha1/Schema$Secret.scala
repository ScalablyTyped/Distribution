package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pairs a set of secret environment variables containing encrypted values
  * with the Cloud KMS key to use to decrypt the value.
  */
@js.native
trait Schema$Secret extends js.Object {
  /**
    * Cloud KMS key name to use to decrypt these envs.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Map of environment variable name to its encrypted value.  Secret
    * environment variables must be unique across all of a build&#39;s secrets,
    * and must be used by at least one build step. Values can be at most 64 KB
    * in size. There can be at most 100 secret values across all of a
    * build&#39;s secrets.
    */
  var secretEnv: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$Secret {
  @scala.inline
  def apply(kmsKeyName: String = null, secretEnv: StringDictionary[String] = null): Schema$Secret = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (secretEnv != null) __obj.updateDynamic("secretEnv")(secretEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Secret]
  }
}

