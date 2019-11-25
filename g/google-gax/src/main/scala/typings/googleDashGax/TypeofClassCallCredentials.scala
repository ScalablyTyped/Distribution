package typings.googleDashGax

import org.scalablytyped.runtime.Instantiable0
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.CallCredentials
import typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallMetadataGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCallCredentials extends Instantiable0[CallCredentials] {
  def createEmpty(): typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials = js.native
  /**
    * Creates a new CallCredentials object from a given function that generates
    * Metadata objects.
    * @param metadataGenerator A function that accepts a set of options, and
    * generates a Metadata object based on these options, which is passed back
    * to the caller via a supplied (err, metadata) callback.
    */
  def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials = js.native
}

