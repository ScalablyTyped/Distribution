package typings.dynogels.dynogelsMod.AWS

import org.scalablytyped.runtime.TopLevel
import typings.awsDashSdk.libConfigMod.APIVersions
import typings.awsDashSdk.libConfigMod.ConfigurationOptions
import typings.awsDashSdk.libConfigMod.GlobalConfigInstance
import typings.awsDashSdk.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServicePlaceholders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config ()
  extends typings.awsDashSdk.awsDashSdkMod.Config {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}

@JSImport("dynogels", "AWS.config")
@js.native
object config extends TopLevel[GlobalConfigInstance]

