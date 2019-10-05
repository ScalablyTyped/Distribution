package typings.dynogels.dynogelsMod.AWS

import typings.awsDashSdk.libCredentialsEc2UnderscoreMetadataUnderscoreCredentialsMod.EC2MetadataCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.EC2MetadataCredentials")
@js.native
/**
		 * Creates credentials from the metadata service on an EC2 instance.
		 * @param {object} options - Override the default (1s) timeout period.
		 */
class EC2MetadataCredentials ()
  extends typings.awsDashSdk.awsDashSdkMod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}

