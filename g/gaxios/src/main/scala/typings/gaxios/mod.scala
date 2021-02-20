package typings.gaxios

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gaxios", "Gaxios")
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  class Gaxios ()
    extends typings.gaxios.gaxiosMod.Gaxios {
    def this(defaults: GaxiosOptions) = this()
  }
  
  @JSImport("gaxios", "GaxiosError")
  @js.native
  class GaxiosError[T] protected ()
    extends typings.gaxios.commonMod.GaxiosError[T] {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  }
  
  @JSImport("gaxios", "instance")
  @js.native
  val instance: typings.gaxios.gaxiosMod.Gaxios = js.native
  
  @JSImport("gaxios", "request")
  @js.native
  def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
}
