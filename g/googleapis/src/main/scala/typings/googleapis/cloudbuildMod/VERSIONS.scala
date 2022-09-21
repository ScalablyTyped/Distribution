package typings.googleapis.cloudbuildMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.cloudbuildV1Mod.cloudbuildV1.Cloudbuild
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudbuild] = js.native
  inline def v1_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudbuild]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1alpha1")
  @js.native
  open class v1alpha1 protected ()
    extends typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1alpha1")
  @js.native
  def v1alpha1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1.Cloudbuild
  ] = js.native
  inline def v1alpha1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1.Cloudbuild
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1alpha2")
  @js.native
  open class v1alpha2 protected ()
    extends typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1alpha2")
  @js.native
  def v1alpha2: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.Cloudbuild
  ] = js.native
  inline def v1alpha2_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.Cloudbuild
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha2")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1beta1")
  @js.native
  open class v1beta1 protected ()
    extends typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/cloudbuild", "VERSIONS.v1beta1")
  @js.native
  def v1beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.Cloudbuild
  ] = js.native
  inline def v1beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.Cloudbuild
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
}
