package typings.getNpmTarballUrl

import typings.getNpmTarballUrl.anon.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-npm-tarball-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pkgName: String, pkgVersion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pkgName.asInstanceOf[js.Any], pkgVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(pkgName: String, pkgVersion: String, opts: Registry): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pkgName.asInstanceOf[js.Any], pkgVersion.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
