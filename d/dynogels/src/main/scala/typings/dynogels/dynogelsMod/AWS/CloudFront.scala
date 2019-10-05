package typings.dynogels.dynogelsMod.AWS

import typings.awsDashSdk.clientsCloudfrontMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.CloudFront")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class CloudFront ()
  extends typings.awsDashSdk.awsDashSdkMod.CloudFront {
  def this(options: ClientConfiguration) = this()
}

@JSImport("dynogels", "AWS.CloudFront")
@js.native
object CloudFront extends js.Object {
  @js.native
  class Signer protected ()
    extends typings.awsDashSdk.awsDashSdkMod.CloudFront.Signer {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: String, privateKey: String) = this()
  }
  
}

