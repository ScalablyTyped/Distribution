package typings.floraColossus

import typings.floraColossus.depTypesMod.DepType.DEV
import typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL
import typings.floraColossus.depTypesMod.DepType.OPTIONAL
import typings.floraColossus.depTypesMod.DepType.PROD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depTypesMod {
  
  @js.native
  sealed trait DepType extends StObject
  @JSImport("flora-colossus/lib/depTypes", "DepType")
  @js.native
  object DepType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DepType with Double] = js.native
    
    @js.native
    sealed trait DEV extends DepType
    /* 1 */ val DEV: typings.floraColossus.depTypesMod.DepType.DEV with Double = js.native
    
    @js.native
    sealed trait DEV_OPTIONAL extends DepType
    /* 3 */ val DEV_OPTIONAL: typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL with Double = js.native
    
    @js.native
    sealed trait OPTIONAL extends DepType
    /* 2 */ val OPTIONAL: typings.floraColossus.depTypesMod.DepType.OPTIONAL with Double = js.native
    
    @js.native
    sealed trait PROD extends DepType
    /* 0 */ val PROD: typings.floraColossus.depTypesMod.DepType.PROD with Double = js.native
    
    @js.native
    sealed trait ROOT extends DepType
    /* 4 */ val ROOT: typings.floraColossus.depTypesMod.DepType.ROOT with Double = js.native
  }
  
  @JSImport("flora-colossus/lib/depTypes", "childDepType")
  @js.native
  def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = js.native
  
  @JSImport("flora-colossus/lib/depTypes", "depTypeGreater")
  @js.native
  def depTypeGreater(newType: DepType, existing: DepType): Boolean = js.native
}
