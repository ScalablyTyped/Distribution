package typings.emberAutoImport

import typings.emberAutoImport.jsAutoImportMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsLeaderMod {
  
  @JSImport("ember-auto-import/js/leader", "LeaderChooser")
  @js.native
  open class LeaderChooser () extends StObject {
    
    /* private */ var addonCandidates: Any = js.native
    
    /* private */ var appCandidate: Any = js.native
    
    def leader: default = js.native
    
    /* private */ var locked: Any = js.native
    
    def register(
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any,
      create: js.Function0[default]
    ): Unit = js.native
  }
  /* static members */
  object LeaderChooser {
    
    @JSImport("ember-auto-import/js/leader", "LeaderChooser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `for`(
      addon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): LeaderChooser = ^.asInstanceOf[js.Dynamic].applyDynamic("for")(addon.asInstanceOf[js.Any]).asInstanceOf[LeaderChooser]
  }
}
