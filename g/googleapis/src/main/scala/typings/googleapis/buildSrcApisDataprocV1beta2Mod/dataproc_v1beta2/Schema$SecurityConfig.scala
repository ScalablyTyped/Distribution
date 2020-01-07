package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Security related configuration, including encryption, Kerberos, etc.
  */
@js.native
trait Schema$SecurityConfig extends js.Object {
  /**
    * Kerberos related configuration.
    */
  var kerberosConfig: js.UndefOr[Schema$KerberosConfig] = js.native
}

object Schema$SecurityConfig {
  @scala.inline
  def apply(kerberosConfig: Schema$KerberosConfig = null): Schema$SecurityConfig = {
    val __obj = js.Dynamic.literal()
    if (kerberosConfig != null) __obj.updateDynamic("kerberosConfig")(kerberosConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityConfig]
  }
}

