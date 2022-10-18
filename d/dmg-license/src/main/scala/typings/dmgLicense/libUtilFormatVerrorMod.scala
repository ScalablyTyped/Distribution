package typings.dmgLicense

import typings.node.utilMod.InspectOptions
import typings.verror.mod.MultiError
import typings.verror.mod.Options
import typings.verror.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilFormatVerrorMod {
  
  @JSImport("dmg-license/lib/util/format-verror", "PrettyMultiError")
  @js.native
  open class PrettyMultiError protected ()
    extends MultiError
       with HasCustomInspect {
    def this(errors: js.Array[js.Error]) = this()
    
    /* private */ var _ownStack: Any = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
  }
  
  @JSImport("dmg-license/lib/util/format-verror", "PrettyVError")
  @js.native
  open class PrettyVError protected ()
    extends ^
       with HasCustomInspect {
    def this(message: String, params: Any*) = this()
    def this(message: Unit, params: Any*) = this()
    def this(options: js.Error, message: String, params: Any*) = this()
    def this(options: Options, message: String, params: Any*) = this()
    
    /* private */ var _ownStack: Any = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
  }
  /* static members */
  object PrettyVError {
    
    @JSImport("dmg-license/lib/util/format-verror", "PrettyVError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | PrettyMultiError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorFromList")(errors.asInstanceOf[js.Any]).asInstanceOf[Null | T | PrettyMultiError]
  }
  
  trait CustomInspectOptions
    extends StObject
       with InspectOptions {
    
    def stylize(s: String, style: String): String
  }
  object CustomInspectOptions {
    
    inline def apply(stylize: (String, String) => String): CustomInspectOptions = {
      val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
      __obj.asInstanceOf[CustomInspectOptions]
    }
    
    extension [Self <: CustomInspectOptions](x: Self) {
      
      inline def setStylize(value: (String, String) => String): Self = StObject.set(x, "stylize", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait HasCustomInspect extends StObject
}
