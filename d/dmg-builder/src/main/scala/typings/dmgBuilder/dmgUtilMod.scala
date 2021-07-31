package typings.dmgBuilder

import typings.appBuilderLib.macPackagerMod.default
import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmgUtilMod {
  
  @JSImport("dmg-builder/out/dmgUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dmg-builder/out/dmgUtil", "DmgTarget")
  @js.native
  class DmgTarget protected ()
    extends typings.dmgBuilder.mod.DmgTarget {
    def this(packager: default, outDir: String) = this()
  }
  
  @scala.inline
  def attachAndExecute(dmgPath: String, readWrite: Boolean, task: js.Function0[js.Promise[js.Any]]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachAndExecute")(dmgPath.asInstanceOf[js.Any], readWrite.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def computeBackground(packager: PlatformPackager[js.Any]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeBackground")(packager.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def detach(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getDmgTemplatePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDmgTemplatePath")().asInstanceOf[String]
  
  @scala.inline
  def getDmgVendorPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDmgVendorPath")().asInstanceOf[String]
}
