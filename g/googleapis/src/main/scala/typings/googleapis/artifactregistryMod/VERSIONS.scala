package typings.googleapis.artifactregistryMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.artifactregistryV1Mod.artifactregistryV1.Artifactregistry
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Artifactregistry {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    Artifactregistry
  ] = js.native
  inline def v1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      Artifactregistry
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS.v1beta1")
  @js.native
  open class v1beta1 protected ()
    extends typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1.Artifactregistry {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS.v1beta1")
  @js.native
  def v1beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1.Artifactregistry
  ] = js.native
  inline def v1beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1.Artifactregistry
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS.v1beta2")
  @js.native
  open class v1beta2 protected ()
    extends typings.googleapis.v1beta2Mod.artifactregistryV1beta2.Artifactregistry {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/artifactregistry", "VERSIONS.v1beta2")
  @js.native
  def v1beta2: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.v1beta2Mod.artifactregistryV1beta2.Artifactregistry
  ] = js.native
  inline def v1beta2_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.v1beta2Mod.artifactregistryV1beta2.Artifactregistry
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
}
