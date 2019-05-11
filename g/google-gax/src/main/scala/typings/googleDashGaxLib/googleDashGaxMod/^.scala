package typings
package googleDashGaxLib.googleDashGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val createByteLengthFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ js.Any = js.native
  val version: js.Any = js.native
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    configOverrides: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    retryNames: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    configOverrides: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    retryNames: org.scalablytyped.runtime.StringDictionary[scala.Double],
    otherArgs: js.Object
  ): js.Any = js.native
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    configOverrides: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    retryNames: org.scalablytyped.runtime.StringDictionary[scala.Double],
    otherArgs: js.Object,
    promise: stdLib.PromiseConstructor
  ): js.Any = js.native
  def createApiCall(
    funcWithAuth: js.Promise[googleDashGaxLib.buildSrcApiCallableMod.APIFunc],
    settings: googleDashGaxLib.buildSrcGaxMod.CallSettings
  ): googleDashGaxLib.buildSrcApiCallableMod.APICall = js.native
  def createApiCall(
    funcWithAuth: js.Promise[googleDashGaxLib.buildSrcApiCallableMod.APIFunc],
    settings: googleDashGaxLib.buildSrcGaxMod.CallSettings,
    optDescriptor: js.Any
  ): googleDashGaxLib.buildSrcApiCallableMod.APICall = js.native
  def lro(options: googleDashGaxLib.buildSrcGrpcMod.GrpcClientOptions): googleDashGaxLib.buildSrcOperationsClientMod.OperationsClientBuilder = js.native
  def operation(
    op: googleDashGaxLib.buildSrcLongrunningMod.Operation,
    longrunningDescriptor: googleDashGaxLib.buildSrcLongrunningMod.LongrunningDescriptor,
    backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings
  ): googleDashGaxLib.buildSrcLongrunningMod.Operation = js.native
  def operation(
    op: googleDashGaxLib.buildSrcLongrunningMod.Operation,
    longrunningDescriptor: googleDashGaxLib.buildSrcLongrunningMod.LongrunningDescriptor,
    backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings,
    callOptions: googleDashGaxLib.buildSrcGaxMod.CallOptions
  ): googleDashGaxLib.buildSrcLongrunningMod.Operation = js.native
}

