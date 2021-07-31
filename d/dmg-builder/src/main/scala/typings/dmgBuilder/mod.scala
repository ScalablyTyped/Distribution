package typings.dmgBuilder

import typings.appBuilderLib.macOptionsMod.DmgOptions
import typings.appBuilderLib.macPackagerMod.default
import typings.appBuilderLib.mod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dmg-builder", "DmgTarget")
  @js.native
  class DmgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    
    def computeDmgOptions(): js.Promise[DmgOptions] = js.native
    
    def computeVolumeName(): String = js.native
    def computeVolumeName(custom: String): String = js.native
    
    @JSName("options")
    val options_DmgTarget: DmgOptions = js.native
    
    val packager: js.Any = js.native
    
    var signDmg: js.Any = js.native
  }
}
