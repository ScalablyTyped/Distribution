package typings.dynogels.mod.AWS

import typings.awsSdk.configMod.APIVersions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
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
  extends typings.awsSdk.mod.Config_ {
  def this(options: typings.awsSdk.configBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
}
