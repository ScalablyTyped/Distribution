package typings.googleapis.beyondcorpMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.beyondcorpV1Mod.beyondcorpV1.Beyondcorp
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/beyondcorp", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/beyondcorp", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Beyondcorp {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/beyondcorp", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Beyondcorp] = js.native
  inline def v1_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Beyondcorp]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/beyondcorp", "VERSIONS.v1alpha")
  @js.native
  open class v1alpha protected ()
    extends typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha.Beyondcorp {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/beyondcorp", "VERSIONS.v1alpha")
  @js.native
  def v1alpha: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha.Beyondcorp
  ] = js.native
  inline def v1alpha_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha.Beyondcorp
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
}
