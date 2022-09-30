package typings.googleCloudTextToSpeech.srcMod

import typings.googleCloudTextToSpeech.anon.Typeoffallback
import typings.googleCloudTextToSpeech.anon.Typeofgax
import typings.googleGax.clientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "v1.TextToSpeechClient")
  @js.native
  /**
    * Construct an instance of TextToSpeechClient.
    *
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#creating-the-client-instance).
    * The common options are:
    * @param {object} [options.credentials] - Credentials object.
    * @param {string} [options.credentials.client_email]
    * @param {string} [options.credentials.private_key]
    * @param {string} [options.email] - Account email address. Required when
    *     using a .pem or .p12 keyFilename.
    * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
    *     .p12 key downloaded from the Google Developers Console. If you provide
    *     a path to a JSON file, the projectId option below is not necessary.
    *     NOTE: .pem and .p12 require you to specify options.email as well.
    * @param {number} [options.port] - The port on which to connect to
    *     the remote host.
    * @param {string} [options.projectId] - The project ID from the Google
    *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
    *     the environment variable GCLOUD_PROJECT for your project ID. If your
    *     app is running in an environment which supports
    *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
    *     your project ID will be detected automatically.
    * @param {string} [options.apiEndpoint] - The domain name of the
    *     API remote host.
    * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
    *     Follows the structure of {@link gapicConfig}.
    * @param {boolean | "rest"} [options.fallback] - Use HTTP fallback mode.
    *     Pass "rest" to use HTTP/1.1 REST API instead of gRPC.
    *     For more information, please check the
    *     {@link https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#http11-rest-api-mode documentation}.
    * @param {gax} [gaxInstance]: loaded instance of `google-gax`. Useful if you
    *     need to avoid loading the default gRPC version and want to use the fallback
    *     HTTP implementation. Load only fallback version and pass it to the constructor:
    *     ```
    *     const gax = require('google-gax/build/src/fallback'); // avoids loading google-gax with gRPC
    *     const client = new TextToSpeechClient({fallback: 'rest'}, gax);
    *     ```
    */
  open class TextToSpeechClient ()
    extends typings.googleCloudTextToSpeech.v1Mod.TextToSpeechClient {
    def this(opts: ClientOptions) = this()
    def this(opts: Unit, gaxInstance: Typeoffallback) = this()
    def this(opts: Unit, gaxInstance: Typeofgax) = this()
    def this(opts: ClientOptions, gaxInstance: Typeoffallback) = this()
    def this(opts: ClientOptions, gaxInstance: Typeofgax) = this()
  }
}
