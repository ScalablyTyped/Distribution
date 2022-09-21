package typings.dmgBuilder

import typings.appBuilderLib.macOptionsMod.DmgOptions
import typings.appBuilderLib.macPackagerMod.default
import typings.appBuilderLib.mod.Target
import typings.builderUtil.archMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dmg-builder", "DmgTarget")
  @js.native
  open class DmgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    
    def computeDmgOptions(): js.Promise[DmgOptions] = js.native
    
    def computeVolumeName(arch: Arch): String = js.native
    def computeVolumeName(arch: Arch, custom: String): String = js.native
    
    @JSName("options")
    val options_DmgTarget: DmgOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /* private */ var signDmg: Any = js.native
  }
}
