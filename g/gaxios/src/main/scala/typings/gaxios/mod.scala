package typings.gaxios

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gaxios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gaxios", "Gaxios")
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  open class Gaxios ()
    extends typings.gaxios.buildSrcGaxiosMod.Gaxios {
    def this(defaults: GaxiosOptions) = this()
  }
  
  @JSImport("gaxios", "GaxiosError")
  @js.native
  open class GaxiosError[T] protected ()
    extends typings.gaxios.buildSrcCommonMod.GaxiosError[T] {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  }
  
  @JSImport("gaxios", "instance")
  @js.native
  val instance: typings.gaxios.buildSrcGaxiosMod.Gaxios = js.native
  
  inline def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GaxiosResponse[T]]]
}
