package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelBizTransactionElementMod {
  
  @JSImport("epcis2.js/entity/model/BizTransactionElement", JSImport.Default)
  @js.native
  open class default () extends BizTransactionElement
  
  @js.native
  trait BizTransactionElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    def addExtension(): scala.Nothing = js.native
    
    /**
      * Getter for the type property
      * @return the bizTransaction
      */
    def getBizTransaction(): String = js.native
    
    /**
      * Getter for the type property
      * @return the type
      */
    def getType(): String = js.native
    
    def removeExtension(): scala.Nothing = js.native
    
    /**
      * Set the bizTransaction property
      * @param bizTransaction
      * @return the bizTransaction instance
      */
    def setBizTransaction(bizTransaction: String): BizTransactionElement = js.native
    
    /**
      * Set the type property
      * @param type
      * @return the bizTransaction instance
      */
    def setType(`type`: String): BizTransactionElement = js.native
  }
}
