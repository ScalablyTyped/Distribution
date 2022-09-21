package typings.googleapis.adsenseMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.v1Dot4Mod.adsenseV14.Adsense
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/adsense", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/adsense", "VERSIONS.v1.4")
  @js.native
  open class v14 protected () extends Adsense {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/adsense", "VERSIONS.v1.4")
  @js.native
  def v14: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Adsense] = js.native
  
  inline def v14_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Adsense]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1.4")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/adsense", "VERSIONS.v2")
  @js.native
  open class v2 protected ()
    extends typings.googleapis.v2Mod.adsenseV2.Adsense {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/adsense", "VERSIONS.v2")
  @js.native
  def v2: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.v2Mod.adsenseV2.Adsense
  ] = js.native
  inline def v2_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.v2Mod.adsenseV2.Adsense
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
}
