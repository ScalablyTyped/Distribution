package typings.floraColossus

import typings.floraColossus.depTypesMod.DepType.DEV
import typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL
import typings.floraColossus.depTypesMod.DepType.OPTIONAL
import typings.floraColossus.depTypesMod.DepType.PROD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depTypesMod {
  
  @JSImport("flora-colossus/lib/depTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DepType extends StObject
  @JSImport("flora-colossus/lib/depTypes", "DepType")
  @js.native
  object DepType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DepType & Double] = js.native
    
    @js.native
    sealed trait DEV
      extends StObject
         with DepType
    /* 1 */ val DEV: typings.floraColossus.depTypesMod.DepType.DEV & Double = js.native
    
    @js.native
    sealed trait DEV_OPTIONAL
      extends StObject
         with DepType
    /* 3 */ val DEV_OPTIONAL: typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL & Double = js.native
    
    @js.native
    sealed trait OPTIONAL
      extends StObject
         with DepType
    /* 2 */ val OPTIONAL: typings.floraColossus.depTypesMod.DepType.OPTIONAL & Double = js.native
    
    @js.native
    sealed trait PROD
      extends StObject
         with DepType
    /* 0 */ val PROD: typings.floraColossus.depTypesMod.DepType.PROD & Double = js.native
    
    @js.native
    sealed trait ROOT
      extends StObject
         with DepType
    /* 4 */ val ROOT: typings.floraColossus.depTypesMod.DepType.ROOT & Double = js.native
  }
  
  @scala.inline
  def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = (^.asInstanceOf[js.Dynamic].applyDynamic("childDepType")(parentType.asInstanceOf[js.Any], childType.asInstanceOf[js.Any])).asInstanceOf[PROD | DEV | OPTIONAL | DEV_OPTIONAL]
  
  @scala.inline
  def depTypeGreater(newType: DepType, existing: DepType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("depTypeGreater")(newType.asInstanceOf[js.Any], existing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
