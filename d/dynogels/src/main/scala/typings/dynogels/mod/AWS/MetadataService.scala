package typings.dynogels.mod.AWS

import typings.awsSdk.metadataServiceMod.MetadataServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService ()
  extends typings.awsSdk.mod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}

/* static members */
@JSImport("dynogels", "AWS.MetadataService")
@js.native
object MetadataService extends js.Object {
  /**
    * 169.254.169.254
    */
  var host: String = js.native
}

