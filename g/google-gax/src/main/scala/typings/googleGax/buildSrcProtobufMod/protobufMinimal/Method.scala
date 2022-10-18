package typings.googleGax.buildSrcProtobufMod.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/protobuf", "protobufMinimal.Method")
@js.native
open class Method protected ()
  extends typings.protobufjs.minimalMod.Method {
  /**
    * Constructs a new service method instance.
    * @param name Method name
    * @param type Method type, usually `"rpc"`
    * @param requestType Request message type
    * @param responseType Response message type
    * @param [requestStream] Whether the request is streamed
    * @param [responseStream] Whether the response is streamed
    * @param [options] Declared options
    * @param [comment] The comment for this method
    * @param [parsedOptions] Declared options, properly parsed into an object
    */
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: js.UndefOr[Boolean | StringDictionary[Any]],
    responseStream: js.UndefOr[Boolean | StringDictionary[Any]],
    options: js.UndefOr[StringDictionary[Any]],
    comment: js.UndefOr[String],
    parsedOptions: js.UndefOr[StringDictionary[Any]]
  ) = this()
}
/* static members */
object Method {
  
  @JSImport("google-gax/build/src/protobuf", "protobufMinimal.Method")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a method from a method descriptor.
    * @param name Method name
    * @param json Method descriptor
    * @returns Created method
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMethod): typings.protobufjs.mod.Method = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Method]
}
