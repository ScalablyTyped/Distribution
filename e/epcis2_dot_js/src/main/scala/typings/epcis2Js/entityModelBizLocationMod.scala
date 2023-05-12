package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelBizLocationMod {
  
  @JSImport("epcis2.js/entity/model/BizLocation", JSImport.Default)
  @js.native
  open class default () extends BizLocation
  
  @js.native
  trait BizLocation
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Getter for the id property
      */
    def getId(): String = js.native
    
    /**
      * Set the id property
      * @return the bizLocation instance
      */
    def setId(id: String): BizLocation = js.native
  }
}
