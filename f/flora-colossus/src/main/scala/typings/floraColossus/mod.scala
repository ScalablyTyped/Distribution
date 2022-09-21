package typings.floraColossus

import typings.floraColossus.depTypesMod.DepType
import typings.floraColossus.depTypesMod.DepType.DEV
import typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL
import typings.floraColossus.depTypesMod.DepType.OPTIONAL
import typings.floraColossus.depTypesMod.DepType.PROD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flora-colossus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("flora-colossus", "DepType")
  @js.native
  object DepType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.floraColossus.depTypesMod.DepType & Double] = js.native
    
    /* 1 */ val DEV: typings.floraColossus.depTypesMod.DepType.DEV & Double = js.native
    
    /* 3 */ val DEV_OPTIONAL: typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL & Double = js.native
    
    /* 2 */ val OPTIONAL: typings.floraColossus.depTypesMod.DepType.OPTIONAL & Double = js.native
    
    /* 0 */ val PROD: typings.floraColossus.depTypesMod.DepType.PROD & Double = js.native
    
    /* 4 */ val ROOT: typings.floraColossus.depTypesMod.DepType.ROOT & Double = js.native
  }
  
  @JSImport("flora-colossus", "Walker")
  @js.native
  open class Walker protected ()
    extends typings.floraColossus.walkerMod.Walker {
    def this(modulePath: String) = this()
  }
  
  inline def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = (^.asInstanceOf[js.Dynamic].applyDynamic("childDepType")(parentType.asInstanceOf[js.Any], childType.asInstanceOf[js.Any])).asInstanceOf[PROD | DEV | OPTIONAL | DEV_OPTIONAL]
  
  inline def depTypeGreater(newType: DepType, existing: DepType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("depTypeGreater")(newType.asInstanceOf[js.Any], existing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
