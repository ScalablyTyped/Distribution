package typings.ethereumjsCommon.distEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConsensusAlgorithm extends StObject
@JSImport("@ethereumjs/common/dist/enums", "ConsensusAlgorithm")
@js.native
object ConsensusAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConsensusAlgorithm & String] = js.native
  
  @js.native
  sealed trait Casper
    extends StObject
       with ConsensusAlgorithm
  /* "casper" */ val Casper: typings.ethereumjsCommon.distEnumsMod.ConsensusAlgorithm.Casper & String = js.native
  
  @js.native
  sealed trait Clique
    extends StObject
       with ConsensusAlgorithm
  /* "clique" */ val Clique: typings.ethereumjsCommon.distEnumsMod.ConsensusAlgorithm.Clique & String = js.native
  
  @js.native
  sealed trait Ethash
    extends StObject
       with ConsensusAlgorithm
  /* "ethash" */ val Ethash: typings.ethereumjsCommon.distEnumsMod.ConsensusAlgorithm.Ethash & String = js.native
}
