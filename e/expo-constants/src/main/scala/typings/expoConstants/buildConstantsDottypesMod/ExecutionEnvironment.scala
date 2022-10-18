package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExecutionEnvironment extends StObject
@JSImport("expo-constants/build/Constants.types", "ExecutionEnvironment")
@js.native
object ExecutionEnvironment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExecutionEnvironment & String] = js.native
  
  @js.native
  sealed trait Bare
    extends StObject
       with ExecutionEnvironment
  /* "bare" */ val Bare: typings.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment.Bare & String = js.native
  
  @js.native
  sealed trait Standalone
    extends StObject
       with ExecutionEnvironment
  /* "standalone" */ val Standalone: typings.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment.Standalone & String = js.native
  
  @js.native
  sealed trait StoreClient
    extends StObject
       with ExecutionEnvironment
  /* "storeClient" */ val StoreClient: typings.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment.StoreClient & String = js.native
}
