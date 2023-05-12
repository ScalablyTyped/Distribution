package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.googleCloudTextToSpeech.buildSrcV1beta1Mod.TextToSpeechLongAudioSynthesizeClient
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTextToSpeechLongAud
  extends StObject
     with Instantiable0[TextToSpeechLongAudioSynthesizeClient]
     with Instantiable1[/* opts */ ClientOptions, TextToSpeechLongAudioSynthesizeClient]
     with Instantiable2[
      (/* opts */ ClientOptions) | (/* opts */ Unit), 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof gax */ /* gaxInstance */ js.Any, 
      TextToSpeechLongAudioSynthesizeClient
    ] {
  
  /**
    * The DNS address for this API service - same as servicePath(),
    * exists for compatibility reasons.
    * @returns {string} The DNS address for this service.
    */
  def apiEndpoint: String = js.native
  
  /**
    * The port for this API service.
    * @returns {number} The default port for this service.
    */
  def port: Double = js.native
  
  /**
    * The scopes needed to make gRPC calls for every method defined
    * in this service.
    * @returns {string[]} List of default scopes.
    */
  def scopes: js.Array[String] = js.native
  
  /**
    * The DNS address for this API service.
    * @returns {string} The DNS address for this service.
    */
  def servicePath: String = js.native
}
