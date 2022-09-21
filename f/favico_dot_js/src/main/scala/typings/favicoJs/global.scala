package typings.favicoJs

import typings.favicoJs.favicojs.FavicoJsOptions
import typings.favicoJs.favicojs.FavicoJsStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Favico")
  @js.native
  open class Favico ()
    extends StObject
       with typings.favicoJs.favicojs.Favico {
    def this(opt: FavicoJsOptions) = this()
  }
  @JSGlobal("Favico")
  @js.native
  def Favico: FavicoJsStatic = js.native
  inline def Favico_=(x: FavicoJsStatic): Unit = js.Dynamic.global.updateDynamic("Favico")(x.asInstanceOf[js.Any])
}
