package typings.dynogels.dynogelsMod.AWS

import typings.awsDashSdk.clientsS3Mod.ClientConfiguration
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.ManagedUploadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.S3")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class S3 ()
  extends typings.awsDashSdk.awsDashSdkMod.S3 {
  def this(options: ClientConfiguration) = this()
}

@JSImport("dynogels", "AWS.S3")
@js.native
object S3 extends js.Object {
  @js.native
  class ManagedUpload protected ()
    extends typings.awsDashSdk.awsDashSdkMod.S3.ManagedUpload {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: ManagedUploadOptions) = this()
  }
  
  @js.native
  class PresignedPost ()
    extends typings.awsDashSdk.libS3PresignedUnderscorePostMod.PresignedPost
  
  /* static members */
  @js.native
  object ManagedUpload extends js.Object {
    /**
      * Default value: 10000
      */
    var maxTotalParts: Double = js.native
    /**
      * Returns the minimum number of bytes for an individual part upload.
      * Note: Minimum allowed size is 5 MB.
      * 1024 * 5
      */
    var minPartSize: Double = js.native
  }
  
}

