package typings.glob

import typings.glob.distMjsWalkerMod.GlobWalkerOpts
import typings.minimatch.mod.Minimatch_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsIgnoreMod {
  
  @JSImport("glob/dist/mjs/ignore", "Ignore")
  @js.native
  open class Ignore protected ()
    extends StObject
       with IgnoreLike {
    def this(ignored: js.Array[String], param1: GlobWalkerOpts) = this()
    
    var absolute: js.Array[Minimatch_] = js.native
    
    var absoluteChildren: js.Array[Minimatch_] = js.native
    
    @JSName("childrenIgnored")
    def childrenIgnored_MIgnore(
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ): Boolean = js.native
    
    @JSName("ignored")
    def ignored_MIgnore(
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ): Boolean = js.native
    
    var relative: js.Array[Minimatch_] = js.native
    
    var relativeChildren: js.Array[Minimatch_] = js.native
  }
  
  trait IgnoreLike extends StObject {
    
    var childrenIgnored: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ /* p */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var ignored: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ /* p */ Any, 
          Boolean
        ]
      ] = js.undefined
  }
  object IgnoreLike {
    
    inline def apply(): IgnoreLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreLike] (val x: Self) extends AnyVal {
      
      inline def setChildrenIgnored(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ /* p */ Any => Boolean
      ): Self = StObject.set(x, "childrenIgnored", js.Any.fromFunction1(value))
      
      inline def setChildrenIgnoredUndefined: Self = StObject.set(x, "childrenIgnored", js.undefined)
      
      inline def setIgnored(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ /* p */ Any => Boolean
      ): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    }
  }
}
