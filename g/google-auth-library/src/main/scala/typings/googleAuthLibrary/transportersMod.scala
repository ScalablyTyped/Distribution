package typings.googleAuthLibrary

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosPromise
import typings.gaxios.commonMod.GaxiosResponse
import typings.gaxios.mod.GaxiosError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportersMod {
  
  @JSImport("google-auth-library/build/src/transporters", "DefaultTransporter")
  @js.native
  class DefaultTransporter () extends StObject {
    
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
    var processError: js.Any = js.native
    
    def request[T](opts: GaxiosOptions): Unit = js.native
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
    /**
      * Makes a request using Gaxios with given options.
      * @param opts GaxiosOptions options.
      * @param callback optional callback that contains GaxiosResponse object.
      * @return GaxiosPromise, assuming no callback is passed.
      */
    @JSName("request")
    def request_T_GaxiosPromise[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
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
  
  type BodyResponseCallback[T] = js.Function2[/* err */ Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
  
  @js.native
  trait RequestError
    extends GaxiosError[js.Any] {
    
    var errors: js.Array[Error] = js.native
  }
  
  @js.native
  trait Transporter extends StObject {
    
    def request[T](opts: GaxiosOptions): GaxiosPromise[js.Any] | Unit = js.native
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): GaxiosPromise[js.Any] | Unit = js.native
    @JSName("request")
    def request_T_GaxiosPromise[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions): Unit = js.native
    @JSName("request")
    def request_T_Unit[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
  }
}
