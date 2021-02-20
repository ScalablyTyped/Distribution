package typings.googleCloudTextToSpeech

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleCloudTextToSpeech.v1Mod.TextToSpeechClient
import typings.googleGax.clientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofTextToSpeechClient
    extends Instantiable0[TextToSpeechClient]
       with Instantiable1[/* opts */ ClientOptions, TextToSpeechClient] {
    
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
  
  @js.native
  trait TypeofTextToSpeechClientInstantiable
    extends Instantiable0[typings.googleCloudTextToSpeech.v1beta1Mod.TextToSpeechClient]
       with Instantiable1[
          /* opts */ ClientOptions, 
          typings.googleCloudTextToSpeech.v1beta1Mod.TextToSpeechClient
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
  
  @js.native
  trait Typeofv1 extends StObject {
    
    var TextToSpeechClient: TypeofTextToSpeechClient = js.native
  }
  object Typeofv1 {
    
    @scala.inline
    def apply(TextToSpeechClient: TypeofTextToSpeechClient): Typeofv1 = {
      val __obj = js.Dynamic.literal(TextToSpeechClient = TextToSpeechClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofv1]
    }
    
    @scala.inline
    implicit class Typeofv1MutableBuilder[Self <: Typeofv1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextToSpeechClient(value: TypeofTextToSpeechClient): Self = StObject.set(x, "TextToSpeechClient", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofv1beta1 extends StObject {
    
    var TextToSpeechClient: TypeofTextToSpeechClientInstantiable = js.native
  }
  object Typeofv1beta1 {
    
    @scala.inline
    def apply(TextToSpeechClient: TypeofTextToSpeechClientInstantiable): Typeofv1beta1 = {
      val __obj = js.Dynamic.literal(TextToSpeechClient = TextToSpeechClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofv1beta1]
    }
    
    @scala.inline
    implicit class Typeofv1beta1MutableBuilder[Self <: Typeofv1beta1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextToSpeechClient(value: TypeofTextToSpeechClientInstantiable): Self = StObject.set(x, "TextToSpeechClient", value.asInstanceOf[js.Any])
    }
  }
}
