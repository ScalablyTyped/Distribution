package typings.dynogels.mod.AWS

import typings.awsSdk2Types.libTokenMod.TokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.Token")
@js.native
open class Token protected ()
  extends typings.awsSdk2Types.mod.Token {
  /**
    * Creates a Token object with a given set of token information as an options hash.
    *
    * @param {object} options - An option hash containing a set of token information.
    */
  def this(options: TokenOptions) = this()
}
/* static members */
object Token {
  
  @JSImport("dynogels", "AWS.Token")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dynogels", "AWS.Token.expiryWindow")
  @js.native
  def expiryWindow: Double = js.native
  inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
}
