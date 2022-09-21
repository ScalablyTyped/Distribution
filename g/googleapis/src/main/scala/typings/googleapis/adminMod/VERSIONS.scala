package typings.googleapis.adminMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.datatransferV1Mod.adminDatatransferV1.Admin
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS.datatransfer_v1")
  @js.native
  open class datatransferV1 protected () extends Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS.datatransfer_v1")
  @js.native
  def datatransferV1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Admin] = js.native
  
  inline def datatransferV1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Admin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datatransfer_v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS.directory_v1")
  @js.native
  open class directoryV1 protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS.directory_v1")
  @js.native
  def directoryV1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin
  ] = js.native
  
  inline def directoryV1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory_v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS.reports_v1")
  @js.native
  open class reportsV1 protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "VERSIONS.reports_v1")
  @js.native
  def reportsV1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.reportsV1Mod.adminReportsV1.Admin
  ] = js.native
  
  inline def reportsV1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.reportsV1Mod.adminReportsV1.Admin
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reports_v1")(x.asInstanceOf[js.Any])
}
