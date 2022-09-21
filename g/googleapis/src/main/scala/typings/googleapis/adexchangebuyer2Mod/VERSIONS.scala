package typings.googleapis.adexchangebuyer2Mod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1.Adexchangebuyer2
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/adexchangebuyer2", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/adexchangebuyer2", "VERSIONS.v2beta1")
  @js.native
  open class v2beta1 protected () extends Adexchangebuyer2 {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/adexchangebuyer2", "VERSIONS.v2beta1")
  @js.native
  def v2beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    Adexchangebuyer2
  ] = js.native
  inline def v2beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      Adexchangebuyer2
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta1")(x.asInstanceOf[js.Any])
}
