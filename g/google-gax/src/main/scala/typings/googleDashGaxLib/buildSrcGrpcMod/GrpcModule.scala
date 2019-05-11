package typings
package googleDashGaxLib.buildSrcGrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcModule extends js.Object {
  var Channel: org.scalablytyped.runtime.Instantiable3[
    /* target */ java.lang.String, 
    /* credentials */ grpcLib.grpcMod.ChannelCredentials, 
    /* options */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double], 
    grpcLib.grpcMod.Channel
  ] = js.native
  var Client: org.scalablytyped.runtime.Instantiable2[
    /* address */ java.lang.String, 
    /* credentials */ grpcLib.grpcMod.ChannelCredentials, 
    grpcLib.grpcMod.Client
  ] = js.native
  var ClientDuplexStream: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ClientDuplexStream[js.Object, js.Object]] = js.native
  var ClientReadableStream: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ClientReadableStream[js.Object]] = js.native
  var ClientUnaryCall: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ClientUnaryCall] = js.native
  var ClientWritableStream: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ClientWritableStream[js.Object]] = js.native
  var InterceptingCall: org.scalablytyped.runtime.Instantiable1[/* nextCall */ grpcLib.grpcMod.InterceptingCall, grpcLib.grpcMod.InterceptingCall] = js.native
  var ListenerBuilder: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ListenerBuilder] = js.native
  var Metadata: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.Metadata] = js.native
  var RequesterBuilder: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.RequesterBuilder] = js.native
  var Server: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.Server] = js.native
  var ServerCredentials: googleDashGaxLib.Anon_CheckClientCertificate = js.native
  var ServerDuplexStream: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ServerDuplexStream[js.Object, js.Object]] = js.native
  var ServerReadableStream: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ServerReadableStream[js.Object]] = js.native
  var ServerUnaryCall: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ServerUnaryCall[js.Object]] = js.native
  var ServerWriteableStream: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.ServerWriteableStream[js.Object]] = js.native
  var StatusBuilder: org.scalablytyped.runtime.Instantiable0[grpcLib.grpcMod.StatusBuilder] = js.native
  val credentials: googleDashGaxLib.Anon_CertChain = js.native
  var isLegacy: scala.Boolean = js.native
  var status: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  def closeClient(clientObj: grpcLib.grpcMod.Client): scala.Unit = js.native
  def getClientChannel(client: grpcLib.grpcMod.Client): grpcLib.grpcMod.Channel = js.native
  def load[T](filename: grpcLib.grpcMod.Filename): T = js.native
  def loadObject[T](value: js.Object): T = js.native
  def loadObject[T](value: js.Object, options: grpcLib.grpcMod.LoadObjectOptions): T = js.native
  def loadPackageDefinition(packageDefinition: grpcLib.grpcMod.PackageDefinition): grpcLib.grpcMod.GrpcObject = js.native
  @JSName("load")
  def load_json[T](filename: grpcLib.grpcMod.Filename, format: googleDashGaxLib.googleDashGaxLibStrings.json): T = js.native
  @JSName("load")
  def load_json[T](
    filename: grpcLib.grpcMod.Filename,
    format: googleDashGaxLib.googleDashGaxLibStrings.json,
    options: grpcLib.grpcMod.LoadOptions
  ): T = js.native
  @JSName("load")
  def load_proto[T](filename: grpcLib.grpcMod.Filename, format: googleDashGaxLib.googleDashGaxLibStrings.proto): T = js.native
  @JSName("load")
  def load_proto[T](
    filename: grpcLib.grpcMod.Filename,
    format: googleDashGaxLib.googleDashGaxLibStrings.proto,
    options: grpcLib.grpcMod.LoadOptions
  ): T = js.native
  def makeGenericClientConstructor(
    methods: grpcLib.grpcMod.ServiceDefinition[_],
    serviceName: java.lang.String,
    classOptions: grpcLib.grpcMod.GenericClientOptions
  ): org.scalablytyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ grpcLib.grpcMod.ChannelCredentials, 
    /* options */ js.UndefOr[/* options */ js.Object], 
    grpcLib.grpcMod.Client
  ] = js.native
  def setLogVerbosity(verbosity: grpcLib.grpcMod.logVerbosity): scala.Unit = js.native
  def setLogger(logger: stdLib.Console): scala.Unit = js.native
  def waitForClientReady(
    client: grpcLib.grpcMod.Client,
    deadline: grpcLib.grpcMod.Deadline,
    callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

