package typings.floraColossus

import org.scalablytyped.runtime.TopLevel
import typings.floraColossus.depTypesMod.DepType.DEV
import typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL
import typings.floraColossus.depTypesMod.DepType.OPTIONAL
import typings.floraColossus.depTypesMod.DepType.PROD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flora-colossus/lib/depTypes", JSImport.Namespace)
@js.native
object depTypesMod extends js.Object {
  
  def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = js.native
  
  def depTypeGreater(newType: DepType, existing: DepType): Boolean = js.native
  
  @js.native
  sealed trait DepType extends js.Object
  @js.native
  object DepType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DepType with Double] = js.native
    
    @js.native
    sealed trait DEV extends DepType
    /* 1 */ @js.native
    object DEV extends TopLevel[DEV with Double]
    
    @js.native
    sealed trait DEV_OPTIONAL extends DepType
    /* 3 */ @js.native
    object DEV_OPTIONAL extends TopLevel[DEV_OPTIONAL with Double]
    
    @js.native
    sealed trait OPTIONAL extends DepType
    /* 2 */ @js.native
    object OPTIONAL extends TopLevel[OPTIONAL with Double]
    
    @js.native
    sealed trait PROD extends DepType
    /* 0 */ @js.native
    object PROD extends TopLevel[PROD with Double]
    
    @js.native
    sealed trait ROOT extends DepType
    /* 4 */ @js.native
    object ROOT extends TopLevel[ROOT with Double]
  }
}
