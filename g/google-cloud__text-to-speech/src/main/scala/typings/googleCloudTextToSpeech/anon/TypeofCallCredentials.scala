package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.grpc.CallCredentials
import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallMetadataGenerator
import typings.grpcGrpcJs.buildSrcCallCredentialsMod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCallCredentials
  extends StObject
     with Instantiable0[CallCredentials] {
  
  def createEmpty(): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = js.native
  
  /**
    * Create a gRPC credential from a Google credential object.
    * @param googleCredentials The authentication client to use.
    * @return The resulting CallCredentials object.
    */
  def createFromGoogleCredential(googleCredentials: OAuth2Client): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = js.native
  
  /**
    * Creates a new CallCredentials object from a given function that generates
    * Metadata objects.
    * @param metadataGenerator A function that accepts a set of options, and
    * generates a Metadata object based on these options, which is passed back
    * to the caller via a supplied (err, metadata) callback.
    */
  def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = js.native
}
