package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.GrpcClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGrpcClientInstantiable
  extends StObject
     with Instantiable0[GrpcClient] {
  
  def _resolveFile(protoPath: String, filename: String): String = js.native
  
  /**
    * In rare cases users might need to deallocate all memory consumed by loaded protos.
    * This method will delete the proto cache content.
    */
  def clearProtoCache(): Unit = js.native
  
  /**
    * Creates a 'bytelength' function for a given proto message class.
    *
    * See {@link BundleDescriptor} about the meaning of the return value.
    *
    * @param {function} message - a constructor function that is generated by
    *   protobuf.js. Assumes 'encoder' field in the message.
    * @return {function(Object):number} - a function to compute the byte length
    *   for an object.
    */
  def createByteLengthFunction(message: typings.googleGax.anon.TypeofMessage): js.Function1[/* obj */ js.Object, Double] = js.native
  
  /* private */ var defaultOptions: Any = js.native
  
  /* private */ var protoCache: Any = js.native
  
  /**
    * Key for proto cache map. We are doing our best to make sure we respect
    * the options, so if the same proto file is loaded with different set of
    * options, the cache won't be used.  Since some of the options are
    * Functions (e.g. `enums: String` - see below in `loadProto()`),
    * they will be omitted from the cache key.  If the cache breaks anything
    * for you, use the `ignoreCache` parameter of `loadProto()` to disable it.
    */
  /* private */ var protoCacheKey: Any = js.native
}
