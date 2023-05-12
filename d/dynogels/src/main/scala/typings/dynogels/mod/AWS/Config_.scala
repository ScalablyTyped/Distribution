package typings.dynogels.mod.AWS

import typings.awsSdk2Types.libConfigMod.APIVersions
import typings.awsSdk2Types.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
open class Config_ ()
  extends typings.awsSdk2Types.mod.Config_ {
  def this(options: typings.awsSdk2Types.libConfigBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
}
