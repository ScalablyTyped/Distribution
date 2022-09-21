package typings.detectLibc

import typings.detectLibc.detectLibcStrings.glibc
import typings.detectLibc.detectLibcStrings.musl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-libc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("detect-libc", "GLIBC")
  @js.native
  val GLIBC: glibc = js.native
  
  @JSImport("detect-libc", "MUSL")
  @js.native
  val MUSL: musl = js.native
  
  inline def family(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("family")().asInstanceOf[js.Promise[String | Null]]
  
  inline def familySync(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("familySync")().asInstanceOf[String | Null]
  
  inline def isNonGlibcLinux(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonGlibcLinux")().asInstanceOf[js.Promise[Boolean]]
  
  inline def isNonGlibcLinuxSync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonGlibcLinuxSync")().asInstanceOf[Boolean]
  
  inline def version(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[js.Promise[String | Null]]
  
  inline def versionSync(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("versionSync")().asInstanceOf[String | Null]
}
