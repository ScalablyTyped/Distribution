package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEpcisEpcisheaderMod {
  
  @JSImport("epcis2.js/entity/epcis/EPCISHeader", JSImport.Default)
  @js.native
  open class default () extends EPCISHeader
  
  @js.native
  trait EPCISHeader
    extends typings.epcis2Js.entityEntityMod.default {
    
    var epcisMasterData: typings.epcis2Js.entityEpcisEpcismasterdataMod.default = js.native
    
    /**
      * Getter for the epcisMasterData property
      * @return the epcisMasterData
      */
    def getEPCISMasterData(): typings.epcis2Js.entityEpcisEpcismasterdataMod.default = js.native
    
    /**
      * Set the epcisMasterData property
      * @return the epcisHeader instance
      */
    def setEPCISMasterData(epcisMasterData: typings.epcis2Js.entityEpcisEpcismasterdataMod.default): EPCISHeader = js.native
  }
}
