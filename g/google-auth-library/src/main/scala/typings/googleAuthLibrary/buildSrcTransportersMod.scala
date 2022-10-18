package typings.googleAuthLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.gaxios.mod.GaxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransportersMod {
  
  @JSImport("google-auth-library/build/src/transporters", "DefaultTransporter")
  @js.native
  open class DefaultTransporter () extends StObject {
    
    /**
      * Configures request options before making a request.
      * @param opts GaxiosOptions options.
      * @return Configured options.
      */
    def configure(): GaxiosOptions = js.native
    def configure(opts: GaxiosOptions): GaxiosOptions = js.native
    
    /**
      * Changes the error to include details from the body.
      */
    /* private */ var processError: Any = js.native
    
    /**
      * Makes a request using Gaxios with given options.
      * @param opts GaxiosOptions options.
      * @param callback optional callback that contains GaxiosResponse object.
      * @return GaxiosPromise, assuming no callback is passed.
      */
    def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions): Unit = js.native
  }
  /* static members */
  object DefaultTransporter {
    
    /**
      * Default user agent.
      */
    @JSImport("google-auth-library/build/src/transporters", "DefaultTransporter.USER_AGENT")
    @js.native
    val USER_AGENT: String = js.native
  }
  
  type BodyResponseCallback[T] = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
  
  @js.native
  trait RequestError extends GaxiosError[Any] {
    
    var errors: js.Array[js.Error] = js.native
  }
  
  @js.native
  trait Transporter extends StObject {
    
    def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): GaxiosPromise[Any] | Unit = js.native
    @JSName("request")
    def request_T_Union[T](opts: GaxiosOptions): GaxiosPromise[Any] | Unit = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions): Unit = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
  }
}
