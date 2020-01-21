package typings.dynogels.mod.AWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.FileSystemCredentials")
@js.native
class FileSystemCredentials protected ()
  extends typings.awsSdk.mod.FileSystemCredentials {
  /**
    * Creates a new FileSystemCredentials object from a filename.
    * @param {string} filename - The path on disk to the JSON file to load.
    */
  def this(filename: String) = this()
}

